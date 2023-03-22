package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.ValueObject;

public enum CourseState implements ValueObject {
    CREATED,
    OPEN,
    WAITING,
    OCCURING,
    CANCELED,
    DONE;

}
