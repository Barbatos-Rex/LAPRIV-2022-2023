package barbatos_rex1.grading.primitive;

import static barbatos_rex1.grading.utils.Computation.Fraction;
import java.util.List;

public class GradableExam {
    private List<GradableQuestion> questions;



    public Fraction grading(){
        long sum = 0L;
        long maxPoints=0L;
        for (GradableQuestion q : questions){
            sum+=q.getAwardedPoints();
            maxPoints+=q.getMaxPoints();
        }
        return new Fraction(sum,maxPoints);

    }






}
