package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {


    public CourseDTO toDTO(Course domain) {
        return new CourseDTO(domain.getUniqueCode().getCode(),
                domain.getMaxCapacity().getCapacity(), domain.getMinCapacity().getCapacity(),
                domain.getTitle().getTitle(), domain.getState());
    }

    @SneakyThrows
    public Course toDomain(CourseDTO dto) {
        Course.CourseBuilder builder = new Course.CourseBuilder();
        builder.uniqueCode(Code.from(dto.code)).maxCapacity(Capacity.from(dto.maxCapacity)).
                minCapacity(Capacity.from(dto.minCapacity)).title(Title.from(dto.title)).state(dto.state);
        return builder.build();
    }


}
