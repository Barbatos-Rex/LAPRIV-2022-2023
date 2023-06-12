//package barbatos_rex1.exam.struct.simple.listener;
//
//import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarBaseListener;
//import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
//import barbatos_rex1.exam.exception.CompilerException;
//import barbatos_rex1.exam.primitive.ExamPrototype;
//import barbatos_rex1.exam.primitive.Header;
//import barbatos_rex1.exam.primitive.Pool;
//import barbatos_rex1.exam.primitive.PrototypeSection;
//import lombok.Getter;
//import lombok.SneakyThrows;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class StartListener extends SimpleExamGrammarBaseListener {
//    private Map<String,Pool> pools=new HashMap<>();
//    private Map<String,PrototypeSection> sections=new HashMap<>();
//
//    private Set<String> enteringSections = new HashSet<>();
//    @Getter
//    private ExamPrototype exam=null;
//    private int maxNumberQuestions=-1;
//
//    private QuestionListener qListener=new QuestionListener();
//
//    @Override
//    @SneakyThrows
//    public void enterStart(SimpleExamGrammarParser.StartContext ctx) {
//        for (SimpleExamGrammarParser.PoolContext poolContext : ctx.pool()) {
//            qListener.enterPool(poolContext);
//            Pool p = qListener.getPool();
//            if(pools.containsKey(p.getName())){
//                throw new CompilerException("Pool with that name already registered",0,0);
//            }
//            pools.put(p.getName(),p);
//        }
//        ctx.section().forEach(this::enterSection);
//        enterExam(ctx.exam());
//    }
//
//    @SneakyThrows
//    @Override
//    public void enterSection(SimpleExamGrammarParser.SectionContext ctx) {
//        String id = ctx.id.getText();
//        String desc = ctx.desc.getText();
//        int maxDifficulty = Integer.parseInt(ctx.mDif.getText());
//        String poolName = ctx.npool.getText();
//
//        enterSection_maximum_number_of_questions(ctx.section_maximum_number_of_questions());
//
//        if (!pools.containsKey(poolName)){
//            throw new CompilerException("No pool with such id!",ctx.npool.getLine(),ctx.npool.getCharPositionInLine());
//        }
//
//
//        PrototypeSection ps = new PrototypeSection(id,desc,maxDifficulty,maxNumberQuestions,pools.get(poolName));
//        if(sections.containsKey(id)){
//            throw new CompilerException("Section with such id already registered!",ctx.id.getLine(),ctx.id.getStartIndex());
//        }
//        sections.put(id,ps);
//    }
//
//    @Override
//    public void enterSection_maximum_number_of_questions(SimpleExamGrammarParser.Section_maximum_number_of_questionsContext ctx) {
//        try {
//            this.maxNumberQuestions = Integer.getInteger(ctx.INT().getText());
//        } catch (Exception e) {
//            this.maxNumberQuestions=-1;
//        }
//    }
//
//    @SneakyThrows
//    @Override
//    public void enterExam(SimpleExamGrammarParser.ExamContext ctx) {
//        String title = ctx.titl.getText();
//        String description = ctx.desc.getText();
//        String grading = ctx.g.getText();
//        String feedback = ctx.f.getText();
//        String id = ctx.fname.getText();
//
//        var optGrading = Header.HeaderType.fromString(grading);
//        var optFeedback = Header.HeaderType.fromString(feedback);
//
//        if (optGrading.isEmpty()) {
//            throw new CompilerException("Not a valid grading!",ctx.g.getLine(),ctx.g.getCharPositionInLine());
//        }
//        if (optFeedback.isEmpty()) {
//            throw new CompilerException("Not a valid grading!",ctx.f.getLine(),ctx.f.getCharPositionInLine());
//        }
//
//
//        enterSections_arr(ctx.sections_arr());
//
//        sections =sections.entrySet().stream().filter(e -> enteringSections.contains(e.getValue().getId())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//
//
//        this.exam= new ExamPrototype(id,title,new Header(description,optGrading.get(),optFeedback.get()),sections.values().stream().toList());
//    }
//
//    @Override
//    public void enterSections_arr(SimpleExamGrammarParser.Sections_arrContext ctx) {
//        enteringSections.add(ctx.STRING().getText().replace("\"",""));
//    }
//}
