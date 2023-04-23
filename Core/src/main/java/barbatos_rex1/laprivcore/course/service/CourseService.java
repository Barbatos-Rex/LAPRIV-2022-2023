package barbatos_rex1.laprivcore.course.service;

import barbatos_rex1.laprivcore.course.domain.*;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.utils.Validations;
import barbatos_rex1.laprivcore.user.domain.User;
import barbatos_rex1.laprivcore.user.domain.UserRepository;
import barbatos_rex1.laprivcore.user.domain.UserService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

@Service
@AllArgsConstructor
public class CourseService implements barbatos_rex1.laprivcore.course.domain.CourseService {

    private CourseRepository repo;
    private UserService userService;
    private UserRepository userRepo;
    private CourseMapper mapper;


    @SneakyThrows
    @Override
    public Optional<CourseDTO> createCourse(CourseDTO course) {
        course.state = CourseState.CREATED;
        var c = mapper.toDomain(course);
        c.initialize();
        var result = repo.save(c);
        if (result == null) {
            return Optional.empty();
        }
        return Optional.of(mapper.toDTO(result));
    }


    @SneakyThrows
    private Optional<CourseDTO> manipulateCourseState(Function<Course, Void> manipulation, String courseCode) { // Functional Programing polymorfism
        var c = repo.findById(Code.from(courseCode));

        if (c.isEmpty()) {
            throw new BuisnessRuleViolationException("There is not a course with such code!");
        }
        var course = c.get();
        manipulation.apply(course);
        repo.save(course);
        return Optional.of(mapper.toDTO(course));
    }

    @Override
    public Optional<CourseDTO> openEnrollments(String courseCode) {
        return manipulateCourseState(course -> {
            course.openEnrollments();
            return null;
        }, courseCode);
    }

    @Override
    public Optional<CourseDTO> closeEnrollments(String courseCode) {
        return manipulateCourseState(course -> {
            course.closeEnrollments();
            return null;
        }, courseCode);
    }

    @Override
    public Optional<CourseDTO> openCourse(String courseCode) {
        return manipulateCourseState(course -> {
            course.openCourse();
            return null;
        }, courseCode);
    }

    @Override
    public Optional<CourseDTO> closeCourse(String courseCode) {
        return manipulateCourseState(course -> {
            course.closeCourse();
            return null;
        }, courseCode);
    }

    @SneakyThrows
    @Override
    public Optional<CourseDTO> setResponsibleTeacher(String courseCode, String teacherId, Option option) {
        Optional<Course> course = repo.findById(Code.from(courseCode));
        if (course.isEmpty()) {
            throw new BuisnessRuleViolationException(String.format("No course with code %s", courseCode));
        }
        Optional<User> user = userRepo.findById(StringId.from(teacherId));
        if (user.isEmpty()) {
            throw new BuisnessRuleViolationException(String.format("No user with id %s", teacherId));
        }

        if (course.get().getAuxilaryTeachers().getAuxilaryTeachers().contains(user.get())) {
            throw new BuisnessRuleViolationException("Teacher in question is an auxilary teacher!");
        }

        if (option == Option.ADD) {
            course.get().assignResponsibleTeacher(user.get());
        } else {
            course.get().replaceResponsibleTeacher(user.get());
        }
        Course c = repo.save(course.get());
        if (c == null) {
            return Optional.empty();
        }
        return Optional.of(mapper.toDTO(c));
    }

    @SneakyThrows
    @Override
    public Optional<CourseDTO> addTeacher(String courseCode, String teacherId) {

        Optional<Course> course = repo.findById(Code.from(courseCode));
        if (course.isEmpty()) {
            throw new BuisnessRuleViolationException(String.format("No course with code %s", courseCode));
        }
        Optional<User> user = userRepo.findById(StringId.from(teacherId));
        if (user.isEmpty()) {
            throw new BuisnessRuleViolationException(String.format("No user with id %s", teacherId));
        }
        if (course.get().getAuxilaryTeachers() == null) {
            throw new BuisnessRuleViolationException("Error");
        }
        try {
            if (course.get().getResponsibleTeacher() != null) {
                Validations.isFalse(course.get().getResponsibleTeacher().getId().equals(user.get().getId()));
            }
        } catch (Exception e) {
            throw new BuisnessRuleViolationException("Teacher in question is already responsible for this course!", e);
        }
        course.get().getAuxilaryTeachers().add(user.get());
        Course c = repo.save(course.get());
        if (c == null) {
            return Optional.empty();
        }
        return Optional.of(mapper.toDTO(c));
    }

    @Override
    @SneakyThrows
    public Optional<CourseDTO> requestEnrollment(String courseCode, String userId) {
        Optional<Course> c = repo.findById(Code.from(courseCode));
        if (c.isEmpty()) {
            throw new BuisnessRuleViolationException("There is not a course with such code!");
        }

        var u = userRepo.findById(StringId.from(userId));
        if (u.isEmpty()) {
            throw new BuisnessRuleViolationException("There is no user with such id!");
        }

        if (!c.get().getRequestedEnrollments().add(u.get())) {
            throw new BuisnessRuleViolationException("User already requested enrollment in a course!");
        }

        Course course = repo.save(c.get());
        if (course == null) {
            return Optional.empty();
        }

        return Optional.of(mapper.toDTO(course));

    }

    @Override
    public List<CourseDTO> courses() {
        return repo.findAll().stream().map(c -> mapper.toDTO(c)).toList(); // Functional Programing for the win
    }

    @Override
    public Optional<CourseDTO> course(String courseId) {
        Optional<Course> result = repo.findById(Code.from(courseId));
        if (result.isEmpty()) {
            return Optional.empty();
        }
        return result.map(mapper::toDTO);
    }


    @Override
    public List<BuisnessRuleViolationException> bulkEnrollment(InputStream stream) {
        Scanner sc = new Scanner(stream);
        //Skip header
        sc.nextLine();
        int lineCounter = 1;
        List<BuisnessRuleViolationException> errors = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] components = line.split(",");
            String userId = components[0];
            Optional<User> user;
            try {
                user = userRepo.findById(StringId.from(userId));
                if (user.isEmpty()) {
                    throw new BuisnessRuleViolationException(String.format("There is no user with such id (%s)!", userId));
                }
            } catch (Exception e) {
                errors.add(new BuisnessRuleViolationException(String.format("Error while parsing user id on line %d, ignoring line", lineCounter), e));
                continue;
            }
            for (int i = 1; i < components.length; i++) {
                String courseCode = components[i];
                try {
                    Optional<Course> course = repo.findById(Code.from(courseCode));
                    if (course.isEmpty()) {
                        throw new BuisnessRuleViolationException(String.format("There is no Course with code %s!", courseCode));
                    }
                    course.get().getRequestedEnrollments().remove(user.get());
                    course.get().getEnrolledStudents().add(user.get());
                    repo.save(course.get());
                } catch (Exception e) {
                    errors.add(new BuisnessRuleViolationException(String.format("Could not find Course with code %s, ignoring entry %d on line %d", i, lineCounter), e));
                }
            }
            lineCounter++;
        }
        return errors;
    }
}
