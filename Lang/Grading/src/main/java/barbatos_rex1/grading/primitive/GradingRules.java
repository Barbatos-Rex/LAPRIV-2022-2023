package barbatos_rex1.grading.primitive;

public interface GradingRules<T extends GradableQuestion> {

    String id();

    long grade(T question);

    long maxGrade();


}
