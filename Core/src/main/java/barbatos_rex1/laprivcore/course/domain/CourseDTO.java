package barbatos_rex1.laprivcore.course.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    public String code;
    public int maxCapacity;
    public int minCapacity;
    public String title;
    public String state;
}
