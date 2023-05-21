// Generated from C:/Users/Andre/Desktop/ARQSOFT/LAPRIV-2022-2023/Lang/langs/exam\SimpleExamGrammar.g4 by ANTLR 4.12.0
package barbatos_rex1.exam.antlr4.lang.simple;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleExamGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MATCHING=6, RELATOR=7, DEFINE=8, 
		SOME=9, SECTION=10, ID=11, MAXIMUM=12, DIFFICULTY=13, OF=14, USING=15, 
		POOL=16, EXPORT=17, EXAM=18, WITH=19, TITLE=20, COMA=21, DESCRIPTION=22, 
		GRADING=23, FEEDBACK=24, AND=25, SECTIONS=26, LARR=27, RARR=28, NUMBER=29, 
		QUESTIONS=30, QUESTION=31, ANSWERS=32, KEYS=33, COL=34, AS=35, STRING=36, 
		HEADER_OPTION=37, INT=38, BOOLEAN=39, REAL=40, WS=41;
	public static final int
		RULE_start = 0, RULE_pool = 1, RULE_pool_body = 2, RULE_pool_body_atomic = 3, 
		RULE_matching = 4, RULE_matching_map = 5, RULE_matching_map_atomic = 6, 
		RULE_multiple = 7, RULE_multiple_map = 8, RULE_multiple_map_atomic = 9, 
		RULE_short = 10, RULE_missing = 11, RULE_key_map = 12, RULE_key_map_atomic = 13, 
		RULE_num = 14, RULE_true_false = 15, RULE_section = 16, RULE_section_maximum_number_of_questions = 17, 
		RULE_exam = 18, RULE_sections_arr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "pool", "pool_body", "pool_body_atomic", "matching", "matching_map", 
			"matching_map_atomic", "multiple", "multiple_map", "multiple_map_atomic", 
			"short", "missing", "key_map", "key_map_atomic", "num", "true_false", 
			"section", "section_maximum_number_of_questions", "exam", "sections_arr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'multiple choice'", "'short answer'", "'missing words'", "'numerical'", 
			"'true or false'", "'matching'", "'<->'", "'define'", "'some'", "'section'", 
			"'id'", "'maximum'", "'difficulty'", "'of'", "'using'", "'pool'", "'export'", 
			"'exam'", "'with'", "'title'", "','", "'description'", "'grading'", "'feedback'", 
			"'and'", "'sections'", "'['", "']'", "'number'", "'questions'", "'question'", 
			"'answers'", "'keys'", "':'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "MATCHING", "RELATOR", "DEFINE", 
			"SOME", "SECTION", "ID", "MAXIMUM", "DIFFICULTY", "OF", "USING", "POOL", 
			"EXPORT", "EXAM", "WITH", "TITLE", "COMA", "DESCRIPTION", "GRADING", 
			"FEEDBACK", "AND", "SECTIONS", "LARR", "RARR", "NUMBER", "QUESTIONS", 
			"QUESTION", "ANSWERS", "KEYS", "COL", "AS", "STRING", "HEADER_OPTION", 
			"INT", "BOOLEAN", "REAL", "WS"
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
	public String getGrammarFileName() { return "SimpleExamGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleExamGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExamContext exam() {
			return getRuleContext(ExamContext.class,0);
		}
		public List<PoolContext> pool() {
			return getRuleContexts(PoolContext.class);
		}
		public PoolContext pool(int i) {
			return getRuleContext(PoolContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					pool();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				section();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFINE );
			setState(50);
			exam();
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
		public TerminalNode DEFINE() { return getToken(SimpleExamGrammarParser.DEFINE, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode POOL() { return getToken(SimpleExamGrammarParser.POOL, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public Pool_bodyContext pool_body() {
			return getRuleContext(Pool_bodyContext.class,0);
		}
		public PoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterPool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitPool(this);
		}
	}

	public final PoolContext pool() throws RecognitionException {
		PoolContext _localctx = new PoolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DEFINE);
			setState(53);
			match(QUESTION);
			setState(54);
			match(POOL);
			setState(55);
			match(STRING);
			setState(56);
			match(COL);
			setState(57);
			pool_body();
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
	public static class Pool_bodyContext extends ParserRuleContext {
		public Pool_body_atomicContext pool_body_atomic() {
			return getRuleContext(Pool_body_atomicContext.class,0);
		}
		public Pool_bodyContext pool_body() {
			return getRuleContext(Pool_bodyContext.class,0);
		}
		public Pool_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterPool_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitPool_body(this);
		}
	}

	public final Pool_bodyContext pool_body() throws RecognitionException {
		Pool_bodyContext _localctx = new Pool_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pool_body);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				pool_body_atomic();
				setState(60);
				pool_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				pool_body_atomic();
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
	public static class Pool_body_atomicContext extends ParserRuleContext {
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public MultipleContext multiple() {
			return getRuleContext(MultipleContext.class,0);
		}
		public ShortContext short_() {
			return getRuleContext(ShortContext.class,0);
		}
		public MissingContext missing() {
			return getRuleContext(MissingContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public True_falseContext true_false() {
			return getRuleContext(True_falseContext.class,0);
		}
		public Pool_body_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pool_body_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterPool_body_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitPool_body_atomic(this);
		}
	}

	public final Pool_body_atomicContext pool_body_atomic() throws RecognitionException {
		Pool_body_atomicContext _localctx = new Pool_body_atomicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pool_body_atomic);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				matching();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				multiple();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				short_();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				missing();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				num();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				true_false();
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
	public static class MatchingContext extends ParserRuleContext {
		public TerminalNode MATCHING() { return getToken(SimpleExamGrammarParser.MATCHING, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode QUESTIONS() { return getToken(SimpleExamGrammarParser.QUESTIONS, 0); }
		public List<TerminalNode> COL() { return getTokens(SimpleExamGrammarParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(SimpleExamGrammarParser.COL, i);
		}
		public List<Matching_mapContext> matching_map() {
			return getRuleContexts(Matching_mapContext.class);
		}
		public Matching_mapContext matching_map(int i) {
			return getRuleContext(Matching_mapContext.class,i);
		}
		public TerminalNode ANSWERS() { return getToken(SimpleExamGrammarParser.ANSWERS, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMatching(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matching);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(MATCHING);
			setState(74);
			match(QUESTION);
			setState(75);
			match(STRING);
			setState(76);
			match(QUESTIONS);
			setState(77);
			match(COL);
			setState(78);
			matching_map();
			setState(79);
			match(ANSWERS);
			setState(80);
			match(COL);
			setState(81);
			matching_map();
			setState(82);
			match(DIFFICULTY);
			setState(83);
			match(COL);
			setState(84);
			match(INT);
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
	public static class Matching_mapContext extends ParserRuleContext {
		public Matching_map_atomicContext matching_map_atomic() {
			return getRuleContext(Matching_map_atomicContext.class,0);
		}
		public Matching_mapContext matching_map() {
			return getRuleContext(Matching_mapContext.class,0);
		}
		public Matching_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMatching_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMatching_map(this);
		}
	}

	public final Matching_mapContext matching_map() throws RecognitionException {
		Matching_mapContext _localctx = new Matching_mapContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matching_map);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				matching_map_atomic();
				setState(87);
				matching_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				matching_map_atomic();
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
	public static class Matching_map_atomicContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public TerminalNode RELATOR() { return getToken(SimpleExamGrammarParser.RELATOR, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public Matching_map_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching_map_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMatching_map_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMatching_map_atomic(this);
		}
	}

	public final Matching_map_atomicContext matching_map_atomic() throws RecognitionException {
		Matching_map_atomicContext _localctx = new Matching_map_atomicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matching_map_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(INT);
			setState(93);
			match(RELATOR);
			setState(94);
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
	public static class MultipleContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public Multiple_mapContext multiple_map() {
			return getRuleContext(Multiple_mapContext.class,0);
		}
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public MultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMultiple(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
			match(QUESTION);
			setState(98);
			match(STRING);
			setState(99);
			multiple_map();
			setState(100);
			match(DIFFICULTY);
			setState(101);
			match(COL);
			setState(102);
			match(INT);
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
	public static class Multiple_mapContext extends ParserRuleContext {
		public Multiple_map_atomicContext multiple_map_atomic() {
			return getRuleContext(Multiple_map_atomicContext.class,0);
		}
		public Multiple_mapContext multiple_map() {
			return getRuleContext(Multiple_mapContext.class,0);
		}
		public Multiple_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMultiple_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMultiple_map(this);
		}
	}

	public final Multiple_mapContext multiple_map() throws RecognitionException {
		Multiple_mapContext _localctx = new Multiple_mapContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiple_map);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				multiple_map_atomic();
				setState(105);
				multiple_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				multiple_map_atomic();
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
	public static class Multiple_map_atomicContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode RELATOR() { return getToken(SimpleExamGrammarParser.RELATOR, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleExamGrammarParser.BOOLEAN, 0); }
		public Multiple_map_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_map_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMultiple_map_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMultiple_map_atomic(this);
		}
	}

	public final Multiple_map_atomicContext multiple_map_atomic() throws RecognitionException {
		Multiple_map_atomicContext _localctx = new Multiple_map_atomicContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiple_map_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STRING);
			setState(111);
			match(RELATOR);
			setState(112);
			match(BOOLEAN);
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
		public Token prompt;
		public Token answer;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitShort(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__1);
			setState(115);
			match(QUESTION);
			setState(116);
			((ShortContext)_localctx).prompt = match(STRING);
			setState(117);
			((ShortContext)_localctx).answer = match(STRING);
			setState(118);
			match(DIFFICULTY);
			setState(119);
			match(COL);
			setState(120);
			match(INT);
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
		public Token prompt;
		public Token text;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode KEYS() { return getToken(SimpleExamGrammarParser.KEYS, 0); }
		public List<TerminalNode> COL() { return getTokens(SimpleExamGrammarParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(SimpleExamGrammarParser.COL, i);
		}
		public Key_mapContext key_map() {
			return getRuleContext(Key_mapContext.class,0);
		}
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
		public MissingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterMissing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitMissing(this);
		}
	}

	public final MissingContext missing() throws RecognitionException {
		MissingContext _localctx = new MissingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_missing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__2);
			setState(123);
			match(QUESTION);
			setState(124);
			((MissingContext)_localctx).prompt = match(STRING);
			setState(125);
			((MissingContext)_localctx).text = match(STRING);
			setState(126);
			match(KEYS);
			setState(127);
			match(COL);
			setState(128);
			key_map();
			setState(129);
			match(DIFFICULTY);
			setState(130);
			match(COL);
			setState(131);
			match(INT);
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
		public Key_map_atomicContext key_map_atomic() {
			return getRuleContext(Key_map_atomicContext.class,0);
		}
		public Key_mapContext key_map() {
			return getRuleContext(Key_mapContext.class,0);
		}
		public Key_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterKey_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitKey_map(this);
		}
	}

	public final Key_mapContext key_map() throws RecognitionException {
		Key_mapContext _localctx = new Key_mapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key_map);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				key_map_atomic();
				setState(134);
				key_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				key_map_atomic();
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
	public static class Key_map_atomicContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public TerminalNode RELATOR() { return getToken(SimpleExamGrammarParser.RELATOR, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public Key_map_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_map_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterKey_map_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitKey_map_atomic(this);
		}
	}

	public final Key_map_atomicContext key_map_atomic() throws RecognitionException {
		Key_map_atomicContext _localctx = new Key_map_atomicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key_map_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(INT);
			setState(140);
			match(RELATOR);
			setState(141);
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
	public static class NumContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode REAL() { return getToken(SimpleExamGrammarParser.REAL, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__3);
			setState(144);
			match(QUESTION);
			setState(145);
			match(STRING);
			setState(146);
			match(REAL);
			setState(147);
			match(DIFFICULTY);
			setState(148);
			match(COL);
			setState(149);
			match(INT);
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
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleExamGrammarParser.BOOLEAN, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public True_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterTrue_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitTrue_false(this);
		}
	}

	public final True_falseContext true_false() throws RecognitionException {
		True_falseContext _localctx = new True_falseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_true_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__4);
			setState(152);
			match(QUESTION);
			setState(153);
			match(STRING);
			setState(154);
			match(BOOLEAN);
			setState(155);
			match(DIFFICULTY);
			setState(156);
			match(COL);
			setState(157);
			match(INT);
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
	public static class SectionContext extends ParserRuleContext {
		public Token id;
		public Token desc;
		public Token mDif;
		public Token npool;
		public TerminalNode DEFINE() { return getToken(SimpleExamGrammarParser.DEFINE, 0); }
		public TerminalNode SOME() { return getToken(SimpleExamGrammarParser.SOME, 0); }
		public TerminalNode SECTION() { return getToken(SimpleExamGrammarParser.SECTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public List<TerminalNode> COMA() { return getTokens(SimpleExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SimpleExamGrammarParser.COMA, i);
		}
		public TerminalNode DESCRIPTION() { return getToken(SimpleExamGrammarParser.DESCRIPTION, 0); }
		public TerminalNode MAXIMUM() { return getToken(SimpleExamGrammarParser.MAXIMUM, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(SimpleExamGrammarParser.OF, 0); }
		public TerminalNode USING() { return getToken(SimpleExamGrammarParser.USING, 0); }
		public TerminalNode POOL() { return getToken(SimpleExamGrammarParser.POOL, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public Section_maximum_number_of_questionsContext section_maximum_number_of_questions() {
			return getRuleContext(Section_maximum_number_of_questionsContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DEFINE);
			setState(160);
			match(SOME);
			setState(161);
			match(SECTION);
			setState(162);
			match(WITH);
			setState(163);
			match(ID);
			setState(164);
			((SectionContext)_localctx).id = match(STRING);
			setState(165);
			match(COMA);
			setState(166);
			match(DESCRIPTION);
			setState(167);
			((SectionContext)_localctx).desc = match(STRING);
			setState(168);
			match(COMA);
			setState(169);
			match(MAXIMUM);
			setState(170);
			match(DIFFICULTY);
			setState(171);
			match(OF);
			setState(172);
			((SectionContext)_localctx).mDif = match(INT);
			setState(173);
			match(COMA);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAXIMUM) {
				{
				setState(174);
				section_maximum_number_of_questions();
				}
			}

			setState(177);
			match(USING);
			setState(178);
			match(POOL);
			setState(179);
			((SectionContext)_localctx).npool = match(STRING);
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
	public static class Section_maximum_number_of_questionsContext extends ParserRuleContext {
		public TerminalNode MAXIMUM() { return getToken(SimpleExamGrammarParser.MAXIMUM, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleExamGrammarParser.NUMBER, 0); }
		public List<TerminalNode> OF() { return getTokens(SimpleExamGrammarParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(SimpleExamGrammarParser.OF, i);
		}
		public TerminalNode QUESTIONS() { return getToken(SimpleExamGrammarParser.QUESTIONS, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public Section_maximum_number_of_questionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_maximum_number_of_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterSection_maximum_number_of_questions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitSection_maximum_number_of_questions(this);
		}
	}

	public final Section_maximum_number_of_questionsContext section_maximum_number_of_questions() throws RecognitionException {
		Section_maximum_number_of_questionsContext _localctx = new Section_maximum_number_of_questionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_section_maximum_number_of_questions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(MAXIMUM);
			setState(182);
			match(NUMBER);
			setState(183);
			match(OF);
			setState(184);
			match(QUESTIONS);
			setState(185);
			match(OF);
			setState(186);
			match(INT);
			setState(187);
			match(COMA);
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
		public Token titl;
		public Token desc;
		public Token g;
		public Token f;
		public Token fname;
		public TerminalNode EXPORT() { return getToken(SimpleExamGrammarParser.EXPORT, 0); }
		public TerminalNode EXAM() { return getToken(SimpleExamGrammarParser.EXAM, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SimpleExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SimpleExamGrammarParser.COMA, i);
		}
		public TerminalNode GRADING() { return getToken(SimpleExamGrammarParser.GRADING, 0); }
		public TerminalNode FEEDBACK() { return getToken(SimpleExamGrammarParser.FEEDBACK, 0); }
		public TerminalNode AND() { return getToken(SimpleExamGrammarParser.AND, 0); }
		public TerminalNode SECTIONS() { return getToken(SimpleExamGrammarParser.SECTIONS, 0); }
		public TerminalNode LARR() { return getToken(SimpleExamGrammarParser.LARR, 0); }
		public Sections_arrContext sections_arr() {
			return getRuleContext(Sections_arrContext.class,0);
		}
		public TerminalNode RARR() { return getToken(SimpleExamGrammarParser.RARR, 0); }
		public TerminalNode AS() { return getToken(SimpleExamGrammarParser.AS, 0); }
		public TerminalNode TITLE() { return getToken(SimpleExamGrammarParser.TITLE, 0); }
		public TerminalNode DESCRIPTION() { return getToken(SimpleExamGrammarParser.DESCRIPTION, 0); }
		public List<TerminalNode> HEADER_OPTION() { return getTokens(SimpleExamGrammarParser.HEADER_OPTION); }
		public TerminalNode HEADER_OPTION(int i) {
			return getToken(SimpleExamGrammarParser.HEADER_OPTION, i);
		}
		public ExamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterExam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitExam(this);
		}
	}

	public final ExamContext exam() throws RecognitionException {
		ExamContext _localctx = new ExamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(EXPORT);
			setState(190);
			match(EXAM);
			setState(191);
			match(WITH);
			setState(192);
			((ExamContext)_localctx).titl = match(TITLE);
			setState(193);
			match(STRING);
			setState(194);
			match(COMA);
			setState(195);
			((ExamContext)_localctx).desc = match(DESCRIPTION);
			setState(196);
			match(STRING);
			setState(197);
			match(COMA);
			setState(198);
			match(GRADING);
			setState(199);
			((ExamContext)_localctx).g = match(HEADER_OPTION);
			setState(200);
			match(COMA);
			setState(201);
			match(FEEDBACK);
			setState(202);
			((ExamContext)_localctx).f = match(HEADER_OPTION);
			setState(203);
			match(AND);
			setState(204);
			match(SECTIONS);
			setState(205);
			match(LARR);
			setState(206);
			sections_arr();
			setState(207);
			match(RARR);
			setState(208);
			match(AS);
			setState(209);
			((ExamContext)_localctx).fname = match(STRING);
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
	public static class Sections_arrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public Sections_arrContext sections_arr() {
			return getRuleContext(Sections_arrContext.class,0);
		}
		public Sections_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterSections_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitSections_arr(this);
		}
	}

	public final Sections_arrContext sections_arr() throws RecognitionException {
		Sections_arrContext _localctx = new Sections_arrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sections_arr);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(STRING);
				setState(212);
				match(COMA);
				setState(213);
				sections_arr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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

	public static final String _serializedATN =
		"\u0004\u0001)\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000\f\u00000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bm\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u008a\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00b0\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00d8\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0000\u00d2\u0000)\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000"+
		"\u0004?\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001"+
		"\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000"+
		"\u000e`\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012n"+
		"\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016z\u0001\u0000"+
		"\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008b\u0001\u0000"+
		"\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0097\u0001\u0000"+
		"\u0000\u0000 \u009f\u0001\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000"+
		"\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000("+
		"*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-/\u0003 \u0010\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000023\u0003$\u0012\u00003\u0001\u0001\u0000\u0000\u0000"+
		"45\u0005\b\u0000\u000056\u0005\u001f\u0000\u000067\u0005\u0010\u0000\u0000"+
		"78\u0005$\u0000\u000089\u0005\"\u0000\u00009:\u0003\u0004\u0002\u0000"+
		":\u0003\u0001\u0000\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0003\u0004"+
		"\u0002\u0000=@\u0001\u0000\u0000\u0000>@\u0003\u0006\u0003\u0000?;\u0001"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000"+
		"\u0000AH\u0003\b\u0004\u0000BH\u0003\u000e\u0007\u0000CH\u0003\u0014\n"+
		"\u0000DH\u0003\u0016\u000b\u0000EH\u0003\u001c\u000e\u0000FH\u0003\u001e"+
		"\u000f\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001"+
		"\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0006"+
		"\u0000\u0000JK\u0005\u001f\u0000\u0000KL\u0005$\u0000\u0000LM\u0005\u001e"+
		"\u0000\u0000MN\u0005\"\u0000\u0000NO\u0003\n\u0005\u0000OP\u0005 \u0000"+
		"\u0000PQ\u0005\"\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005\r\u0000\u0000"+
		"ST\u0005\"\u0000\u0000TU\u0005&\u0000\u0000U\t\u0001\u0000\u0000\u0000"+
		"VW\u0003\f\u0006\u0000WX\u0003\n\u0005\u0000X[\u0001\u0000\u0000\u0000"+
		"Y[\u0003\f\u0006\u0000ZV\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\u000b\u0001\u0000\u0000\u0000\\]\u0005&\u0000\u0000]^\u0005\u0007\u0000"+
		"\u0000^_\u0005$\u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\u0001\u0000"+
		"\u0000ab\u0005\u001f\u0000\u0000bc\u0005$\u0000\u0000cd\u0003\u0010\b"+
		"\u0000de\u0005\r\u0000\u0000ef\u0005\"\u0000\u0000fg\u0005&\u0000\u0000"+
		"g\u000f\u0001\u0000\u0000\u0000hi\u0003\u0012\t\u0000ij\u0003\u0010\b"+
		"\u0000jm\u0001\u0000\u0000\u0000km\u0003\u0012\t\u0000lh\u0001\u0000\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005"+
		"$\u0000\u0000op\u0005\u0007\u0000\u0000pq\u0005\'\u0000\u0000q\u0013\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0002\u0000\u0000st\u0005\u001f\u0000\u0000"+
		"tu\u0005$\u0000\u0000uv\u0005$\u0000\u0000vw\u0005\r\u0000\u0000wx\u0005"+
		"\"\u0000\u0000xy\u0005&\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0003\u0000\u0000{|\u0005\u001f\u0000\u0000|}\u0005$\u0000\u0000}~\u0005"+
		"$\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0080\u0005\"\u0000\u0000"+
		"\u0080\u0081\u0003\u0018\f\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082"+
		"\u0083\u0005\"\u0000\u0000\u0083\u0084\u0005&\u0000\u0000\u0084\u0017"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u001a\r\u0000\u0086\u0087\u0003"+
		"\u0018\f\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u008a\u0003\u001a"+
		"\r\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u0019\u0001\u0000\u0000\u0000\u008b\u008c\u0005&\u0000\u0000"+
		"\u008c\u008d\u0005\u0007\u0000\u0000\u008d\u008e\u0005$\u0000\u0000\u008e"+
		"\u001b\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090"+
		"\u0091\u0005\u001f\u0000\u0000\u0091\u0092\u0005$\u0000\u0000\u0092\u0093"+
		"\u0005(\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000\u0094\u0095\u0005"+
		"\"\u0000\u0000\u0095\u0096\u0005&\u0000\u0000\u0096\u001d\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u0099\u0005\u001f"+
		"\u0000\u0000\u0099\u009a\u0005$\u0000\u0000\u009a\u009b\u0005\'\u0000"+
		"\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u009d\u0005\"\u0000\u0000"+
		"\u009d\u009e\u0005&\u0000\u0000\u009e\u001f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\b\u0000\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1\u00a2"+
		"\u0005\n\u0000\u0000\u00a2\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a4\u0005"+
		"\u000b\u0000\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5\u00a6\u0005\u0015"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0016\u0000\u0000\u00a7\u00a8\u0005$\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000\u00a9\u00aa\u0005\f\u0000\u0000"+
		"\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00ac\u0005\u000e\u0000\u0000\u00ac"+
		"\u00ad\u0005&\u0000\u0000\u00ad\u00af\u0005\u0015\u0000\u0000\u00ae\u00b0"+
		"\u0003\"\u0011\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u000f\u0000\u0000\u00b2\u00b3\u0005\u0010\u0000\u0000\u00b3\u00b4\u0005"+
		"$\u0000\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\f\u0000"+
		"\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b8\u0005\u000e\u0000"+
		"\u0000\u00b8\u00b9\u0005\u001e\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000"+
		"\u0000\u00ba\u00bb\u0005&\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000"+
		"\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0011\u0000\u0000\u00be"+
		"\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c0\u0005\u0013\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c2\u0005$\u0000\u0000\u00c2\u00c3"+
		"\u0005\u0015\u0000\u0000\u00c3\u00c4\u0005\u0016\u0000\u0000\u00c4\u00c5"+
		"\u0005$\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0017\u0000\u0000\u00c7\u00c8\u0005%\u0000\u0000\u00c8\u00c9\u0005\u0015"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0018\u0000\u0000\u00ca\u00cb\u0005%\u0000"+
		"\u0000\u00cb\u00cc\u0005\u0019\u0000\u0000\u00cc\u00cd\u0005\u001a\u0000"+
		"\u0000\u00cd\u00ce\u0005\u001b\u0000\u0000\u00ce\u00cf\u0003&\u0013\u0000"+
		"\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0005#\u0000\u0000\u00d1"+
		"\u00d2\u0005$\u0000\u0000\u00d2%\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"$\u0000\u0000\u00d4\u00d5\u0005\u0015\u0000\u0000\u00d5\u00d8\u0003&\u0013"+
		"\u0000\u00d6\u00d8\u0005$\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\'\u0001\u0000\u0000\u0000\t"+
		"+0?GZl\u0089\u00af\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}