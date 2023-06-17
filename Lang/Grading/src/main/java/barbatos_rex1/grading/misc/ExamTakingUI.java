package barbatos_rex1.grading.misc;

import barbatos_rex1.exam.factory.Exam;
import barbatos_rex1.exam.factory.Section;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.questions.*;
import barbatos_rex1.grading.primitive.GradableQuestion;
import barbatos_rex1.grading.primitive.questions.*;

import java.util.*;
import java.util.stream.Collectors;

public class ExamTakingUI {
    private Exam exam;
    private Scanner sc = new Scanner(System.in);

    public ExamTakingUI(Exam exam) {
        this.exam = exam;
    }


    private void waitInput() {
        System.out.print("Press ENTER to continue...");
        sc.nextLine();
    }

    private void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public void showHeader() {
        System.out.println("============ EXAM TAKING ============");
        System.out.println("Title: " + exam.getTitle());
        System.out.println("Grading: " + exam.getHeader().getGrading());
        System.out.println("Feedback: " + exam.getHeader().getFeedback());
        System.out.println("\n" + exam.getHeader().getDescription());
        waitInput();
        clearConsole();
    }

    public List<GradableQuestion> executeExam() {
        List<Section> sections = exam.getSections();
        List<GradableQuestion> gradableQuestions = new ArrayList<>();
        Collections.shuffle(sections);
        for (Section section : sections) {
            gradableQuestions.addAll(executeSection(section));
        }

    }


    private void showSectionHeader(Section section) {
        System.out.println("============ SECTION ============");
        System.out.println(section.getDescription());
        System.out.println("\n");
        System.out.println("Difficulty: " + section.getDificulty());
        waitInput();
        clearConsole();
    }

    private List<GradableQuestion> executeSection(Section section) {
        List<Question> questions = section.getQuestions();
        Collections.shuffle(questions);
        List<GradableQuestion> gradableQuestions = new ArrayList<>();
        for (Question q : questions) {
            GradableQuestion question = showQuestion(q);
            gradableQuestions.add(question);
        }
        return gradableQuestions;
    }

    private GradableQuestion showQuestion(Question q) {
        switch (q.getCode()) {
            case MATCHING -> showMatchingQuestion(((Matching) q));
            case NUMERICAL -> showNumericalQuestion(((Numerical) q));
            case TRUE_FALSE -> showTrueFalseQuestion(((TrueFalse) q));
            case SHORT_AWNSER -> showShwortAwnserQuestion(((ShortAwnser) q));
            case MISSING_WORDS -> showMissingWordsChoice(((MissingWords) q));
            case MULTIPLE_CHOICE -> showMultipleChoice(((MultipleChoice) q));
        }
        return null;
    }


    private GradableMatchingQuestion showMatchingQuestion(Matching question) {
        System.out.println(question.getPrompt());
        Map<Integer, Integer> awnsers = new TreeMap<>(Integer::compareTo);
        String prompt = "";
        Map<Integer, List<Matching.MatchingUnit>> map = new HashMap<>();
        do {

            System.out.println(question.getPrompt());
            System.out.println();

            for (Matching.MatchingUnit u : question.getQuestions()) {
                if (!map.containsKey(u.getIid())) {
                    map.put(u.getIid(), new ArrayList<>());
                }
                map.get(u.getIid()).add(u);
            }
            for (Matching.MatchingUnit u : question.getAwnsers()) {
                if (!map.containsKey(u.getIid())) {
                    map.put(u.getIid(), new ArrayList<>());
                }
                map.get(u.getIid()).add(u);
            }

            for (Map.Entry<Integer, List<Matching.MatchingUnit>> entry : map.entrySet()) {
                System.out.printf("%d: %10s %30s | %-30s", entry.getKey(), "", entry.getValue().get(0).getPrompt(), entry.getValue().get(1).getPrompt());
            }

            System.out.println("\nAnswers:");

            for (Map.Entry<Integer, Integer> entry : awnsers.entrySet()) {
                System.out.printf("%d : %d");
            }

            System.out.println();
            System.out.println("Leave blank to exit");
            System.out.print("> ");
            prompt = sc.nextLine();

        } while (prompt.isBlank());

        Map<GradableMatchingQuestion.MatchingUnit, GradableMatchingQuestion.MatchingUnit> matchingMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> e : awnsers.entrySet()) {
            var mu1 = map.get(e.getKey()).get(0);
            var mu2 = map.get(e.getValue()).get(1);
            matchingMap.put(new GradableMatchingQuestion.MatchingUnit(mu1.getIid(), mu1.getPrompt()),
                    new GradableMatchingQuestion.MatchingUnit(mu2.getIid(), mu2.getPrompt()));
        }

