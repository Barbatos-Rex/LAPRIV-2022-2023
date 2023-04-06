package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.course.domain.Course;
import barbatos_rex1.laprivcore.personal_info.domain.Profile;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import lombok.SneakyThrows;

import java.util.Date;
import java.util.List;

public class UserProxi {

    public static final int UPDATE_THRESHOLD = 5 * 60 * 1000;
    private User cache;

    private UserDTO dtoInfo;

    private UserRepository repo;

    private Date lastAccess;

    public UserProxi(UserDTO user, UserRepository userRepository) {
        dtoInfo = user;
        repo = userRepository;
        lastAccess = new Date();
    }

    private void updateCache() {
        cache = repo.findById(StringId.from(dtoInfo.id)).orElse(null);
        lastAccess = new Date();
    }


    public StringId getId() {
        return StringId.from(dtoInfo.id);
    }


    @SneakyThrows
    public Email getEmail() {
        return Email.from(dtoInfo.email);
    }


    @SneakyThrows
    public Name getShortName() {
        return Name.from(dtoInfo.shortName);
    }


    @SneakyThrows
    public FullName getFullName() {
        return FullName.from(dtoInfo.fullName);
    }


    @SneakyThrows
    public Password getPassword() {
        accessProxi();
        return cache.getPassword();
    }

    private void accessProxi() throws BuisnessRuleViolationException {
        if (cache == null) {
            updateCache();
        }
        if (cache == null || needsUpdate()) {
            throw new BuisnessRuleViolationException(String.format("Do user with id \"%s\"!", getId()));
        }
    }

    private boolean needsUpdate() {
        return new Date().getTime() - lastAccess.getTime() > UPDATE_THRESHOLD;
    }


    public Role getRole() {
        return dtoInfo.role;
    }


    public Status getStatus() {
        return dtoInfo.status;
    }


    @SneakyThrows
    public Profile getProfile() {
        accessProxi();
        return cache.getProfile();
    }


    @SneakyThrows
    public List<Course> getAccessibleCourses() {
        accessProxi();
        return cache.getAccessibleCourses();
    }


    public boolean enableUser() {
        return false;
    }


    public boolean disableUser() {
        return false;
    }

    @SneakyThrows
    public User getProxi() {
        accessProxi();
        return cache;
    }
}
