// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/exam\ExamGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.exam.antlr4.lang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExamGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, HEADER_TYPE=13, COLLUMN=14, COMA=15, EXAM=16, 
		PROMPT=17, POOLS=18, NAME=19, QUESTIONS=20, BODY=21, CODE=22, AWNSERS=23, 
		DIFFICULTY=24, OPTIONS=25, VALID=26, IID=27, AWNSER=28, TEXT=29, KEYS=30, 
		ID=31, TITLE=32, HEADER=33, GRADING=34, DESCRIPTION=35, FEEDBACK=36, SECTIONS=37, 
		LIMIT_QUESTION=38, POOL=39, REAL=40, INT=41, STRING=42, COMMENT=43, WS=44;
	public static final int
		RULE_start = 0, RULE_pools = 1, RULE_pools_body = 2, RULE_pool = 3, RULE_questions = 4, 
		RULE_questions_body = 5, RULE_question_body = 6, RULE_body = 7, RULE_true_false = 8, 
		RULE_missing_words = 9, RULE_key_map = 10, RULE_numerical = 11, RULE_short_awnser = 12, 
		RULE_multiple_choice = 13, RULE_multiple_choice_options = 14, RULE_multiple_choice_options_body = 15, 
		RULE_matching = 16, RULE_matching_awnsers = 17, RULE_matching_token = 18, 
		RULE_matching_questions = 19, RULE_true_false_option = 20, RULE_exam = 21, 
		RULE_exam_body = 22, RULE_sections = 23, RULE_sections_body = 24, RULE_section_object = 25, 
		RULE_header = 26, RULE_header_body = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pools", "pools_body", "pool", "questions", "questions_body", 
			"question_body", "body", "true_false", "missing_words", "key_map", "numerical", 
			"short_awnser", "multiple_choice", "multiple_choice_options", "multiple_choice_options_body", 
			"matching", "matching_awnsers", "matching_token", "matching_questions", 
			"true_false_option", "exam", "exam_body", "sections", "sections_body", 
			"section_object", "header", "header_body"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'{'", "'}'", "'true-false'", "'missing-words'", 
			"'numerical'", "'short-awnser'", "'multiple-choice'", "'matching'", "'true'", 
			"'false'", null, "':'", "','", "'exam'", "'prompt'", "'pools'", "'name'", 
			"'questions'", "'body'", "'code'", "'awnsers'", "'difficulty'", "'options'", 
			"'valid'", "'iid'", "'awnser'", "'text'", "'keys'", "'id'", "'title'", 
			"'header'", "'grading'", "'description'", "'feedback'", "'sections'", 
			"'limitQuestion'", "'pool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "HEADER_TYPE", "COLLUMN", "COMA", "EXAM", "PROMPT", "POOLS", "NAME", 
			"QUESTIONS", "BODY", "CODE", "AWNSERS", "DIFFICULTY", "OPTIONS", "VALID", 
			"IID", "AWNSER", "TEXT", "KEYS", "ID", "TITLE", "HEADER", "GRADING", 
			"DESCRIPTION", "FEEDBACK", "SECTIONS", "LIMIT_QUESTION", "POOL", "REAL", 
			"INT", "STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "ExamGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExamGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public PoolsContext pools() {
			return getRuleContext(PoolsContext.class,0);
		}
		public ExamContext exam() {
			return getRuleContext(ExamContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POOLS:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				pools();
				setState(57);
				exam();
				}
				break;
			case EXAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				exam();
				setState(60);
				pools();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PoolsContext extends ParserRuleContext {
		public TerminalNode POOLS() { return getToken(ExamGrammarParser.POOLS, 0); }
		public TerminalNode COLLUMN() { return getToken(ExamGrammarParser.COLLUMN, 0); }
		public Pools_bodyContext pools_body() {
			return getRuleContext(Pools_bodyContext.class,0);
		}
		public PoolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pools; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterPools(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitPools(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitPools(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolsContext pools() throws RecognitionException {
		PoolsContext _localctx = new PoolsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pools);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(POOLS);
			setState(65);
			match(COLLUMN);
			setState(66);
			match(T__0);
			setState(67);
			pools_body();
			setState(68);
			match(T__1);
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
	public static class Pools_bodyContext extends ParserRuleContext {
		public PoolContext pool() {
			return getRuleContext(PoolContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public Pools_bodyContext pools_body() {
			return getRuleContext(Pools_bodyContext.class,0);
		}
		public Pools_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pools_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterPools_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitPools_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitPools_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pools_bodyContext pools_body() throws RecognitionException {
		Pools_bodyContext _localctx = new Pools_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pools_body);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				pool();
				setState(71);
				match(COMA);
				setState(72);
				pools_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				pool();
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
	public static class PoolContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExamGrammarParser.NAME, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode QUESTIONS() { return getToken(ExamGrammarParser.QUESTIONS, 0); }
		public QuestionsContext questions() {
			return getRuleContext(QuestionsContext.class,0);
		}
		public PoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterPool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitPool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitPool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolContext pool() throws RecognitionException {
		PoolContext _localctx = new PoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(78);
			match(NAME);
			setState(79);
			match(COLLUMN);
			setState(80);
			match(STRING);
			setState(81);
			match(COMA);
			setState(82);
			match(QUESTIONS);
			setState(83);
			match(COLLUMN);
			setState(84);
			questions();
			setState(85);
			match(T__3);
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
		public Questions_bodyContext questions_body() {
			return getRuleContext(Questions_bodyContext.class,0);
		}
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			questions_body();
			setState(89);
			match(T__1);
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
	public static class Questions_bodyContext extends ParserRuleContext {
		public Question_bodyContext question_body() {
			return getRuleContext(Question_bodyContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public Questions_bodyContext questions_body() {
			return getRuleContext(Questions_bodyContext.class,0);
		}
		public Questions_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestions_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestions_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestions_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Questions_bodyContext questions_body() throws RecognitionException {
		Questions_bodyContext _localctx = new Questions_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_questions_body);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				question_body();
				setState(92);
				match(COMA);
				setState(93);
				questions_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				question_body();
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
	public static class Question_bodyContext extends ParserRuleContext {
		public Token prompt_string;
		public TerminalNode PROMPT() { return getToken(ExamGrammarParser.PROMPT, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public TerminalNode BODY() { return getToken(ExamGrammarParser.BODY, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DIFFICULTY() { return getToken(ExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode INT() { return getToken(ExamGrammarParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public Question_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterQuestion_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitQuestion_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitQuestion_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_bodyContext question_body() throws RecognitionException {
		Question_bodyContext _localctx = new Question_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_question_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__2);
			setState(99);
			match(PROMPT);
			setState(100);
			match(COLLUMN);
			setState(101);
			((Question_bodyContext)_localctx).prompt_string = match(STRING);
			setState(102);
			match(COMA);
			setState(103);
			match(BODY);
			setState(104);
			match(COLLUMN);
			setState(105);
			match(T__2);
			setState(106);
			body();
			setState(107);
			match(T__3);
			setState(108);
			match(COMA);
			setState(109);
			match(DIFFICULTY);
			setState(110);
			match(COLLUMN);
			setState(111);
			match(INT);
			setState(112);
			match(T__3);
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
	public static class BodyContext extends ParserRuleContext {
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public Multiple_choiceContext multiple_choice() {
			return getRuleContext(Multiple_choiceContext.class,0);
		}
		public Short_awnserContext short_awnser() {
			return getRuleContext(Short_awnserContext.class,0);
		}
		public NumericalContext numerical() {
			return getRuleContext(NumericalContext.class,0);
		}
		public Missing_wordsContext missing_words() {
			return getRuleContext(Missing_wordsContext.class,0);
		}
		public True_falseContext true_false() {
			return getRuleContext(True_falseContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				matching();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				multiple_choice();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				short_awnser();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				numerical();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				missing_words();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
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
	public static class True_falseContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(ExamGrammarParser.CODE, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode AWNSER() { return getToken(ExamGrammarParser.AWNSER, 0); }
		public True_false_optionContext true_false_option() {
			return getRuleContext(True_false_optionContext.class,0);
		}
		public True_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTrue_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTrue_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTrue_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_falseContext true_false() throws RecognitionException {
		True_falseContext _localctx = new True_falseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_true_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CODE);
			setState(123);
			match(COLLUMN);
			setState(124);
			match(T__4);
			setState(125);
			match(COMA);
			setState(126);
			match(AWNSER);
			setState(127);
			match(COLLUMN);
			setState(128);
			true_false_option();
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
	public static class Missing_wordsContext extends ParserRuleContext {
		public Token text_string;
		public TerminalNode CODE() { return getToken(ExamGrammarParser.CODE, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public TerminalNode TEXT() { return getToken(ExamGrammarParser.TEXT, 0); }
		public TerminalNode KEYS() { return getToken(ExamGrammarParser.KEYS, 0); }
		public Key_mapContext key_map() {
			return getRuleContext(Key_mapContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public Missing_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMissing_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMissing_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMissing_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Missing_wordsContext missing_words() throws RecognitionException {
		Missing_wordsContext _localctx = new Missing_wordsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_missing_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CODE);
			setState(131);
			match(COLLUMN);
			setState(132);
			match(T__5);
			setState(133);
			match(COMA);
			setState(134);
			match(TEXT);
			setState(135);
			match(COLLUMN);
			setState(136);
			((Missing_wordsContext)_localctx).text_string = match(STRING);
			setState(137);
			match(COMA);
			setState(138);
			match(KEYS);
			setState(139);
			match(COLLUMN);
			setState(140);
			match(T__2);
			setState(141);
			key_map();
			setState(142);
			match(T__3);
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
	public static class Key_mapContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExamGrammarParser.INT, 0); }
		public TerminalNode COLLUMN() { return getToken(ExamGrammarParser.COLLUMN, 0); }
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public Key_mapContext key_map() {
			return getRuleContext(Key_mapContext.class,0);
		}
		public Key_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterKey_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitKey_map(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitKey_map(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_mapContext key_map() throws RecognitionException {
		Key_mapContext _localctx = new Key_mapContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_key_map);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(INT);
				setState(145);
				match(COLLUMN);
				setState(146);
				match(STRING);
				setState(147);
				match(COMA);
				setState(148);
				key_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(INT);
				setState(150);
				match(COLLUMN);
				setState(151);
				match(STRING);
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
	public static class NumericalContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(ExamGrammarParser.CODE, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode AWNSER() { return getToken(ExamGrammarParser.AWNSER, 0); }
		public TerminalNode REAL() { return getToken(ExamGrammarParser.REAL, 0); }
		public TerminalNode INT() { return getToken(ExamGrammarParser.INT, 0); }
		public NumericalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterNumerical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitNumerical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitNumerical(this);
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
			setState(154);
			match(CODE);
			setState(155);
			match(COLLUMN);
			setState(156);
			match(T__6);
			setState(157);
			match(COMA);
			setState(158);
			match(AWNSER);
			setState(159);
			match(COLLUMN);
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Short_awnserContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(ExamGrammarParser.CODE, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode AWNSER() { return getToken(ExamGrammarParser.AWNSER, 0); }
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public Short_awnserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short_awnser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterShort_awnser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitShort_awnser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitShort_awnser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Short_awnserContext short_awnser() throws RecognitionException {
		Short_awnserContext _localctx = new Short_awnserContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_short_awnser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(CODE);
			setState(163);
			match(COLLUMN);
			setState(164);
			match(T__7);
			setState(165);
			match(COMA);
			setState(166);
			match(AWNSER);
			setState(167);
			match(COLLUMN);
			setState(168);
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
	public static class Multiple_choiceContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(ExamGrammarParser.CODE, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode OPTIONS() { return getToken(ExamGrammarParser.OPTIONS, 0); }
		public Multiple_choice_optionsContext multiple_choice_options() {
			return getRuleContext(Multiple_choice_optionsContext.class,0);
		}
		public Multiple_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMultiple_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMultiple_choice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choiceContext multiple_choice() throws RecognitionException {
		Multiple_choiceContext _localctx = new Multiple_choiceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiple_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CODE);
			setState(171);
			match(COLLUMN);
			setState(172);
			match(T__8);
			setState(173);
			match(COMA);
			setState(174);
			match(OPTIONS);
			setState(175);
			match(COLLUMN);
			setState(176);
			match(T__0);
			setState(177);
			multiple_choice_options();
			setState(178);
			match(T__1);
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
	public static class Multiple_choice_optionsContext extends ParserRuleContext {
		public Multiple_choice_options_bodyContext opt1;
		public Multiple_choice_options_bodyContext opt2;
		public Multiple_choice_options_bodyContext opt3;
		public Multiple_choice_options_bodyContext opt4;
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public List<Multiple_choice_options_bodyContext> multiple_choice_options_body() {
			return getRuleContexts(Multiple_choice_options_bodyContext.class);
		}
		public Multiple_choice_options_bodyContext multiple_choice_options_body(int i) {
			return getRuleContext(Multiple_choice_options_bodyContext.class,i);
		}
		public Multiple_choice_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMultiple_choice_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMultiple_choice_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_optionsContext multiple_choice_options() throws RecognitionException {
		Multiple_choice_optionsContext _localctx = new Multiple_choice_optionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiple_choice_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((Multiple_choice_optionsContext)_localctx).opt1 = multiple_choice_options_body();
			setState(181);
			match(COMA);
			setState(182);
			((Multiple_choice_optionsContext)_localctx).opt2 = multiple_choice_options_body();
			setState(183);
			match(COMA);
			setState(184);
			((Multiple_choice_optionsContext)_localctx).opt3 = multiple_choice_options_body();
			setState(185);
			match(COMA);
			setState(186);
			((Multiple_choice_optionsContext)_localctx).opt4 = multiple_choice_options_body();
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
	public static class Multiple_choice_options_bodyContext extends ParserRuleContext {
		public TerminalNode PROMPT() { return getToken(ExamGrammarParser.PROMPT, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode VALID() { return getToken(ExamGrammarParser.VALID, 0); }
		public True_false_optionContext true_false_option() {
			return getRuleContext(True_false_optionContext.class,0);
		}
		public Multiple_choice_options_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice_options_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMultiple_choice_options_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMultiple_choice_options_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMultiple_choice_options_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choice_options_bodyContext multiple_choice_options_body() throws RecognitionException {
		Multiple_choice_options_bodyContext _localctx = new Multiple_choice_options_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiple_choice_options_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__2);
			setState(189);
			match(PROMPT);
			setState(190);
			match(COLLUMN);
			setState(191);
			match(STRING);
			setState(192);
			match(COMA);
			setState(193);
			match(VALID);
			setState(194);
			match(COLLUMN);
			setState(195);
			true_false_option();
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
		public TerminalNode CODE() { return getToken(ExamGrammarParser.CODE, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public TerminalNode QUESTIONS() { return getToken(ExamGrammarParser.QUESTIONS, 0); }
		public Matching_questionsContext matching_questions() {
			return getRuleContext(Matching_questionsContext.class,0);
		}
		public TerminalNode AWNSERS() { return getToken(ExamGrammarParser.AWNSERS, 0); }
		public Matching_awnsersContext matching_awnsers() {
			return getRuleContext(Matching_awnsersContext.class,0);
		}
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_matching);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(CODE);
			setState(198);
			match(COLLUMN);
			setState(199);
			match(T__9);
			setState(200);
			match(COMA);
			setState(201);
			match(QUESTIONS);
			setState(202);
			match(COLLUMN);
			setState(203);
			match(T__0);
			setState(204);
			matching_questions();
			setState(205);
			match(T__1);
			setState(206);
			match(COMA);
			setState(207);
			match(AWNSERS);
			setState(208);
			match(COLLUMN);
			setState(209);
			match(T__0);
			setState(210);
			matching_awnsers();
			setState(211);
			match(T__1);
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
	public static class Matching_awnsersContext extends ParserRuleContext {
		public Matching_tokenContext matching_token() {
			return getRuleContext(Matching_tokenContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public Matching_awnsersContext matching_awnsers() {
			return getRuleContext(Matching_awnsersContext.class,0);
		}
		public Matching_awnsersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_awnsers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMatching_awnsers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMatching_awnsers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMatching_awnsers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_awnsersContext matching_awnsers() throws RecognitionException {
		Matching_awnsersContext _localctx = new Matching_awnsersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matching_awnsers);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				matching_token();
				setState(214);
				match(COMA);
				setState(215);
				matching_awnsers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				matching_token();
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
	public static class Matching_tokenContext extends ParserRuleContext {
		public TerminalNode IID() { return getToken(ExamGrammarParser.IID, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public TerminalNode INT() { return getToken(ExamGrammarParser.INT, 0); }
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public TerminalNode PROMPT() { return getToken(ExamGrammarParser.PROMPT, 0); }
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public Matching_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMatching_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMatching_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMatching_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_tokenContext matching_token() throws RecognitionException {
		Matching_tokenContext _localctx = new Matching_tokenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matching_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__2);
			setState(221);
			match(IID);
			setState(222);
			match(COLLUMN);
			setState(223);
			match(INT);
			setState(224);
			match(COMA);
			setState(225);
			match(PROMPT);
			setState(226);
			match(COLLUMN);
			setState(227);
			match(STRING);
			setState(228);
			match(T__3);
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
	public static class Matching_questionsContext extends ParserRuleContext {
		public Matching_tokenContext matching_token() {
			return getRuleContext(Matching_tokenContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public Matching_questionsContext matching_questions() {
			return getRuleContext(Matching_questionsContext.class,0);
		}
		public Matching_questionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterMatching_questions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitMatching_questions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitMatching_questions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_questionsContext matching_questions() throws RecognitionException {
		Matching_questionsContext _localctx = new Matching_questionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_matching_questions);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				matching_token();
				setState(231);
				match(COMA);
				setState(232);
				matching_questions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				matching_token();
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
	public static class True_false_optionContext extends ParserRuleContext {
		public True_false_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterTrue_false_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitTrue_false_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitTrue_false_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_false_optionContext true_false_option() throws RecognitionException {
		True_false_optionContext _localctx = new True_false_optionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_true_false_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ExamContext extends ParserRuleContext {
		public TerminalNode EXAM() { return getToken(ExamGrammarParser.EXAM, 0); }
		public Exam_bodyContext exam_body() {
			return getRuleContext(Exam_bodyContext.class,0);
		}
		public ExamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterExam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitExam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitExam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExamContext exam() throws RecognitionException {
		ExamContext _localctx = new ExamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(EXAM);
			setState(240);
			match(T__2);
			setState(241);
			exam_body();
			setState(242);
			match(T__3);
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
	public static class Exam_bodyContext extends ParserRuleContext {
		public Token exam_id;
		public Token exam_title;
		public TerminalNode ID() { return getToken(ExamGrammarParser.ID, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public TerminalNode TITLE() { return getToken(ExamGrammarParser.TITLE, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(ExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExamGrammarParser.STRING, i);
		}
		public Exam_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exam_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterExam_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitExam_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitExam_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exam_bodyContext exam_body() throws RecognitionException {
		Exam_bodyContext _localctx = new Exam_bodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exam_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ID);
			setState(245);
			match(COLLUMN);
			setState(246);
			((Exam_bodyContext)_localctx).exam_id = match(STRING);
			setState(247);
			match(COMA);
			setState(248);
			match(TITLE);
			setState(249);
			match(COLLUMN);
			setState(250);
			((Exam_bodyContext)_localctx).exam_title = match(STRING);
			setState(251);
			match(COMA);
			setState(252);
			header();
			setState(253);
			match(COMA);
			setState(254);
			sections();
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
	public static class SectionsContext extends ParserRuleContext {
		public TerminalNode SECTIONS() { return getToken(ExamGrammarParser.SECTIONS, 0); }
		public TerminalNode COLLUMN() { return getToken(ExamGrammarParser.COLLUMN, 0); }
		public Sections_bodyContext sections_body() {
			return getRuleContext(Sections_bodyContext.class,0);
		}
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitSections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitSections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(SECTIONS);
			setState(257);
			match(COLLUMN);
			setState(258);
			match(T__0);
			setState(259);
			sections_body();
			setState(260);
			match(T__1);
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
	public static class Sections_bodyContext extends ParserRuleContext {
		public Section_objectContext section_object() {
			return getRuleContext(Section_objectContext.class,0);
		}
		public TerminalNode COMA() { return getToken(ExamGrammarParser.COMA, 0); }
		public Sections_bodyContext sections_body() {
			return getRuleContext(Sections_bodyContext.class,0);
		}
		public Sections_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterSections_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitSections_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitSections_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sections_bodyContext sections_body() throws RecognitionException {
		Sections_bodyContext _localctx = new Sections_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sections_body);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				section_object();
				setState(263);
				match(COMA);
				setState(264);
				sections_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				section_object();
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
	public static class Section_objectContext extends ParserRuleContext {
		public Token sec_id;
		public Token sec_des;
		public Token dif;
		public Token limit;
		public Token pol_name;
		public TerminalNode ID() { return getToken(ExamGrammarParser.ID, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public TerminalNode DESCRIPTION() { return getToken(ExamGrammarParser.DESCRIPTION, 0); }
		public TerminalNode DIFFICULTY() { return getToken(ExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode LIMIT_QUESTION() { return getToken(ExamGrammarParser.LIMIT_QUESTION, 0); }
		public TerminalNode POOL() { return getToken(ExamGrammarParser.POOL, 0); }
		public List<TerminalNode> STRING() { return getTokens(ExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExamGrammarParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExamGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExamGrammarParser.INT, i);
		}
		public Section_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterSection_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitSection_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitSection_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_objectContext section_object() throws RecognitionException {
		Section_objectContext _localctx = new Section_objectContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_section_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__2);
			setState(270);
			match(ID);
			setState(271);
			match(COLLUMN);
			setState(272);
			((Section_objectContext)_localctx).sec_id = match(STRING);
			setState(273);
			match(COMA);
			setState(274);
			match(DESCRIPTION);
			setState(275);
			match(COLLUMN);
			setState(276);
			((Section_objectContext)_localctx).sec_des = match(STRING);
			setState(277);
			match(COMA);
			setState(278);
			match(DIFFICULTY);
			setState(279);
			match(COLLUMN);
			setState(280);
			((Section_objectContext)_localctx).dif = match(INT);
			setState(281);
			match(COMA);
			setState(282);
			match(LIMIT_QUESTION);
			setState(283);
			match(COLLUMN);
			setState(284);
			((Section_objectContext)_localctx).limit = match(INT);
			setState(285);
			match(COMA);
			setState(286);
			match(POOL);
			setState(287);
			match(COLLUMN);
			setState(288);
			((Section_objectContext)_localctx).pol_name = match(STRING);
			setState(289);
			match(T__3);
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(ExamGrammarParser.HEADER, 0); }
		public TerminalNode COLLUMN() { return getToken(ExamGrammarParser.COLLUMN, 0); }
		public Header_bodyContext header_body() {
			return getRuleContext(Header_bodyContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(HEADER);
			setState(292);
			match(COLLUMN);
			setState(293);
			match(T__2);
			setState(294);
			header_body();
			setState(295);
			match(T__3);
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
	public static class Header_bodyContext extends ParserRuleContext {
		public Token des;
		public Token grad;
		public Token feed;
		public TerminalNode DESCRIPTION() { return getToken(ExamGrammarParser.DESCRIPTION, 0); }
		public List<TerminalNode> COLLUMN() { return getTokens(ExamGrammarParser.COLLUMN); }
		public TerminalNode COLLUMN(int i) {
			return getToken(ExamGrammarParser.COLLUMN, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExamGrammarParser.COMA, i);
		}
		public TerminalNode GRADING() { return getToken(ExamGrammarParser.GRADING, 0); }
		public TerminalNode FEEDBACK() { return getToken(ExamGrammarParser.FEEDBACK, 0); }
		public TerminalNode STRING() { return getToken(ExamGrammarParser.STRING, 0); }
		public List<TerminalNode> HEADER_TYPE() { return getTokens(ExamGrammarParser.HEADER_TYPE); }
		public TerminalNode HEADER_TYPE(int i) {
			return getToken(ExamGrammarParser.HEADER_TYPE, i);
		}
		public Header_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).enterHeader_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExamGrammarListener ) ((ExamGrammarListener)listener).exitHeader_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExamGrammarVisitor ) return ((ExamGrammarVisitor<? extends T>)visitor).visitHeader_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_bodyContext header_body() throws RecognitionException {
		Header_bodyContext _localctx = new Header_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_header_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(DESCRIPTION);
			setState(298);
			match(COLLUMN);
			setState(299);
			((Header_bodyContext)_localctx).des = match(STRING);
			setState(300);
			match(COMA);
			setState(301);
			match(GRADING);
			setState(302);
			match(COLLUMN);
			setState(303);
			((Header_bodyContext)_localctx).grad = match(HEADER_TYPE);
			setState(304);
			match(COMA);
			setState(305);
			match(FEEDBACK);
			setState(306);
			match(COLLUMN);
			setState(307);
			((Header_bodyContext)_localctx).feed = match(HEADER_TYPE);
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
		"\u0004\u0001,\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00db\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00ec\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u010c\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0246\u0000\u0002\u0001\u0000()\u0001\u0000\u000b\f\u0125\u0000"+
		">\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004K\u0001"+
		"\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000ex\u0001"+
		"\u0000\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000"+
		"\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000"+
		"\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000"+
		"\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000"+
		"\u0000\u0000 \u00c5\u0001\u0000\u0000\u0000\"\u00da\u0001\u0000\u0000"+
		"\u0000$\u00dc\u0001\u0000\u0000\u0000&\u00eb\u0001\u0000\u0000\u0000("+
		"\u00ed\u0001\u0000\u0000\u0000*\u00ef\u0001\u0000\u0000\u0000,\u00f4\u0001"+
		"\u0000\u0000\u0000.\u0100\u0001\u0000\u0000\u00000\u010b\u0001\u0000\u0000"+
		"\u00002\u010d\u0001\u0000\u0000\u00004\u0123\u0001\u0000\u0000\u00006"+
		"\u0129\u0001\u0000\u0000\u000089\u0003\u0002\u0001\u00009:\u0003*\u0015"+
		"\u0000:?\u0001\u0000\u0000\u0000;<\u0003*\u0015\u0000<=\u0003\u0002\u0001"+
		"\u0000=?\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>;\u0001\u0000"+
		"\u0000\u0000?\u0001\u0001\u0000\u0000\u0000@A\u0005\u0012\u0000\u0000"+
		"AB\u0005\u000e\u0000\u0000BC\u0005\u0001\u0000\u0000CD\u0003\u0004\u0002"+
		"\u0000DE\u0005\u0002\u0000\u0000E\u0003\u0001\u0000\u0000\u0000FG\u0003"+
		"\u0006\u0003\u0000GH\u0005\u000f\u0000\u0000HI\u0003\u0004\u0002\u0000"+
		"IL\u0001\u0000\u0000\u0000JL\u0003\u0006\u0003\u0000KF\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0003\u0000\u0000NO\u0005\u0013\u0000\u0000OP\u0005\u000e\u0000\u0000"+
		"PQ\u0005*\u0000\u0000QR\u0005\u000f\u0000\u0000RS\u0005\u0014\u0000\u0000"+
		"ST\u0005\u000e\u0000\u0000TU\u0003\b\u0004\u0000UV\u0005\u0004\u0000\u0000"+
		"V\u0007\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0003\n\u0005"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0003\f"+
		"\u0006\u0000\\]\u0005\u000f\u0000\u0000]^\u0003\n\u0005\u0000^a\u0001"+
		"\u0000\u0000\u0000_a\u0003\f\u0006\u0000`[\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0005\u0003\u0000"+
		"\u0000cd\u0005\u0011\u0000\u0000de\u0005\u000e\u0000\u0000ef\u0005*\u0000"+
		"\u0000fg\u0005\u000f\u0000\u0000gh\u0005\u0015\u0000\u0000hi\u0005\u000e"+
		"\u0000\u0000ij\u0005\u0003\u0000\u0000jk\u0003\u000e\u0007\u0000kl\u0005"+
		"\u0004\u0000\u0000lm\u0005\u000f\u0000\u0000mn\u0005\u0018\u0000\u0000"+
		"no\u0005\u000e\u0000\u0000op\u0005)\u0000\u0000pq\u0005\u0004\u0000\u0000"+
		"q\r\u0001\u0000\u0000\u0000ry\u0003 \u0010\u0000sy\u0003\u001a\r\u0000"+
		"ty\u0003\u0018\f\u0000uy\u0003\u0016\u000b\u0000vy\u0003\u0012\t\u0000"+
		"wy\u0003\u0010\b\u0000xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000"+
		"xt\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0016\u0000\u0000{|\u0005\u000e\u0000\u0000|}\u0005\u0005\u0000\u0000"+
		"}~\u0005\u000f\u0000\u0000~\u007f\u0005\u001c\u0000\u0000\u007f\u0080"+
		"\u0005\u000e\u0000\u0000\u0080\u0081\u0003(\u0014\u0000\u0081\u0011\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u0016\u0000\u0000\u0083\u0084\u0005"+
		"\u000e\u0000\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u0086\u0005"+
		"\u000f\u0000\u0000\u0086\u0087\u0005\u001d\u0000\u0000\u0087\u0088\u0005"+
		"\u000e\u0000\u0000\u0088\u0089\u0005*\u0000\u0000\u0089\u008a\u0005\u000f"+
		"\u0000\u0000\u008a\u008b\u0005\u001e\u0000\u0000\u008b\u008c\u0005\u000e"+
		"\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0003\u0014"+
		"\n\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0013\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005)\u0000\u0000\u0091\u0092\u0005\u000e\u0000\u0000"+
		"\u0092\u0093\u0005*\u0000\u0000\u0093\u0094\u0005\u000f\u0000\u0000\u0094"+
		"\u0099\u0003\u0014\n\u0000\u0095\u0096\u0005)\u0000\u0000\u0096\u0097"+
		"\u0005\u000e\u0000\u0000\u0097\u0099\u0005*\u0000\u0000\u0098\u0090\u0001"+
		"\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0099\u0015\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0016\u0000\u0000\u009b\u009c\u0005"+
		"\u000e\u0000\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u009e\u0005"+
		"\u000f\u0000\u0000\u009e\u009f\u0005\u001c\u0000\u0000\u009f\u00a0\u0005"+
		"\u000e\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1\u0017\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u0016\u0000\u0000\u00a3\u00a4\u0005"+
		"\u000e\u0000\u0000\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0005\u000f"+
		"\u0000\u0000\u00a6\u00a7\u0005\u001c\u0000\u0000\u00a7\u00a8\u0005\u000e"+
		"\u0000\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a9\u0019\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0016\u0000\u0000\u00ab\u00ac\u0005\u000e\u0000"+
		"\u0000\u00ac\u00ad\u0005\t\u0000\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000"+
		"\u00ae\u00af\u0005\u0019\u0000\u0000\u00af\u00b0\u0005\u000e\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0001\u0000\u0000\u00b1\u00b2\u0003\u001c\u000e\u0000"+
		"\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0003\u001e\u000f\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000"+
		"\u00b6\u00b7\u0003\u001e\u000f\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000"+
		"\u00b8\u00b9\u0003\u001e\u000f\u0000\u00b9\u00ba\u0005\u000f\u0000\u0000"+
		"\u00ba\u00bb\u0003\u001e\u000f\u0000\u00bb\u001d\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0003\u0000\u0000\u00bd\u00be\u0005\u0011\u0000\u0000"+
		"\u00be\u00bf\u0005\u000e\u0000\u0000\u00bf\u00c0\u0005*\u0000\u0000\u00c0"+
		"\u00c1\u0005\u000f\u0000\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2"+
		"\u00c3\u0005\u000e\u0000\u0000\u00c3\u00c4\u0003(\u0014\u0000\u00c4\u001f"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0016\u0000\u0000\u00c6\u00c7"+
		"\u0005\u000e\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u00c9\u0005"+
		"\u000f\u0000\u0000\u00c9\u00ca\u0005\u0014\u0000\u0000\u00ca\u00cb\u0005"+
		"\u000e\u0000\u0000\u00cb\u00cc\u0005\u0001\u0000\u0000\u00cc\u00cd\u0003"+
		"&\u0013\u0000\u00cd\u00ce\u0005\u0002\u0000\u0000\u00ce\u00cf\u0005\u000f"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0017\u0000\u0000\u00d0\u00d1\u0005\u000e"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000\u00d2\u00d3\u0003\"\u0011"+
		"\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4!\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0003$\u0012\u0000\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7"+
		"\u00d8\u0003\"\u0011\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00db"+
		"\u0003$\u0012\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db#\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0003"+
		"\u0000\u0000\u00dd\u00de\u0005\u001b\u0000\u0000\u00de\u00df\u0005\u000e"+
		"\u0000\u0000\u00df\u00e0\u0005)\u0000\u0000\u00e0\u00e1\u0005\u000f\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0011\u0000\u0000\u00e2\u00e3\u0005\u000e\u0000"+
		"\u0000\u00e3\u00e4\u0005*\u0000\u0000\u00e4\u00e5\u0005\u0004\u0000\u0000"+
		"\u00e5%\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003$\u0012\u0000\u00e7\u00e8"+
		"\u0005\u000f\u0000\u0000\u00e8\u00e9\u0003&\u0013\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ec\u0003$\u0012\u0000\u00eb\u00e6\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\'\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0007\u0001\u0000\u0000\u00ee)\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0010\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000"+
		"\u00f1\u00f2\u0003,\u0016\u0000\u00f2\u00f3\u0005\u0004\u0000\u0000\u00f3"+
		"+\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u001f\u0000\u0000\u00f5\u00f6"+
		"\u0005\u000e\u0000\u0000\u00f6\u00f7\u0005*\u0000\u0000\u00f7\u00f8\u0005"+
		"\u000f\u0000\u0000\u00f8\u00f9\u0005 \u0000\u0000\u00f9\u00fa\u0005\u000e"+
		"\u0000\u0000\u00fa\u00fb\u0005*\u0000\u0000\u00fb\u00fc\u0005\u000f\u0000"+
		"\u0000\u00fc\u00fd\u00034\u001a\u0000\u00fd\u00fe\u0005\u000f\u0000\u0000"+
		"\u00fe\u00ff\u0003.\u0017\u0000\u00ff-\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005%\u0000\u0000\u0101\u0102\u0005\u000e\u0000\u0000\u0102\u0103\u0005"+
		"\u0001\u0000\u0000\u0103\u0104\u00030\u0018\u0000\u0104\u0105\u0005\u0002"+
		"\u0000\u0000\u0105/\u0001\u0000\u0000\u0000\u0106\u0107\u00032\u0019\u0000"+
		"\u0107\u0108\u0005\u000f\u0000\u0000\u0108\u0109\u00030\u0018\u0000\u0109"+
		"\u010c\u0001\u0000\u0000\u0000\u010a\u010c\u00032\u0019\u0000\u010b\u0106"+
		"\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c1\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e\u010f\u0005"+
		"\u001f\u0000\u0000\u010f\u0110\u0005\u000e\u0000\u0000\u0110\u0111\u0005"+
		"*\u0000\u0000\u0111\u0112\u0005\u000f\u0000\u0000\u0112\u0113\u0005#\u0000"+
		"\u0000\u0113\u0114\u0005\u000e\u0000\u0000\u0114\u0115\u0005*\u0000\u0000"+
		"\u0115\u0116\u0005\u000f\u0000\u0000\u0116\u0117\u0005\u0018\u0000\u0000"+
		"\u0117\u0118\u0005\u000e\u0000\u0000\u0118\u0119\u0005)\u0000\u0000\u0119"+
		"\u011a\u0005\u000f\u0000\u0000\u011a\u011b\u0005&\u0000\u0000\u011b\u011c"+
		"\u0005\u000e\u0000\u0000\u011c\u011d\u0005)\u0000\u0000\u011d\u011e\u0005"+
		"\u000f\u0000\u0000\u011e\u011f\u0005\'\u0000\u0000\u011f\u0120\u0005\u000e"+
		"\u0000\u0000\u0120\u0121\u0005*\u0000\u0000\u0121\u0122\u0005\u0004\u0000"+
		"\u0000\u01223\u0001\u0000\u0000\u0000\u0123\u0124\u0005!\u0000\u0000\u0124"+
		"\u0125\u0005\u000e\u0000\u0000\u0125\u0126\u0005\u0003\u0000\u0000\u0126"+
		"\u0127\u00036\u001b\u0000\u0127\u0128\u0005\u0004\u0000\u0000\u01285\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005#\u0000\u0000\u012a\u012b\u0005\u000e"+
		"\u0000\u0000\u012b\u012c\u0005*\u0000\u0000\u012c\u012d\u0005\u000f\u0000"+
		"\u0000\u012d\u012e\u0005\"\u0000\u0000\u012e\u012f\u0005\u000e\u0000\u0000"+
		"\u012f\u0130\u0005\r\u0000\u0000\u0130\u0131\u0005\u000f\u0000\u0000\u0131"+
		"\u0132\u0005$\u0000\u0000\u0132\u0133\u0005\u000e\u0000\u0000\u0133\u0134"+
		"\u0005\r\u0000\u0000\u01347\u0001\u0000\u0000\u0000\b>K`x\u0098\u00da"+
		"\u00eb\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}