        return new GradableMatchingQuestion(question.getIdCode(), question.getPrompt(), 0, 0, 0,
                new HashSet<>(question.getQuestions().stream().map(q -> new GradableMatchingQuestion.MatchingUnit(q.getIid(), q.getPrompt())).toList()),
                new HashSet<>(question.getAwnsers().stream().map(q -> new GradableMatchingQuestion.MatchingUnit(q.getIid(), q.getPrompt())).toList()),
                matchingMap);
    }

    private GradableNumericalQuestion showNumericalQuestion(Numerical question) {
        System.out.println(question.getPrompt());
        System.out.println();
        int awnser = -1;
        do {
            System.out.print("> ");
            String s = sc.nextLine();
            try {
                awnser = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                clearConsole();
            }
        } while (true);
        return new GradableNumericalQuestion(question.getIdCode(), question.getPrompt(), 0, 0, 0, awnser, 0, 0, 0);
    }

    private GradableTrueFalseQuestion showTrueFalseQuestion(TrueFalse question) {
        System.out.println(question.getPrompt());
        System.out.println();
        boolean awnser = false;
        do {
            System.out.print("> ");
            String s = sc.nextLine();
            try {
                awnser = Boolean.parseBoolean(s);
                break;
            } catch (RuntimeException e) {
                clearConsole();
            }
        } while (true);
        return new GradableTrueFalseQuestion(question.getIdCode(), question.getPrompt(), 0, 0, 0, awnser, true);
    }

    private GradableShortAwnserQuestion showShwortAwnserQuestion(ShortAwnser question) {
        System.out.println(question.getPrompt());
        System.out.println();
        String awnser = "";
        do {
            System.out.print("> ");
            awnser = sc.nextLine();
            if (!awnser.isBlank()) {
                break;
            }
            clearConsole();
        } while (true);
        return new GradableShortAwnserQuestion(question.getIdCode(), question.getPrompt(), 0, 0, 0, awnser, "", "");
    }

    private GradableMultipleChoiceQuestion showMultipleChoice(MultipleChoice question) {
        int keys = -1;
        do {
            System.out.println(question.getPrompt());
            System.out.println();
            List<MultipleChoice.MultipleUnit> options = question.getOptions();
            int key = 1;
            for (MultipleChoice.MultipleUnit option : options) {
                System.out.println(key + " : " + option.getPrompt());
                key++;
            }

            System.out.print("> ");
            String aws = sc.nextLine();
            try {
                int k = Integer.parseInt(aws);
                var op = options.get(k - 1);
                return new GradableMultipleChoiceQuestion(question.getIdCode(), question.getPrompt(), 0, 0, 0,
                        question.getOptions().stream().map(q -> new GradableMultipleChoiceQuestion.MultipleUnit(q.getPrompt(), q.isValid())).toList()
                        , new GradableMultipleChoiceQuestion.MultipleUnit(op.getPrompt(), op.isValid()));
            } catch (NumberFormatException e) {
                clearConsole();
            }
        } while (true);
    }

    private GradableMissingWordsQuestion showMissingWordsChoice(MissingWords question) {
        String text = question.getText();
        String[] spplited = text.split("@");
        Map<Integer, Integer> connections = new HashMap<>();
        Iterator<String> l = Arrays.asList(spplited).iterator();
        StringBuilder sb = new StringBuilder();
        do {
            System.out.println(question.getPrompt());
            while (l.hasNext()) {
                sb.append(l.next()).append("__").append(l.next());
                if (l.hasNext()) {
                    sb.append(l.next());
                }
            }
            System.out.println(sb);
            System.out.println();
            System.out.println("Keys:");
            for (Map.Entry<Integer, String> integerStringEntry : question.getKeys().entrySet()) {
                System.out.printf("%d : %s\n", integerStringEntry.getKey(), integerStringEntry.getValue());
            }
            System.out.println("Answers: ");
            for (Map.Entry<Integer, Integer> entry : connections.entrySet()) {
                System.out.printf("%d : %s\n", entry.getKey(), question.getKeys().get(entry.getKey()));
            }
            System.out.println();
            System.out.print("(position:option)> ");
            String aws = sc.nextLine();
            String[] split = aws.split(":");
            if (split.length != 2) {
                System.out.println("Try again!");
                continue;
            }
            int pos = Integer.parseInt(split[0]);
            int key = Integer.parseInt(split[1]);
            if (question.getKeys().containsKey(key)) {
                System.out.println("Try Again!");
                continue;
            }
            if(pos <0 || pos> spplited.length/3){
                System.out.println("Try Again!");
                continue;
            }
            connections.put(pos,key);
            break;
        } while (true);

        Map<Integer,String> conversion = new HashMap<>();
        for (Map.Entry<Integer,Integer> e : connections.entrySet()){
            conversion.put(e.getKey(),question.getKeys().get(e.getKey()));
        }

        return new GradableMissingWordsQuestion(question.getIdCode(),question.getPrompt(),0,0,0,question.getKeys(),connections, question.getText());
    }


}
