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

import java.util.List;
import java.util.Optional;
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

        try {
            Validations.isFalse(course.get().getResponsibleTeacher().getId().equals(user.get().getId()));
        } catch (Exception e) {
            throw new BuisnessRuleViolationException("Teacher in question is already responsible for this course!",e);
        }

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
    public Optional<CourseDTO> bulkEnrollment(String filePath) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
