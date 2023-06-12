// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/grading\SimpleGradingGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.grading.antlr4.lang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleGradingGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, REAL=2, INT=3, GRADING_PRESENTATION=4, ACCEPT=5, ALL=6, AND=7, 
		ARE=8, AS=9, AWARD=10, ANSWERS=11, BETWEEN=12, BOUNDARY=13, CORRECT=14, 
		DEFINE=15, EXAM=16, FOR=17, FROM=18, GRADING=19, IF=20, IN=21, IMPORT=22, 
		MAY=23, MATCHING=24, MISSING_WORDS=25, MULTIPLE_CHOICE=26, NUMERICAL=27, 
		OVERRIDE=28, PRESENT=29, QUESTION=30, REGEX=31, SHORT_AWNSER=32, THEN=33, 
		TRUE_FALSE=34, WITH=35, WRONG=36, COMA=37, MARK=38, DASH=39, COL=40, WS=41;
	public static final int
		RULE_start = 0, RULE_grade_presentation = 1, RULE_question = 2, RULE_questions = 3, 
		RULE_matching = 4, RULE_parcial_awardal = 5, RULE_parcial_awardal_atomic = 6, 
		RULE_multiple = 7, RULE_short = 8, RULE_attach_text_options = 9, RULE_attach_text_options_atomic = 10, 
		RULE_numerical = 11, RULE_attach_real_options = 12, RULE_attach_real_options_atomic = 13, 
		RULE_missing = 14, RULE_true_false = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "grade_presentation", "question", "questions", "matching", "parcial_awardal", 
			"parcial_awardal_atomic", "multiple", "short", "attach_text_options", 
			"attach_text_options_atomic", "numerical", "attach_real_options", "attach_real_options_atomic", 
			"missing", "true_false"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'accept'", "'all'", "'and'", "'are'", 
			"'as'", "'award'", "'answers'", "'between'", "'boundary'", "'correct'", 
			"'define'", "'exam'", "'for'", "'from'", "'grading'", "'if'", "'in'", 
			"'import'", "'may'", "'matching'", "'missing words'", "'multiple choice'", 
			"'numerical'", "'override'", "'present'", "'question'", "'regex'", "'short answer'", 
			"'then'", "'true or false'", "'with'", "'wrong'", "','", "'.'", "'->'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "REAL", "INT", "GRADING_PRESENTATION", "ACCEPT", "ALL", 
			"AND", "ARE", "AS", "AWARD", "ANSWERS", "BETWEEN", "BOUNDARY", "CORRECT", 
			"DEFINE", "EXAM", "FOR", "FROM", "GRADING", "IF", "IN", "IMPORT", "MAY", 
			"MATCHING", "MISSING_WORDS", "MULTIPLE_CHOICE", "NUMERICAL", "OVERRIDE", 
			"PRESENT", "QUESTION", "REGEX", "SHORT_AWNSER", "THEN", "TRUE_FALSE", 
			"WITH", "WRONG", "COMA", "MARK", "DASH", "COL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleGradingGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleGradingGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public QuestionsContext questions() {
			return getRuleContext(QuestionsContext.class,0);
		}
		public Grade_presentationContext grade_presentation() {
			return getRuleContext(Grade_presentationContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			questions();
			setState(33);
			grade_presentation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grade_presentationContext extends ParserRuleContext {
		public TerminalNode PRESENT() { return getToken(SimpleGradingGrammarParser.PRESENT, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode IN() { return getToken(SimpleGradingGrammarParser.IN, 0); }
		public TerminalNode GRADING_PRESENTATION() { return getToken(SimpleGradingGrammarParser.GRADING_PRESENTATION, 0); }
		public TerminalNode MARK() { return getToken(SimpleGradingGrammarParser.MARK, 0); }
		public Grade_presentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grade_presentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterGrade_presentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitGrade_presentation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitGrade_presentation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grade_presentationContext grade_presentation() throws RecognitionException {
		Grade_presentationContext _localctx = new Grade_presentationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grade_presentation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(PRESENT);
			setState(36);
			match(GRADING);
			setState(37);
			match(IN);
			setState(38);
			match(GRADING_PRESENTATION);
			setState(39);
			match(MARK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public ShortContext short_() {
			return getRuleContext(ShortContext.class,0);
		}
		public NumericalContext numerical() {
			return getRuleContext(NumericalContext.class,0);
		}
		public MissingContext missing() {
			return getRuleContext(MissingContext.class,0);
		}
		public True_falseContext true_false() {
			return getRuleContext(True_falseContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				matching();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				multiple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				short_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				numerical();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				missing();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				true_false();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionsContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public QuestionsContext questions() {
			return getRuleContext(QuestionsContext.class,0);
		}
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitQuestions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_questions);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				question();
				setState(50);
				questions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				question();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchingContext extends ParserRuleContext {
		public Token maxPoints;
		public Token minPoints;
		public TerminalNode DEFINE() { return getToken(SimpleGradingGrammarParser.DEFINE, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode FOR() { return getToken(SimpleGradingGrammarParser.FOR, 0); }
		public TerminalNode MATCHING() { return getToken(SimpleGradingGrammarParser.MATCHING, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleGradingGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleGradingGrammarParser.STRING, 0); }
		public List<TerminalNode> MARK() { return getTokens(SimpleGradingGrammarParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(SimpleGradingGrammarParser.MARK, i);
		}
		public List<TerminalNode> IF() { return getTokens(SimpleGradingGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SimpleGradingGrammarParser.IF, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SimpleGradingGrammarParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SimpleGradingGrammarParser.ALL, i);
		}
		public List<TerminalNode> ARE() { return getTokens(SimpleGradingGrammarParser.ARE); }
		public TerminalNode ARE(int i) {
			return getToken(SimpleGradingGrammarParser.ARE, i);
		}
		public TerminalNode CORRECT() { return getToken(SimpleGradingGrammarParser.CORRECT, 0); }
		public TerminalNode THEN() { return getToken(SimpleGradingGrammarParser.THEN, 0); }
		public List<TerminalNode> AWARD() { return getTokens(SimpleGradingGrammarParser.AWARD); }
		public TerminalNode AWARD(int i) {
			return getToken(SimpleGradingGrammarParser.AWARD, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public Parcial_awardalContext parcial_awardal() {
			return getRuleContext(Parcial_awardalContext.class,0);
		}
		public TerminalNode WRONG() { return getToken(SimpleGradingGrammarParser.WRONG, 0); }
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(DEFINE);
			setState(56);
			match(GRADING);
			setState(57);
			match(FOR);
			setState(58);
			match(MATCHING);
			setState(59);
			match(QUESTION);
			setState(60);
			match(STRING);
			setState(61);
			match(MARK);
			setState(62);
			match(IF);
			setState(63);
			match(ALL);
			setState(64);
			match(ARE);
			setState(65);
			match(CORRECT);
			setState(66);
			match(THEN);
			setState(67);
			match(AWARD);
			setState(68);
			((MatchingContext)_localctx).maxPoints = match(INT);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(69);
				parcial_awardal();
				}
			}

			setState(72);
			match(MARK);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(73);
				match(IF);
				setState(74);
				match(ALL);
				setState(75);
				match(ARE);
				setState(76);
				match(WRONG);
				setState(77);
				match(AWARD);
				setState(78);
				((MatchingContext)_localctx).minPoints = match(INT);
				setState(79);
				match(MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parcial_awardalContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(SimpleGradingGrammarParser.COMA, 0); }
		public Parcial_awardal_atomicContext parcial_awardal_atomic() {
			return getRuleContext(Parcial_awardal_atomicContext.class,0);
		}
		public Parcial_awardalContext parcial_awardal() {
			return getRuleContext(Parcial_awardalContext.class,0);
		}
		public Parcial_awardalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcial_awardal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterParcial_awardal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitParcial_awardal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitParcial_awardal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcial_awardalContext parcial_awardal() throws RecognitionException {
		Parcial_awardalContext _localctx = new Parcial_awardalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parcial_awardal);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(COMA);
				setState(83);
				parcial_awardal_atomic();
				setState(84);
				parcial_awardal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(COMA);
				setState(87);
				parcial_awardal_atomic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parcial_awardal_atomicContext extends ParserRuleContext {
		public Token number;
		public Token points;
		public TerminalNode IF() { return getToken(SimpleGradingGrammarParser.IF, 0); }
		public TerminalNode ARE() { return getToken(SimpleGradingGrammarParser.ARE, 0); }
		public TerminalNode CORRECT() { return getToken(SimpleGradingGrammarParser.CORRECT, 0); }
		public TerminalNode THEN() { return getToken(SimpleGradingGrammarParser.THEN, 0); }
		public TerminalNode AWARD() { return getToken(SimpleGradingGrammarParser.AWARD, 0); }
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public Parcial_awardal_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcial_awardal_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterParcial_awardal_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitParcial_awardal_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitParcial_awardal_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcial_awardal_atomicContext parcial_awardal_atomic() throws RecognitionException {
		Parcial_awardal_atomicContext _localctx = new Parcial_awardal_atomicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parcial_awardal_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			((Parcial_awardal_atomicContext)_localctx).number = match(INT);
			setState(92);
			match(ARE);
			setState(93);
			match(CORRECT);
			setState(94);
			match(THEN);
			setState(95);
			match(AWARD);
			setState(96);
			((Parcial_awardal_atomicContext)_localctx).points = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleContext extends ParserRuleContext {
		public Token maxPoints;
		public Token minPoints;
		public TerminalNode DEFINE() { return getToken(SimpleGradingGrammarParser.DEFINE, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode FOR() { return getToken(SimpleGradingGrammarParser.FOR, 0); }
		public TerminalNode MULTIPLE_CHOICE() { return getToken(SimpleGradingGrammarParser.MULTIPLE_CHOICE, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleGradingGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleGradingGrammarParser.STRING, 0); }
		public List<TerminalNode> MARK() { return getTokens(SimpleGradingGrammarParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(SimpleGradingGrammarParser.MARK, i);
		}
		public List<TerminalNode> IF() { return getTokens(SimpleGradingGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SimpleGradingGrammarParser.IF, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SimpleGradingGrammarParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SimpleGradingGrammarParser.ALL, i);
		}
		public List<TerminalNode> ARE() { return getTokens(SimpleGradingGrammarParser.ARE); }
		public TerminalNode ARE(int i) {
			return getToken(SimpleGradingGrammarParser.ARE, i);
		}
		public TerminalNode CORRECT() { return getToken(SimpleGradingGrammarParser.CORRECT, 0); }
		public TerminalNode THEN() { return getToken(SimpleGradingGrammarParser.THEN, 0); }
		public List<TerminalNode> AWARD() { return getTokens(SimpleGradingGrammarParser.AWARD); }
		public TerminalNode AWARD(int i) {
			return getToken(SimpleGradingGrammarParser.AWARD, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public Parcial_awardalContext parcial_awardal() {
			return getRuleContext(Parcial_awardalContext.class,0);
		}
		public TerminalNode WRONG() { return getToken(SimpleGradingGrammarParser.WRONG, 0); }
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DEFINE);
			setState(99);
			match(GRADING);
			setState(100);
			match(FOR);
			setState(101);
			match(MULTIPLE_CHOICE);
			setState(102);
			match(QUESTION);
			setState(103);
			match(STRING);
			setState(104);
			match(MARK);
			setState(105);
			match(IF);
			setState(106);
			match(ALL);
			setState(107);
			match(ARE);
			setState(108);
			match(CORRECT);
			setState(109);
			match(THEN);
			setState(110);
			match(AWARD);
			setState(111);
			((MultipleContext)_localctx).maxPoints = match(INT);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(112);
				parcial_awardal();
				}
			}

			setState(115);
			match(MARK);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(116);
				match(IF);
				setState(117);
				match(ALL);
				setState(118);
				match(ARE);
				setState(119);
				match(WRONG);
				setState(120);
				match(AWARD);
				setState(121);
				((MultipleContext)_localctx).minPoints = match(INT);
				setState(122);
				match(MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortContext extends ParserRuleContext {
		public Token id;
		public Token regex;
		public Token maxPoints;
		public Token minPoints;
		public TerminalNode DEFINE() { return getToken(SimpleGradingGrammarParser.DEFINE, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode FOR() { return getToken(SimpleGradingGrammarParser.FOR, 0); }
		public TerminalNode SHORT_AWNSER() { return getToken(SimpleGradingGrammarParser.SHORT_AWNSER, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleGradingGrammarParser.QUESTION, 0); }
		public List<TerminalNode> MARK() { return getTokens(SimpleGradingGrammarParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(SimpleGradingGrammarParser.MARK, i);
		}
		public List<TerminalNode> IF() { return getTokens(SimpleGradingGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SimpleGradingGrammarParser.IF, i);
		}
		public List<TerminalNode> CORRECT() { return getTokens(SimpleGradingGrammarParser.CORRECT); }
		public TerminalNode CORRECT(int i) {
			return getToken(SimpleGradingGrammarParser.CORRECT, i);
		}
		public TerminalNode THEN() { return getToken(SimpleGradingGrammarParser.THEN, 0); }
		public List<TerminalNode> AWARD() { return getTokens(SimpleGradingGrammarParser.AWARD); }
		public TerminalNode AWARD(int i) {
			return getToken(SimpleGradingGrammarParser.AWARD, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SimpleGradingGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleGradingGrammarParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public TerminalNode MAY() { return getToken(SimpleGradingGrammarParser.MAY, 0); }
		public TerminalNode ACCEPT() { return getToken(SimpleGradingGrammarParser.ACCEPT, 0); }
		public TerminalNode COL() { return getToken(SimpleGradingGrammarParser.COL, 0); }
		public Attach_text_optionsContext attach_text_options() {
			return getRuleContext(Attach_text_optionsContext.class,0);
		}
		public TerminalNode AS() { return getToken(SimpleGradingGrammarParser.AS, 0); }
		public TerminalNode OVERRIDE() { return getToken(SimpleGradingGrammarParser.OVERRIDE, 0); }
		public TerminalNode ANSWERS() { return getToken(SimpleGradingGrammarParser.ANSWERS, 0); }
		public TerminalNode WITH() { return getToken(SimpleGradingGrammarParser.WITH, 0); }
		public TerminalNode REGEX() { return getToken(SimpleGradingGrammarParser.REGEX, 0); }
		public TerminalNode WRONG() { return getToken(SimpleGradingGrammarParser.WRONG, 0); }
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DEFINE);
			setState(126);
			match(GRADING);
			setState(127);
			match(FOR);
			setState(128);
			match(SHORT_AWNSER);
			setState(129);
			match(QUESTION);
			setState(130);
			((ShortContext)_localctx).id = match(STRING);
			setState(131);
			match(MARK);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAY) {
				{
				setState(132);
				match(MAY);
				setState(133);
				match(ACCEPT);
				setState(134);
				match(COL);
				setState(135);
				attach_text_options();
				setState(136);
				match(AS);
				setState(137);
				match(CORRECT);
				setState(138);
				match(MARK);
				}
			}

			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(142);
				match(OVERRIDE);
				setState(143);
				match(ANSWERS);
				setState(144);
				match(WITH);
				setState(145);
				match(REGEX);
				setState(146);
				((ShortContext)_localctx).regex = match(STRING);
				}
			}

			setState(149);
			match(IF);
			setState(150);
			match(CORRECT);
			setState(151);
			match(THEN);
			setState(152);
			match(AWARD);
			setState(153);
			((ShortContext)_localctx).maxPoints = match(INT);
			setState(154);
			match(MARK);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(155);
				match(IF);
				setState(156);
				match(WRONG);
				setState(157);
				match(AWARD);
				setState(158);
				((ShortContext)_localctx).minPoints = match(INT);
				setState(159);
				match(MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_text_optionsContext extends ParserRuleContext {
		public Attach_text_options_atomicContext attach_text_options_atomic() {
			return getRuleContext(Attach_text_options_atomicContext.class,0);
		}
		public Attach_text_optionsContext attach_text_options() {
			return getRuleContext(Attach_text_optionsContext.class,0);
		}
		public Attach_text_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_text_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterAttach_text_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitAttach_text_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitAttach_text_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_text_optionsContext attach_text_options() throws RecognitionException {
		Attach_text_optionsContext _localctx = new Attach_text_optionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attach_text_options);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				attach_text_options_atomic();
				setState(163);
				attach_text_options();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				attach_text_options_atomic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_text_options_atomicContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(SimpleGradingGrammarParser.DASH, 0); }
		public TerminalNode STRING() { return getToken(SimpleGradingGrammarParser.STRING, 0); }
		public Attach_text_options_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_text_options_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterAttach_text_options_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitAttach_text_options_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitAttach_text_options_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_text_options_atomicContext attach_text_options_atomic() throws RecognitionException {
		Attach_text_options_atomicContext _localctx = new Attach_text_options_atomicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attach_text_options_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DASH);
			setState(169);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericalContext extends ParserRuleContext {
		public Token lv;
		public Token hV;
		public Token maxPoints;
		public Token minPoints;
		public TerminalNode DEFINE() { return getToken(SimpleGradingGrammarParser.DEFINE, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode FOR() { return getToken(SimpleGradingGrammarParser.FOR, 0); }
		public TerminalNode NUMERICAL() { return getToken(SimpleGradingGrammarParser.NUMERICAL, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleGradingGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleGradingGrammarParser.STRING, 0); }
		public List<TerminalNode> MARK() { return getTokens(SimpleGradingGrammarParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(SimpleGradingGrammarParser.MARK, i);
		}
		public List<TerminalNode> IF() { return getTokens(SimpleGradingGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SimpleGradingGrammarParser.IF, i);
		}
		public List<TerminalNode> CORRECT() { return getTokens(SimpleGradingGrammarParser.CORRECT); }
		public TerminalNode CORRECT(int i) {
			return getToken(SimpleGradingGrammarParser.CORRECT, i);
		}
		public TerminalNode THEN() { return getToken(SimpleGradingGrammarParser.THEN, 0); }
		public List<TerminalNode> AWARD() { return getTokens(SimpleGradingGrammarParser.AWARD); }
		public TerminalNode AWARD(int i) {
			return getToken(SimpleGradingGrammarParser.AWARD, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public TerminalNode MAY() { return getToken(SimpleGradingGrammarParser.MAY, 0); }
		public TerminalNode ACCEPT() { return getToken(SimpleGradingGrammarParser.ACCEPT, 0); }
		public TerminalNode COL() { return getToken(SimpleGradingGrammarParser.COL, 0); }
		public Attach_real_optionsContext attach_real_options() {
			return getRuleContext(Attach_real_optionsContext.class,0);
		}
		public TerminalNode AS() { return getToken(SimpleGradingGrammarParser.AS, 0); }
		public TerminalNode OVERRIDE() { return getToken(SimpleGradingGrammarParser.OVERRIDE, 0); }
		public TerminalNode ANSWERS() { return getToken(SimpleGradingGrammarParser.ANSWERS, 0); }
		public TerminalNode WITH() { return getToken(SimpleGradingGrammarParser.WITH, 0); }
		public TerminalNode BOUNDARY() { return getToken(SimpleGradingGrammarParser.BOUNDARY, 0); }
		public TerminalNode BETWEEN() { return getToken(SimpleGradingGrammarParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SimpleGradingGrammarParser.AND, 0); }
		public TerminalNode ALL() { return getToken(SimpleGradingGrammarParser.ALL, 0); }
		public TerminalNode WRONG() { return getToken(SimpleGradingGrammarParser.WRONG, 0); }
		public NumericalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterNumerical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitNumerical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitNumerical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalContext numerical() throws RecognitionException {
		NumericalContext _localctx = new NumericalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numerical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DEFINE);
			setState(172);
			match(GRADING);
			setState(173);
			match(FOR);
			setState(174);
			match(NUMERICAL);
			setState(175);
			match(QUESTION);
			setState(176);
			match(STRING);
			setState(177);
			match(MARK);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAY) {
				{
				setState(178);
				match(MAY);
				setState(179);
				match(ACCEPT);
				setState(180);
				match(COL);
				setState(181);
				attach_real_options();
				setState(182);
				match(AS);
				setState(183);
				match(CORRECT);
				setState(184);
				match(MARK);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(188);
				match(OVERRIDE);
				setState(189);
				match(ANSWERS);
				setState(190);
				match(WITH);
				setState(191);
				match(BOUNDARY);
				setState(192);
				match(BETWEEN);
				setState(193);
				((NumericalContext)_localctx).lv = match(INT);
				setState(194);
				match(AND);
				setState(195);
				((NumericalContext)_localctx).hV = match(INT);
				}
			}

			setState(198);
			match(IF);
			setState(199);
			match(CORRECT);
			setState(200);
			match(THEN);
			setState(201);
			match(AWARD);
			setState(202);
			((NumericalContext)_localctx).maxPoints = match(INT);
			setState(203);
			match(MARK);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(204);
				match(IF);
				setState(205);
				match(ALL);
				setState(206);
				match(WRONG);
				setState(207);
				match(AWARD);
				setState(208);
				((NumericalContext)_localctx).minPoints = match(INT);
				setState(209);
				match(MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_real_optionsContext extends ParserRuleContext {
		public Attach_real_options_atomicContext attach_real_options_atomic() {
			return getRuleContext(Attach_real_options_atomicContext.class,0);
		}
		public Attach_real_optionsContext attach_real_options() {
			return getRuleContext(Attach_real_optionsContext.class,0);
		}
		public Attach_real_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_real_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterAttach_real_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitAttach_real_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitAttach_real_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_real_optionsContext attach_real_options() throws RecognitionException {
		Attach_real_optionsContext _localctx = new Attach_real_optionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attach_real_options);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				attach_real_options_atomic();
				setState(213);
				attach_real_options();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				attach_real_options_atomic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attach_real_options_atomicContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(SimpleGradingGrammarParser.DASH, 0); }
		public TerminalNode REAL() { return getToken(SimpleGradingGrammarParser.REAL, 0); }
		public Attach_real_options_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_real_options_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterAttach_real_options_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitAttach_real_options_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitAttach_real_options_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_real_options_atomicContext attach_real_options_atomic() throws RecognitionException {
		Attach_real_options_atomicContext _localctx = new Attach_real_options_atomicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attach_real_options_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(DASH);
			setState(219);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MissingContext extends ParserRuleContext {
		public Token max;
		public Token min;
		public TerminalNode DEFINE() { return getToken(SimpleGradingGrammarParser.DEFINE, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode FOR() { return getToken(SimpleGradingGrammarParser.FOR, 0); }
		public TerminalNode MISSING_WORDS() { return getToken(SimpleGradingGrammarParser.MISSING_WORDS, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleGradingGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleGradingGrammarParser.STRING, 0); }
		public List<TerminalNode> MARK() { return getTokens(SimpleGradingGrammarParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(SimpleGradingGrammarParser.MARK, i);
		}
		public List<TerminalNode> IF() { return getTokens(SimpleGradingGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SimpleGradingGrammarParser.IF, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SimpleGradingGrammarParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SimpleGradingGrammarParser.ALL, i);
		}
		public List<TerminalNode> ARE() { return getTokens(SimpleGradingGrammarParser.ARE); }
		public TerminalNode ARE(int i) {
			return getToken(SimpleGradingGrammarParser.ARE, i);
		}
		public TerminalNode CORRECT() { return getToken(SimpleGradingGrammarParser.CORRECT, 0); }
		public TerminalNode THEN() { return getToken(SimpleGradingGrammarParser.THEN, 0); }
		public List<TerminalNode> AWARD() { return getTokens(SimpleGradingGrammarParser.AWARD); }
		public TerminalNode AWARD(int i) {
			return getToken(SimpleGradingGrammarParser.AWARD, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public Parcial_awardalContext parcial_awardal() {
			return getRuleContext(Parcial_awardalContext.class,0);
		}
		public TerminalNode WRONG() { return getToken(SimpleGradingGrammarParser.WRONG, 0); }
		public MissingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterMissing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitMissing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitMissing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingContext missing() throws RecognitionException {
		MissingContext _localctx = new MissingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_missing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(DEFINE);
			setState(222);
			match(GRADING);
			setState(223);
			match(FOR);
			setState(224);
			match(MISSING_WORDS);
			setState(225);
			match(QUESTION);
			setState(226);
			match(STRING);
			setState(227);
			match(MARK);
			setState(228);
			match(IF);
			setState(229);
			match(ALL);
			setState(230);
			match(ARE);
			setState(231);
			match(CORRECT);
			setState(232);
			match(THEN);
			setState(233);
			match(AWARD);
			setState(234);
			((MissingContext)_localctx).max = match(INT);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(235);
				parcial_awardal();
				}
			}

			setState(238);
			match(MARK);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(239);
				match(IF);
				setState(240);
				match(ALL);
				setState(241);
				match(ARE);
				setState(242);
				match(WRONG);
				setState(243);
				match(AWARD);
				setState(244);
				((MissingContext)_localctx).min = match(INT);
				setState(245);
				match(MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class True_falseContext extends ParserRuleContext {
		public Token max;
		public Token min;
		public TerminalNode DEFINE() { return getToken(SimpleGradingGrammarParser.DEFINE, 0); }
		public TerminalNode GRADING() { return getToken(SimpleGradingGrammarParser.GRADING, 0); }
		public TerminalNode FOR() { return getToken(SimpleGradingGrammarParser.FOR, 0); }
		public TerminalNode TRUE_FALSE() { return getToken(SimpleGradingGrammarParser.TRUE_FALSE, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleGradingGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleGradingGrammarParser.STRING, 0); }
		public List<TerminalNode> MARK() { return getTokens(SimpleGradingGrammarParser.MARK); }
		public TerminalNode MARK(int i) {
			return getToken(SimpleGradingGrammarParser.MARK, i);
		}
		public List<TerminalNode> AWARD() { return getTokens(SimpleGradingGrammarParser.AWARD); }
		public TerminalNode AWARD(int i) {
			return getToken(SimpleGradingGrammarParser.AWARD, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGradingGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGradingGrammarParser.INT, i);
		}
		public TerminalNode IF() { return getToken(SimpleGradingGrammarParser.IF, 0); }
		public TerminalNode ALL() { return getToken(SimpleGradingGrammarParser.ALL, 0); }
		public TerminalNode ARE() { return getToken(SimpleGradingGrammarParser.ARE, 0); }
		public TerminalNode WRONG() { return getToken(SimpleGradingGrammarParser.WRONG, 0); }
		public True_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).enterTrue_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGradingGrammarListener ) ((SimpleGradingGrammarListener)listener).exitTrue_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGradingGrammarVisitor ) return ((SimpleGradingGrammarVisitor<? extends T>)visitor).visitTrue_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_falseContext true_false() throws RecognitionException {
		True_falseContext _localctx = new True_falseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_true_false);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DEFINE);
			setState(249);
			match(GRADING);
			setState(250);
			match(FOR);
			setState(251);
			match(TRUE_FALSE);
			setState(252);
			match(QUESTION);
			setState(253);
			match(STRING);
			setState(254);
			match(MARK);
			setState(255);
			match(AWARD);
			setState(256);
			((True_falseContext)_localctx).max = match(INT);
			setState(257);
			match(MARK);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(258);
				match(IF);
				setState(259);
				match(ALL);
				setState(260);
				match(ARE);
				setState(261);
				match(WRONG);
				setState(262);
				match(AWARD);
				setState(263);
				((True_falseContext)_localctx).min = match(INT);
				setState(264);
				match(MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u010c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Q\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007|\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008d\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0094\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00a7\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00bb\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c5"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d3\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00d9\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ed\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f7\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u010a\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000"+
		"\u0111\u0000 \u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004"+
		"/\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b7\u0001\u0000"+
		"\u0000\u0000\nX\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e"+
		"b\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u00a6\u0001"+
		"\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000\u0016\u00ab\u0001"+
		"\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00da\u0001"+
		"\u0000\u0000\u0000\u001c\u00dd\u0001\u0000\u0000\u0000\u001e\u00f8\u0001"+
		"\u0000\u0000\u0000 !\u0003\u0006\u0003\u0000!\"\u0003\u0002\u0001\u0000"+
		"\"\u0001\u0001\u0000\u0000\u0000#$\u0005\u001d\u0000\u0000$%\u0005\u0013"+
		"\u0000\u0000%&\u0005\u0015\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005"+
		"&\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)0\u0003\b\u0004\u0000*0\u0003"+
		"\u000e\u0007\u0000+0\u0003\u0010\b\u0000,0\u0003\u0016\u000b\u0000-0\u0003"+
		"\u001c\u000e\u0000.0\u0003\u001e\u000f\u0000/)\u0001\u0000\u0000\u0000"+
		"/*\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000\u0000/,\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0005\u0001"+
		"\u0000\u0000\u000012\u0003\u0004\u0002\u000023\u0003\u0006\u0003\u0000"+
		"36\u0001\u0000\u0000\u000046\u0003\u0004\u0002\u000051\u0001\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u0005"+
		"\u000f\u0000\u000089\u0005\u0013\u0000\u00009:\u0005\u0011\u0000\u0000"+
		":;\u0005\u0018\u0000\u0000;<\u0005\u001e\u0000\u0000<=\u0005\u0001\u0000"+
		"\u0000=>\u0005&\u0000\u0000>?\u0005\u0014\u0000\u0000?@\u0005\u0006\u0000"+
		"\u0000@A\u0005\b\u0000\u0000AB\u0005\u000e\u0000\u0000BC\u0005!\u0000"+
		"\u0000CD\u0005\n\u0000\u0000DF\u0005\u0003\u0000\u0000EG\u0003\n\u0005"+
		"\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HP\u0005&\u0000\u0000IJ\u0005\u0014\u0000\u0000JK\u0005\u0006"+
		"\u0000\u0000KL\u0005\b\u0000\u0000LM\u0005$\u0000\u0000MN\u0005\n\u0000"+
		"\u0000NO\u0005\u0003\u0000\u0000OQ\u0005&\u0000\u0000PI\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005%\u0000"+
		"\u0000ST\u0003\f\u0006\u0000TU\u0003\n\u0005\u0000UY\u0001\u0000\u0000"+
		"\u0000VW\u0005%\u0000\u0000WY\u0003\f\u0006\u0000XR\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u0014\u0000\u0000[\\\u0005\u0003\u0000\u0000\\]\u0005\b\u0000\u0000]"+
		"^\u0005\u000e\u0000\u0000^_\u0005!\u0000\u0000_`\u0005\n\u0000\u0000`"+
		"a\u0005\u0003\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\u000f\u0000"+
		"\u0000cd\u0005\u0013\u0000\u0000de\u0005\u0011\u0000\u0000ef\u0005\u001a"+
		"\u0000\u0000fg\u0005\u001e\u0000\u0000gh\u0005\u0001\u0000\u0000hi\u0005"+
		"&\u0000\u0000ij\u0005\u0014\u0000\u0000jk\u0005\u0006\u0000\u0000kl\u0005"+
		"\b\u0000\u0000lm\u0005\u000e\u0000\u0000mn\u0005!\u0000\u0000no\u0005"+
		"\n\u0000\u0000oq\u0005\u0003\u0000\u0000pr\u0003\n\u0005\u0000qp\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s{\u0005&\u0000\u0000tu\u0005\u0014\u0000\u0000uv\u0005\u0006\u0000\u0000"+
		"vw\u0005\b\u0000\u0000wx\u0005$\u0000\u0000xy\u0005\n\u0000\u0000yz\u0005"+
		"\u0003\u0000\u0000z|\u0005&\u0000\u0000{t\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005\u000f\u0000"+
		"\u0000~\u007f\u0005\u0013\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000"+
		"\u0080\u0081\u0005 \u0000\u0000\u0081\u0082\u0005\u001e\u0000\u0000\u0082"+
		"\u0083\u0005\u0001\u0000\u0000\u0083\u008c\u0005&\u0000\u0000\u0084\u0085"+
		"\u0005\u0017\u0000\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087"+
		"\u0005(\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u0089\u0005"+
		"\t\u0000\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008b\u0005&"+
		"\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0093\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u001c\u0000\u0000\u008f\u0090\u0005\u000b"+
		"\u0000\u0000\u0090\u0091\u0005#\u0000\u0000\u0091\u0092\u0005\u001f\u0000"+
		"\u0000\u0092\u0094\u0005\u0001\u0000\u0000\u0093\u008e\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u0014\u0000\u0000\u0096\u0097\u0005\u000e\u0000"+
		"\u0000\u0097\u0098\u0005!\u0000\u0000\u0098\u0099\u0005\n\u0000\u0000"+
		"\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u00a0\u0005&\u0000\u0000\u009b"+
		"\u009c\u0005\u0014\u0000\u0000\u009c\u009d\u0005$\u0000\u0000\u009d\u009e"+
		"\u0005\n\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a1\u0005"+
		"&\u0000\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0014"+
		"\n\u0000\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0014\n\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u0013\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\'\u0000\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa"+
		"\u0015\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0013\u0000\u0000\u00ad\u00ae\u0005\u0011\u0000\u0000\u00ae"+
		"\u00af\u0005\u001b\u0000\u0000\u00af\u00b0\u0005\u001e\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0001\u0000\u0000\u00b1\u00ba\u0005&\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0017\u0000\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5"+
		"\u0005(\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000\u00b6\u00b7\u0005"+
		"\t\u0000\u0000\u00b7\u00b8\u0005\u000e\u0000\u0000\u00b8\u00b9\u0005&"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c4\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u001c\u0000\u0000\u00bd\u00be\u0005\u000b"+
		"\u0000\u0000\u00be\u00bf\u0005#\u0000\u0000\u00bf\u00c0\u0005\r\u0000"+
		"\u0000\u00c0\u00c1\u0005\f\u0000\u0000\u00c1\u00c2\u0005\u0003\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0007\u0000\u0000\u00c3\u00c5\u0005\u0003\u0000\u0000"+
		"\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0014\u0000\u0000"+
		"\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9"+
		"\u00ca\u0005\n\u0000\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb\u00d2"+
		"\u0005&\u0000\u0000\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0006\u0000\u0000\u00ce\u00cf\u0005$\u0000\u0000\u00cf\u00d0\u0005\n"+
		"\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d3\u0005&\u0000"+
		"\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d3\u0017\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u001a\r\u0000"+
		"\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0003\u001a\r\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u0019\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\'\u0000\u0000\u00db\u00dc\u0005\u0002\u0000\u0000\u00dc\u001b\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u000f\u0000\u0000\u00de\u00df\u0005"+
		"\u0013\u0000\u0000\u00df\u00e0\u0005\u0011\u0000\u0000\u00e0\u00e1\u0005"+
		"\u0019\u0000\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0001\u0000\u0000\u00e3\u00e4\u0005&\u0000\u0000\u00e4\u00e5\u0005\u0014"+
		"\u0000\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6\u00e7\u0005\b\u0000"+
		"\u0000\u00e7\u00e8\u0005\u000e\u0000\u0000\u00e8\u00e9\u0005!\u0000\u0000"+
		"\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00ec\u0005\u0003\u0000\u0000\u00eb"+
		"\u00ed\u0003\n\u0005\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f6"+
		"\u0005&\u0000\u0000\u00ef\u00f0\u0005\u0014\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0006\u0000\u0000\u00f1\u00f2\u0005\b\u0000\u0000\u00f2\u00f3\u0005$"+
		"\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000\u00f4\u00f5\u0005\u0003\u0000"+
		"\u0000\u00f5\u00f7\u0005&\u0000\u0000\u00f6\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u001d\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u000f\u0000\u0000\u00f9\u00fa\u0005\u0013\u0000\u0000"+
		"\u00fa\u00fb\u0005\u0011\u0000\u0000\u00fb\u00fc\u0005\"\u0000\u0000\u00fc"+
		"\u00fd\u0005\u001e\u0000\u0000\u00fd\u00fe\u0005\u0001\u0000\u0000\u00fe"+
		"\u00ff\u0005&\u0000\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0101"+
		"\u0005\u0003\u0000\u0000\u0101\u0109\u0005&\u0000\u0000\u0102\u0103\u0005"+
		"\u0014\u0000\u0000\u0103\u0104\u0005\u0006\u0000\u0000\u0104\u0105\u0005"+
		"\b\u0000\u0000\u0105\u0106\u0005$\u0000\u0000\u0106\u0107\u0005\n\u0000"+
		"\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u010a\u0005&\u0000\u0000"+
		"\u0109\u0102\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u001f\u0001\u0000\u0000\u0000\u0012/5FPXq{\u008c\u0093\u00a0\u00a6"+
		"\u00ba\u00c4\u00d2\u00d8\u00ec\u00f6\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}