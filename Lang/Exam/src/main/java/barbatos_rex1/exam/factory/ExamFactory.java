package barbatos_rex1.exam.factory;

import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.primitive.PrototypeSection;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ExamFactory {

    private ExamPrototype examPrototype;


    public Exam generateNewExam() {
        var protoSections = examPrototype.getSections();
        List<Section> sections = new ArrayList<>();
        for (PrototypeSection protoSection :
                protoSections) {
            Section section = protoSection.generateSection();
            sections.add(section);
        }
        return new Exam(examPrototype.getTitle(),examPrototype.getHeader(),sections);
    }


}
