// Generated from NPJ.g4 by ANTLR 4.5.1
package language.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NPJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		NULL=10, INT=11, STRING=12, WS=13;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_variableDeclarationT = 4, RULE_variableDeclarationSConstant = 5, 
		RULE_variableDeclarationSNull = 6, RULE_assignment = 7, RULE_lValue = 8, 
		RULE_rValue = 9, RULE_print = 10, RULE_printStringMessage = 11, RULE_printStringConstant = 12, 
		RULE_heapAnalyze = 13, RULE_collect = 14;
	public static final String[] ruleNames = {
		"program", "statements", "statement", "variableDeclaration", "variableDeclarationT", 
		"variableDeclarationSConstant", "variableDeclarationSNull", "assignment", 
		"lValue", "rValue", "print", "printStringMessage", "printStringConstant", 
		"heapAnalyze", "collect"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'VarDeclT'", "'VarDeclS'", "'\"'", "'='", "'.'", "'Print'", 
		"'HeapAnalyze'", "'Collect'", "'NULL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "NULL", "INT", 
		"STRING", "WS"
	};
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
	public String getGrammarFileName() { return "NPJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NPJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			statements(0);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(33);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(35);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(36);
					statement();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public HeapAnalyzeContext heapAnalyze() {
			return getRuleContext(HeapAnalyzeContext.class,0);
		}
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				variableDeclaration();
				setState(43);
				match(T__0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignment();
				setState(46);
				match(T__0);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				print();
				setState(49);
				match(T__0);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				heapAnalyze();
				setState(52);
				match(T__0);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				collect();
				setState(55);
				match(T__0);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationTContext variableDeclarationT() {
			return getRuleContext(VariableDeclarationTContext.class,0);
		}
		public VariableDeclarationSConstantContext variableDeclarationSConstant() {
			return getRuleContext(VariableDeclarationSConstantContext.class,0);
		}
		public VariableDeclarationSNullContext variableDeclarationSNull() {
			return getRuleContext(VariableDeclarationSNullContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				variableDeclarationT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				variableDeclarationSConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				variableDeclarationSNull();
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

	public static class VariableDeclarationTContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NPJParser.STRING, 0); }
		public VariableDeclarationTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterVariableDeclarationT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitVariableDeclarationT(this);
		}
	}

	public final VariableDeclarationTContext variableDeclarationT() throws RecognitionException {
		VariableDeclarationTContext _localctx = new VariableDeclarationTContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclarationT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
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

	public static class VariableDeclarationSConstantContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(NPJParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(NPJParser.STRING, i);
		}
		public VariableDeclarationSConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationSConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterVariableDeclarationSConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitVariableDeclarationSConstant(this);
		}
	}

	public final VariableDeclarationSConstantContext variableDeclarationSConstant() throws RecognitionException {
		VariableDeclarationSConstantContext _localctx = new VariableDeclarationSConstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclarationSConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__2);
			setState(68);
			match(STRING);
			setState(69);
			match(T__3);
			setState(70);
			match(STRING);
			setState(71);
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

	public static class VariableDeclarationSNullContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NPJParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(NPJParser.NULL, 0); }
		public VariableDeclarationSNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationSNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterVariableDeclarationSNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitVariableDeclarationSNull(this);
		}
	}

	public final VariableDeclarationSNullContext variableDeclarationSNull() throws RecognitionException {
		VariableDeclarationSNullContext _localctx = new VariableDeclarationSNullContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclarationSNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			match(STRING);
			setState(75);
			match(NULL);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			lValue(0);
			setState(78);
			match(T__4);
			setState(79);
			rValue();
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

	public static class LValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NPJParser.STRING, 0); }
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public LValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterLValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitLValue(this);
		}
	}

	public final LValueContext lValue() throws RecognitionException {
		return lValue(0);
	}

	private LValueContext lValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LValueContext _localctx = new LValueContext(_ctx, _parentState);
		LValueContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_lValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			match(STRING);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lValue);
					setState(84);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(85);
					match(T__5);
					setState(86);
					match(STRING);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RValueContext extends ParserRuleContext {
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public TerminalNode NULL() { return getToken(NPJParser.NULL, 0); }
		public TerminalNode INT() { return getToken(NPJParser.INT, 0); }
		public TerminalNode STRING() { return getToken(NPJParser.STRING, 0); }
		public RValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitRValue(this);
		}
	}

	public final RValueContext rValue() throws RecognitionException {
		RValueContext _localctx = new RValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rValue);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				lValue(0);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(NULL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(INT);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(T__3);
				setState(96);
				match(STRING);
				setState(97);
				match(T__3);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintStringMessageContext printStringMessage() {
			return getRuleContext(PrintStringMessageContext.class,0);
		}
		public PrintStringConstantContext printStringConstant() {
			return getRuleContext(PrintStringConstantContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				printStringMessage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				printStringConstant();
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

	public static class PrintStringMessageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NPJParser.STRING, 0); }
		public PrintStringMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStringMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterPrintStringMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitPrintStringMessage(this);
		}
	}

	public final PrintStringMessageContext printStringMessage() throws RecognitionException {
		PrintStringMessageContext _localctx = new PrintStringMessageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printStringMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__6);
			setState(105);
			match(T__3);
			setState(106);
			match(STRING);
			setState(107);
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

	public static class PrintStringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NPJParser.STRING, 0); }
		public PrintStringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterPrintStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitPrintStringConstant(this);
		}
	}

	public final PrintStringConstantContext printStringConstant() throws RecognitionException {
		PrintStringConstantContext _localctx = new PrintStringConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__6);
			setState(110);
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

	public static class HeapAnalyzeContext extends ParserRuleContext {
		public HeapAnalyzeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heapAnalyze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterHeapAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitHeapAnalyze(this);
		}
	}

	public final HeapAnalyzeContext heapAnalyze() throws RecognitionException {
		HeapAnalyzeContext _localctx = new HeapAnalyzeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_heapAnalyze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__7);
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

	public static class CollectContext extends ParserRuleContext {
		public CollectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).enterCollect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NPJListener ) ((NPJListener)listener).exitCollect(this);
		}
	}

	public final CollectContext collect() throws RecognitionException {
		CollectContext _localctx = new CollectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_collect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 8:
			return lValue_sempred((LValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lValue_sempred(LValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\nZ\n\n\f\n\16\n]\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13e\n\13\3\f\3"+
		"\f\5\fi\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\2\4\4\22\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2s\2 \3\2\2\2\4"+
		"\"\3\2\2\2\6;\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fE\3\2\2\2\16K\3\2\2\2\20"+
		"O\3\2\2\2\22S\3\2\2\2\24d\3\2\2\2\26h\3\2\2\2\30j\3\2\2\2\32o\3\2\2\2"+
		"\34r\3\2\2\2\36t\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"#\b\3\1\2#$\5\6\4\2$)\3"+
		"\2\2\2%&\f\3\2\2&(\5\6\4\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*"+
		"\5\3\2\2\2+)\3\2\2\2,-\5\b\5\2-.\7\3\2\2.<\3\2\2\2/\60\5\20\t\2\60\61"+
		"\7\3\2\2\61<\3\2\2\2\62\63\5\26\f\2\63\64\7\3\2\2\64<\3\2\2\2\65\66\5"+
		"\34\17\2\66\67\7\3\2\2\67<\3\2\2\289\5\36\20\29:\7\3\2\2:<\3\2\2\2;,\3"+
		"\2\2\2;/\3\2\2\2;\62\3\2\2\2;\65\3\2\2\2;8\3\2\2\2<\7\3\2\2\2=A\5\n\6"+
		"\2>A\5\f\7\2?A\5\16\b\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\t\3\2\2\2BC\7\4"+
		"\2\2CD\7\16\2\2D\13\3\2\2\2EF\7\5\2\2FG\7\16\2\2GH\7\6\2\2HI\7\16\2\2"+
		"IJ\7\6\2\2J\r\3\2\2\2KL\7\5\2\2LM\7\16\2\2MN\7\f\2\2N\17\3\2\2\2OP\5\22"+
		"\n\2PQ\7\7\2\2QR\5\24\13\2R\21\3\2\2\2ST\b\n\1\2TU\7\16\2\2U[\3\2\2\2"+
		"VW\f\3\2\2WX\7\b\2\2XZ\7\16\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\\23\3\2\2\2][\3\2\2\2^e\5\22\n\2_e\7\f\2\2`e\7\r\2\2ab\7\6\2\2bc\7"+
		"\16\2\2ce\7\6\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2e\25\3\2\2\2"+
		"fi\5\30\r\2gi\5\32\16\2hf\3\2\2\2hg\3\2\2\2i\27\3\2\2\2jk\7\t\2\2kl\7"+
		"\6\2\2lm\7\16\2\2mn\7\6\2\2n\31\3\2\2\2op\7\t\2\2pq\7\16\2\2q\33\3\2\2"+
		"\2rs\7\n\2\2s\35\3\2\2\2tu\7\13\2\2u\37\3\2\2\2\b);@[dh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}