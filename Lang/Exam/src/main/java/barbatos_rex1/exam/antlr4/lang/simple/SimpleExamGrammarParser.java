// Generated from D:/Repos/LAPRIV-2022-23/Lang/langs/exam\SimpleExamGrammar.g4 by ANTLR 4.12.0
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AND=6, ANSWERS=7, AS=8, COL=9, 
		COMA=10, DEFINE=11, DESCRIPTION=12, DIFFICULTY=13, EXAM=14, EXPORT=15, 
		FEEDBACK=16, GRADING=17, ID=18, KEYS=19, LARR=20, MATCHING=21, MAXIMUM=22, 
		NUMBER=23, OF=24, POOL=25, QUESTION=26, QUESTIONS=27, RARR=28, RELATOR=29, 
		SECTION=30, SECTIONS=31, SOME=32, TITLE=33, USING=34, WITH=35, STRING=36, 
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
			"'true or false'", "'and'", "'answers'", "'as'", "':'", "','", "'define'", 
			"'description'", "'difficulty'", "'exam'", "'export'", "'feedback'", 
			"'grading'", "'id'", "'keys'", "'['", "'matching'", "'maximum'", "'number'", 
			"'of'", "'pool'", "'question'", "'questions'", "']'", "'<->'", "'section'", 
			"'sections'", "'some'", "'title'", "'using'", "'with'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "AND", "ANSWERS", "AS", "COL", "COMA", 
			"DEFINE", "DESCRIPTION", "DIFFICULTY", "EXAM", "EXPORT", "FEEDBACK", 
			"GRADING", "ID", "KEYS", "LARR", "MATCHING", "MAXIMUM", "NUMBER", "OF", 
			"POOL", "QUESTION", "QUESTIONS", "RARR", "RELATOR", "SECTION", "SECTIONS", 
			"SOME", "TITLE", "USING", "WITH", "STRING", "HEADER_OPTION", "INT", "BOOLEAN", 
			"REAL", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitPool(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitPool_body(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitPool_body_atomic(this);
			else return visitor.visitChildren(this);
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
		public Token id;
		public Token prompt;
		public Matching_mapContext ques;
		public Matching_mapContext asnw;
		public TerminalNode MATCHING() { return getToken(SimpleExamGrammarParser.MATCHING, 0); }
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public TerminalNode QUESTIONS() { return getToken(SimpleExamGrammarParser.QUESTIONS, 0); }
		public List<TerminalNode> COL() { return getTokens(SimpleExamGrammarParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(SimpleExamGrammarParser.COL, i);
		}
		public TerminalNode ANSWERS() { return getToken(SimpleExamGrammarParser.ANSWERS, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
		public List<Matching_mapContext> matching_map() {
			return getRuleContexts(Matching_mapContext.class);
		}
		public Matching_mapContext matching_map(int i) {
			return getRuleContext(Matching_mapContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
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
			match(WITH);
			setState(76);
			match(ID);
			setState(77);
			((MatchingContext)_localctx).id = match(STRING);
			setState(78);
			match(COMA);
			setState(79);
			((MatchingContext)_localctx).prompt = match(STRING);
			setState(80);
			match(QUESTIONS);
			setState(81);
			match(COL);
			setState(82);
			((MatchingContext)_localctx).ques = matching_map();
			setState(83);
			match(ANSWERS);
			setState(84);
			match(COL);
			setState(85);
			((MatchingContext)_localctx).asnw = matching_map();
			setState(86);
			match(DIFFICULTY);
			setState(87);
			match(COL);
			setState(88);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMatching_map(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_mapContext matching_map() throws RecognitionException {
		Matching_mapContext _localctx = new Matching_mapContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matching_map);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				matching_map_atomic();
				setState(91);
				matching_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMatching_map_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matching_map_atomicContext matching_map_atomic() throws RecognitionException {
		Matching_map_atomicContext _localctx = new Matching_map_atomicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matching_map_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(INT);
			setState(97);
			match(RELATOR);
			setState(98);
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
		public Token id;
		public Token prompt;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public Multiple_mapContext multiple_map() {
			return getRuleContext(Multiple_mapContext.class,0);
		}
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleContext multiple() throws RecognitionException {
		MultipleContext _localctx = new MultipleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__0);
			setState(101);
			match(QUESTION);
			setState(102);
			match(WITH);
			setState(103);
			match(ID);
			setState(104);
			((MultipleContext)_localctx).id = match(STRING);
			setState(105);
			match(COMA);
			setState(106);
			((MultipleContext)_localctx).prompt = match(STRING);
			setState(107);
			multiple_map();
			setState(108);
			match(DIFFICULTY);
			setState(109);
			match(COL);
			setState(110);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMultiple_map(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_mapContext multiple_map() throws RecognitionException {
		Multiple_mapContext _localctx = new Multiple_mapContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiple_map);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				multiple_map_atomic();
				setState(113);
				multiple_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMultiple_map_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_map_atomicContext multiple_map_atomic() throws RecognitionException {
		Multiple_map_atomicContext _localctx = new Multiple_map_atomicContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiple_map_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(STRING);
			setState(119);
			match(RELATOR);
			setState(120);
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
		public Token id;
		public Token prompt;
		public Token answer;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__1);
			setState(123);
			match(QUESTION);
			setState(124);
			match(WITH);
			setState(125);
			match(ID);
			setState(126);
			((ShortContext)_localctx).id = match(STRING);
			setState(127);
			match(COMA);
			setState(128);
			((ShortContext)_localctx).prompt = match(STRING);
			setState(129);
			((ShortContext)_localctx).answer = match(STRING);
			setState(130);
			match(DIFFICULTY);
			setState(131);
			match(COL);
			setState(132);
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
		public Token id;
		public Token prompt;
		public Token text;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitMissing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissingContext missing() throws RecognitionException {
		MissingContext _localctx = new MissingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_missing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__2);
			setState(135);
			match(QUESTION);
			setState(136);
			match(WITH);
			setState(137);
			match(ID);
			setState(138);
			((MissingContext)_localctx).id = match(STRING);
			setState(139);
			match(COMA);
			setState(140);
			((MissingContext)_localctx).prompt = match(STRING);
			setState(141);
			((MissingContext)_localctx).text = match(STRING);
			setState(142);
			match(KEYS);
			setState(143);
			match(COL);
			setState(144);
			key_map();
			setState(145);
			match(DIFFICULTY);
			setState(146);
			match(COL);
			setState(147);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitKey_map(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_mapContext key_map() throws RecognitionException {
		Key_mapContext _localctx = new Key_mapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key_map);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				key_map_atomic();
				setState(150);
				key_map();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitKey_map_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_map_atomicContext key_map_atomic() throws RecognitionException {
		Key_map_atomicContext _localctx = new Key_map_atomicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key_map_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(INT);
			setState(156);
			match(RELATOR);
			setState(157);
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
		public Token id;
		public Token prompt;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public TerminalNode REAL() { return getToken(SimpleExamGrammarParser.REAL, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__3);
			setState(160);
			match(QUESTION);
			setState(161);
			match(WITH);
			setState(162);
			match(ID);
			setState(163);
			((NumContext)_localctx).id = match(STRING);
			setState(164);
			match(COMA);
			setState(165);
			((NumContext)_localctx).prompt = match(STRING);
			setState(166);
			match(REAL);
			setState(167);
			match(DIFFICULTY);
			setState(168);
			match(COL);
			setState(169);
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
		public Token id;
		public Token prompt;
		public TerminalNode QUESTION() { return getToken(SimpleExamGrammarParser.QUESTION, 0); }
		public TerminalNode WITH() { return getToken(SimpleExamGrammarParser.WITH, 0); }
		public TerminalNode ID() { return getToken(SimpleExamGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public TerminalNode BOOLEAN() { return getToken(SimpleExamGrammarParser.BOOLEAN, 0); }
		public TerminalNode DIFFICULTY() { return getToken(SimpleExamGrammarParser.DIFFICULTY, 0); }
		public TerminalNode COL() { return getToken(SimpleExamGrammarParser.COL, 0); }
		public TerminalNode INT() { return getToken(SimpleExamGrammarParser.INT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitTrue_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_falseContext true_false() throws RecognitionException {
		True_falseContext _localctx = new True_falseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_true_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__4);
			setState(172);
			match(QUESTION);
			setState(173);
			match(WITH);
			setState(174);
			match(ID);
			setState(175);
			((True_falseContext)_localctx).id = match(STRING);
			setState(176);
			match(COMA);
			setState(177);
			((True_falseContext)_localctx).prompt = match(STRING);
			setState(178);
			match(BOOLEAN);
			setState(179);
			match(DIFFICULTY);
			setState(180);
			match(COL);
			setState(181);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DEFINE);
			setState(184);
			match(SOME);
			setState(185);
			match(SECTION);
			setState(186);
			match(WITH);
			setState(187);
			match(ID);
			setState(188);
			((SectionContext)_localctx).id = match(STRING);
			setState(189);
			match(COMA);
			setState(190);
			match(DESCRIPTION);
			setState(191);
			((SectionContext)_localctx).desc = match(STRING);
			setState(192);
			match(COMA);
			setState(193);
			match(MAXIMUM);
			setState(194);
			match(DIFFICULTY);
			setState(195);
			match(OF);
			setState(196);
			((SectionContext)_localctx).mDif = match(INT);
			setState(197);
			match(COMA);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAXIMUM) {
				{
				setState(198);
				section_maximum_number_of_questions();
				}
			}

			setState(201);
			match(USING);
			setState(202);
			match(POOL);
			setState(203);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitSection_maximum_number_of_questions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_maximum_number_of_questionsContext section_maximum_number_of_questions() throws RecognitionException {
		Section_maximum_number_of_questionsContext _localctx = new Section_maximum_number_of_questionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_section_maximum_number_of_questions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(MAXIMUM);
			setState(206);
			match(NUMBER);
			setState(207);
			match(OF);
			setState(208);
			match(QUESTIONS);
			setState(209);
			match(OF);
			setState(210);
			match(INT);
			setState(211);
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
		public TerminalNode TITLE() { return getToken(SimpleExamGrammarParser.TITLE, 0); }
		public List<TerminalNode> COMA() { return getTokens(SimpleExamGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SimpleExamGrammarParser.COMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SimpleExamGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SimpleExamGrammarParser.STRING, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitExam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExamContext exam() throws RecognitionException {
		ExamContext _localctx = new ExamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(EXPORT);
			setState(214);
			match(EXAM);
			setState(215);
			match(WITH);
			setState(216);
			match(TITLE);
			setState(217);
			((ExamContext)_localctx).titl = match(STRING);
			setState(218);
			match(COMA);
			setState(219);
			((ExamContext)_localctx).desc = match(DESCRIPTION);
			setState(220);
			match(STRING);
			setState(221);
			match(COMA);
			setState(222);
			match(GRADING);
			setState(223);
			((ExamContext)_localctx).g = match(HEADER_OPTION);
			setState(224);
			match(COMA);
			setState(225);
			match(FEEDBACK);
			setState(226);
			((ExamContext)_localctx).f = match(HEADER_OPTION);
			setState(227);
			match(AND);
			setState(228);
			match(SECTIONS);
			setState(229);
			match(LARR);
			setState(230);
			sections_arr();
			setState(231);
			match(RARR);
			setState(232);
			match(AS);
			setState(233);
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
		public Sections_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections_arr; }
	 
		public Sections_arrContext() { }
		public void copyFrom(Sections_arrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Section_atomicContext extends Sections_arrContext {
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public Section_atomicContext(Sections_arrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterSection_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitSection_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitSection_atomic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Section_arrContext extends Sections_arrContext {
		public TerminalNode STRING() { return getToken(SimpleExamGrammarParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(SimpleExamGrammarParser.COMA, 0); }
		public Sections_arrContext sections_arr() {
			return getRuleContext(Sections_arrContext.class,0);
		}
		public Section_arrContext(Sections_arrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).enterSection_arr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExamGrammarListener ) ((SimpleExamGrammarListener)listener).exitSection_arr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExamGrammarVisitor ) return ((SimpleExamGrammarVisitor<? extends T>)visitor).visitSection_arr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sections_arrContext sections_arr() throws RecognitionException {
		Sections_arrContext _localctx = new Sections_arrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sections_arr);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Section_arrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(STRING);
				setState(236);
				match(COMA);
				setState(237);
				sections_arr();
				}
				break;
			case 2:
				_localctx = new Section_atomicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
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
		"\u0004\u0001)\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005_\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bu\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009a\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00c8\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f0\b\u0013"+
		"\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u00ea\u0000"+
		")\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004?\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000"+
		"\u0000\n^\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000ed\u0001"+
		"\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000"+
		"\u0000\u0014z\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000\u0000\u0000"+
		"\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000"+
		"\u001c\u009f\u0001\u0000\u0000\u0000\u001e\u00ab\u0001\u0000\u0000\u0000"+
		" \u00b7\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00d5"+
		"\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(*\u0003\u0002"+
		"\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-/\u0003 \u0010\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000023\u0003$\u0012\u00003\u0001\u0001\u0000\u0000\u000045\u0005\u000b"+
		"\u0000\u000056\u0005\u001a\u0000\u000067\u0005\u0019\u0000\u000078\u0005"+
		"$\u0000\u000089\u0005\t\u0000\u00009:\u0003\u0004\u0002\u0000:\u0003\u0001"+
		"\u0000\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0003\u0004\u0002\u0000"+
		"=@\u0001\u0000\u0000\u0000>@\u0003\u0006\u0003\u0000?;\u0001\u0000\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AH\u0003"+
		"\b\u0004\u0000BH\u0003\u000e\u0007\u0000CH\u0003\u0014\n\u0000DH\u0003"+
		"\u0016\u000b\u0000EH\u0003\u001c\u000e\u0000FH\u0003\u001e\u000f\u0000"+
		"GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000"+
		"\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000"+
		"\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0015\u0000\u0000"+
		"JK\u0005\u001a\u0000\u0000KL\u0005#\u0000\u0000LM\u0005\u0012\u0000\u0000"+
		"MN\u0005$\u0000\u0000NO\u0005\n\u0000\u0000OP\u0005$\u0000\u0000PQ\u0005"+
		"\u001b\u0000\u0000QR\u0005\t\u0000\u0000RS\u0003\n\u0005\u0000ST\u0005"+
		"\u0007\u0000\u0000TU\u0005\t\u0000\u0000UV\u0003\n\u0005\u0000VW\u0005"+
		"\r\u0000\u0000WX\u0005\t\u0000\u0000XY\u0005&\u0000\u0000Y\t\u0001\u0000"+
		"\u0000\u0000Z[\u0003\f\u0006\u0000[\\\u0003\n\u0005\u0000\\_\u0001\u0000"+
		"\u0000\u0000]_\u0003\f\u0006\u0000^Z\u0001\u0000\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005&\u0000\u0000ab\u0005"+
		"\u001d\u0000\u0000bc\u0005$\u0000\u0000c\r\u0001\u0000\u0000\u0000de\u0005"+
		"\u0001\u0000\u0000ef\u0005\u001a\u0000\u0000fg\u0005#\u0000\u0000gh\u0005"+
		"\u0012\u0000\u0000hi\u0005$\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005"+
		"$\u0000\u0000kl\u0003\u0010\b\u0000lm\u0005\r\u0000\u0000mn\u0005\t\u0000"+
		"\u0000no\u0005&\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0003\u0012"+
		"\t\u0000qr\u0003\u0010\b\u0000ru\u0001\u0000\u0000\u0000su\u0003\u0012"+
		"\t\u0000tp\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\u0011\u0001"+
		"\u0000\u0000\u0000vw\u0005$\u0000\u0000wx\u0005\u001d\u0000\u0000xy\u0005"+
		"\'\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z{\u0005\u0002\u0000\u0000"+
		"{|\u0005\u001a\u0000\u0000|}\u0005#\u0000\u0000}~\u0005\u0012\u0000\u0000"+
		"~\u007f\u0005$\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081"+
		"\u0005$\u0000\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0083\u0005\r"+
		"\u0000\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084\u0085\u0005&\u0000"+
		"\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0003\u0000"+
		"\u0000\u0087\u0088\u0005\u001a\u0000\u0000\u0088\u0089\u0005#\u0000\u0000"+
		"\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u008b\u0005$\u0000\u0000\u008b"+
		"\u008c\u0005\n\u0000\u0000\u008c\u008d\u0005$\u0000\u0000\u008d\u008e"+
		"\u0005$\u0000\u0000\u008e\u008f\u0005\u0013\u0000\u0000\u008f\u0090\u0005"+
		"\t\u0000\u0000\u0090\u0091\u0003\u0018\f\u0000\u0091\u0092\u0005\r\u0000"+
		"\u0000\u0092\u0093\u0005\t\u0000\u0000\u0093\u0094\u0005&\u0000\u0000"+
		"\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u001a\r\u0000\u0096"+
		"\u0097\u0003\u0018\f\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0003\u001a\r\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"&\u0000\u0000\u009c\u009d\u0005\u001d\u0000\u0000\u009d\u009e\u0005$\u0000"+
		"\u0000\u009e\u001b\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0004\u0000"+
		"\u0000\u00a0\u00a1\u0005\u001a\u0000\u0000\u00a1\u00a2\u0005#\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00a4\u0005$\u0000\u0000\u00a4"+
		"\u00a5\u0005\n\u0000\u0000\u00a5\u00a6\u0005$\u0000\u0000\u00a6\u00a7"+
		"\u0005(\u0000\u0000\u00a7\u00a8\u0005\r\u0000\u0000\u00a8\u00a9\u0005"+
		"\t\u0000\u0000\u00a9\u00aa\u0005&\u0000\u0000\u00aa\u001d\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac\u00ad\u0005\u001a"+
		"\u0000\u0000\u00ad\u00ae\u0005#\u0000\u0000\u00ae\u00af\u0005\u0012\u0000"+
		"\u0000\u00af\u00b0\u0005$\u0000\u0000\u00b0\u00b1\u0005\n\u0000\u0000"+
		"\u00b1\u00b2\u0005$\u0000\u0000\u00b2\u00b3\u0005\'\u0000\u0000\u00b3"+
		"\u00b4\u0005\r\u0000\u0000\u00b4\u00b5\u0005\t\u0000\u0000\u00b5\u00b6"+
		"\u0005&\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u000b\u0000\u0000\u00b8\u00b9\u0005 \u0000\u0000\u00b9\u00ba\u0005\u001e"+
		"\u0000\u0000\u00ba\u00bb\u0005#\u0000\u0000\u00bb\u00bc\u0005\u0012\u0000"+
		"\u0000\u00bc\u00bd\u0005$\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000"+
		"\u00be\u00bf\u0005\f\u0000\u0000\u00bf\u00c0\u0005$\u0000\u0000\u00c0"+
		"\u00c1\u0005\n\u0000\u0000\u00c1\u00c2\u0005\u0016\u0000\u0000\u00c2\u00c3"+
		"\u0005\r\u0000\u0000\u00c3\u00c4\u0005\u0018\u0000\u0000\u00c4\u00c5\u0005"+
		"&\u0000\u0000\u00c5\u00c7\u0005\n\u0000\u0000\u00c6\u00c8\u0003\"\u0011"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\"\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0019\u0000\u0000\u00cb\u00cc\u0005$\u0000\u0000\u00cc"+
		"!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0016\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0017\u0000\u0000\u00cf\u00d0\u0005\u0018\u0000\u0000\u00d0\u00d1"+
		"\u0005\u001b\u0000\u0000\u00d1\u00d2\u0005\u0018\u0000\u0000\u00d2\u00d3"+
		"\u0005&\u0000\u0000\u00d3\u00d4\u0005\n\u0000\u0000\u00d4#\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u000f\u0000\u0000\u00d6\u00d7\u0005\u000e"+
		"\u0000\u0000\u00d7\u00d8\u0005#\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000"+
		"\u00d9\u00da\u0005$\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db"+
		"\u00dc\u0005\f\u0000\u0000\u00dc\u00dd\u0005$\u0000\u0000\u00dd\u00de"+
		"\u0005\n\u0000\u0000\u00de\u00df\u0005\u0011\u0000\u0000\u00df\u00e0\u0005"+
		"%\u0000\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e2\u0005\u0010"+
		"\u0000\u0000\u00e2\u00e3\u0005%\u0000\u0000\u00e3\u00e4\u0005\u0006\u0000"+
		"\u0000\u00e4\u00e5\u0005\u001f\u0000\u0000\u00e5\u00e6\u0005\u0014\u0000"+
		"\u0000\u00e6\u00e7\u0003&\u0013\u0000\u00e7\u00e8\u0005\u001c\u0000\u0000"+
		"\u00e8\u00e9\u0005\b\u0000\u0000\u00e9\u00ea\u0005$\u0000\u0000\u00ea"+
		"%\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005$\u0000\u0000\u00ec\u00ed\u0005"+
		"\n\u0000\u0000\u00ed\u00f0\u0003&\u0013\u0000\u00ee\u00f0\u0005$\u0000"+
		"\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\'\u0001\u0000\u0000\u0000\t+0?G^t\u0099\u00c7\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}