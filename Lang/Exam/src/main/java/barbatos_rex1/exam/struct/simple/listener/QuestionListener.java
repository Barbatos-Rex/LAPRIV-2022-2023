//package barbatos_rex1.exam.struct.simple.listener;
//
//import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarBaseListener;
//import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
//import barbatos_rex1.exam.primitive.Pool;
//import barbatos_rex1.exam.primitive.Question;
//import barbatos_rex1.exam.primitive.questions.*;
//import lombok.Getter;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class QuestionListener extends SimpleExamGrammarBaseListener {
//
//    private List<Question> questions;
//    @Getter
//    private Pool pool;
//
//    private Set<Matching.MatchingUnit> matchingQuestions = new HashSet<>();
//    private Set<Matching.MatchingUnit> matchingAnswers = new HashSet<>();
//
//    private Set<MultipleChoice.MultipleUnit> multipleQuestions = new HashSet<>();
//    private boolean flag=false;
//
//    private Map<Integer,String> keys=new HashMap<>();
//
//    @Override
//    public void enterPool(SimpleExamGrammarParser.PoolContext ctx) {
//        questions=new ArrayList<>();
//        String poolName = ctx.STRING().getText();
//        enterPool_body(ctx.pool_body());
//        pool = new Pool(poolName, questions);
//    }
//
//    @Override
//    public void enterPool_body(SimpleExamGrammarParser.Pool_bodyContext ctx) {
//       if(ctx.pool_body()!=null) {
//           enterPool_body(ctx.pool_body());
//       }
//        enterPool_body_atomic(ctx.pool_body_atomic());
//    }
//
//    @Override
//    public void enterPool_body_atomic(SimpleExamGrammarParser.Pool_body_atomicContext ctx) {
//        if(ctx.matching()!=null){
//            enterMatching(ctx.matching());
//        }
//    }
//
//    @Override
//    public void enterMatching(SimpleExamGrammarParser.MatchingContext ctx) {
//        flag=false;
//        matchingQuestions=new HashSet<>();
//        this.enterMatching_map(ctx.ques);
//        flag=true;
//        matchingAnswers=new HashSet<>();
//        this.enterMatching_map(ctx.asnw);
//    }
//
//    @Override
//    public void exitMatching(SimpleExamGrammarParser.MatchingContext ctx) {
//        Matching m = new Matching(matchingQuestions.stream().toList(), matchingAnswers.stream().toList());
//        m.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
//        m.setPrompt(ctx.STRING().getText());
//        questions.add(m);
//        super.exitMatching(ctx);
//    }
//
//    @Override
//    public void enterMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx) {
//        if(flag){
//            matchingAnswers.add(new Matching.MatchingUnit(Integer.parseInt(ctx.INT().getText()),ctx.STRING().getText()));
//        }else{
//            matchingQuestions.add(new Matching.MatchingUnit(Integer.parseInt(ctx.INT().getText()),ctx.STRING().getText()));
//        }
//    }
//
//    @Override
//    public void enterMultiple(SimpleExamGrammarParser.MultipleContext ctx) {
//        multipleQuestions=new HashSet<>();
//        this.enterMultiple_map(ctx.multiple_map());
//        enterMultiple_map(ctx.multiple_map());
//    }
//
//    @Override
//    public void exitMultiple(SimpleExamGrammarParser.MultipleContext ctx) {
//        MultipleChoice m = new MultipleChoice(multipleQuestions.stream().toList());
//        m.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
//        m.setPrompt(ctx.STRING().getText());
//        questions.add(m);
//    }
//    @Override
//    public void enterMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx) {
//        multipleQuestions.add(new MultipleChoice.MultipleUnit(ctx.STRING().getText(),Boolean.parseBoolean(ctx.BOOLEAN().getText())));
//    }
//
//    @Override
//    public void enterShort(SimpleExamGrammarParser.ShortContext ctx) {
//        ShortAwnser s = new ShortAwnser(ctx.answer.getText());
//        s.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
//        s.setPrompt(ctx.prompt.getText());
//        questions.add(s);
//    }
//    @Override
//    public void enterMissing(SimpleExamGrammarParser.MissingContext ctx) {
//        keys=new HashMap<>();
//        enterKey_map(ctx.key_map());
//    }
//
//    @Override
//    public void exitMissing(SimpleExamGrammarParser.MissingContext ctx) {
//        MissingWords mw = new MissingWords(keys,ctx.text.getText());
//        mw.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
//        mw.setPrompt(ctx.prompt.getText());
//        questions.add(mw);
//    }
//    @Override
//    public void enterKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx) {
//        keys.put(Integer.parseInt(ctx.INT().getText()),ctx.STRING().getText());
//    }
//    @Override
//    public void enterNum(SimpleExamGrammarParser.NumContext ctx) {
//        Numerical n = new Numerical(Double.parseDouble(ctx.REAL().getText()));
//        n.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
//        n.setPrompt(ctx.STRING().getText());
//        questions.add(n);
//    }
//    @Override
//    public void enterTrue_false(SimpleExamGrammarParser.True_falseContext ctx) {
//        TrueFalse tf = new TrueFalse(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
//        tf.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
//        tf.setPrompt(ctx.STRING().getText());
//        questions.add(tf);
//    }
//
//
//}
