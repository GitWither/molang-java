// Generated from A:/Projects/Programming/Java/molang/src/main/java/com/wither/molang\MoLang.g4 by ANTLR 4.8
package gen.com.wither.molang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, And=6, Or=7, NullCoalescing=8, 
		Not=9, Less=10, LessOrEqual=11, Equal=12, Greater=13, GreaterOrEqual=14, 
		NotEqual=15, Add=16, Subtract=17, Multiply=18, Divide=19, This=20, Return=21, 
		LeftParen=22, RightParen=23, LeftBrace=24, RightBrace=25, LeftBracket=26, 
		RightBracket=27, STRING=28, NUMBER=29, WS=30, Modulus=31;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_binary_conditional_operator = 2, 
		RULE_trinary_conditional_operator = 3, RULE_assignment = 4, RULE_sum = 5, 
		RULE_field = 6, RULE_function_call = 7, RULE_name = 8, RULE_index = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "binary_conditional_operator", "trinary_conditional_operator", 
			"assignment", "sum", "field", "function_call", "name", "index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "';'", "'='", "'.'", "','", "'&&'", "'||'", "'??'", "'!'", 
			"'<'", "'<='", "'=='", "'>'", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'this'", "'return'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "And", "Or", "NullCoalescing", "Not", 
			"Less", "LessOrEqual", "Equal", "Greater", "GreaterOrEqual", "NotEqual", 
			"Add", "Subtract", "Multiply", "Divide", "This", "Return", "LeftParen", 
			"RightParen", "LeftBrace", "RightBrace", "LeftBracket", "RightBracket", 
			"STRING", "NUMBER", "WS", "Modulus"
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
	public String getGrammarFileName() { return "MoLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Binary_conditional_operatorContext binary_conditional_operator() {
			return getRuleContext(Binary_conditional_operatorContext.class,0);
		}
		public Trinary_conditional_operatorContext trinary_conditional_operator() {
			return getRuleContext(Trinary_conditional_operatorContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				binary_conditional_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				trinary_conditional_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				sum(0);
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

	public static class Binary_conditional_operatorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MoLangParser.LeftParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(MoLangParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(MoLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MoLangParser.RightBrace, 0); }
		public Binary_conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterBinary_conditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitBinary_conditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitBinary_conditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_conditional_operatorContext binary_conditional_operator() throws RecognitionException {
		Binary_conditional_operatorContext _localctx = new Binary_conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binary_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(LeftParen);
			setState(29);
			expression();
			setState(30);
			match(RightParen);
			setState(31);
			match(T__0);
			setState(32);
			match(LeftBrace);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << LeftParen) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(33);
				expression();
				setState(34);
				match(T__1);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RightBrace);
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

	public static class Trinary_conditional_operatorContext extends ParserRuleContext {
		public Trinary_conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trinary_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterTrinary_conditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitTrinary_conditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitTrinary_conditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trinary_conditional_operatorContext trinary_conditional_operator() throws RecognitionException {
		Trinary_conditional_operatorContext _localctx = new Trinary_conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trinary_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			field(0);
			setState(46);
			match(T__2);
			setState(47);
			expression();
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

	public static class SumContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public TerminalNode Add() { return getToken(MoLangParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(MoLangParser.Subtract, 0); }
		public TerminalNode Multiply() { return getToken(MoLangParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(MoLangParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(MoLangParser.Modulus, 0); }
		public TerminalNode Equal() { return getToken(MoLangParser.Equal, 0); }
		public TerminalNode Less() { return getToken(MoLangParser.Less, 0); }
		public TerminalNode LessOrEqual() { return getToken(MoLangParser.LessOrEqual, 0); }
		public TerminalNode Greater() { return getToken(MoLangParser.Greater, 0); }
		public TerminalNode GreaterOrEqual() { return getToken(MoLangParser.GreaterOrEqual, 0); }
		public TerminalNode NotEqual() { return getToken(MoLangParser.NotEqual, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(50);
				field(0);
				}
				break;
			case 2:
				{
				setState(51);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(54);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(55);
						match(Add);
						setState(56);
						sum(14);
						}
						break;
					case 2:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(57);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(58);
						match(Subtract);
						setState(59);
						sum(13);
						}
						break;
					case 3:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(60);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(61);
						match(Multiply);
						setState(62);
						sum(12);
						}
						break;
					case 4:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(63);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(64);
						match(Divide);
						setState(65);
						sum(11);
						}
						break;
					case 5:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(66);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(67);
						match(Modulus);
						setState(68);
						sum(10);
						}
						break;
					case 6:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(69);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(70);
						match(Equal);
						setState(71);
						sum(9);
						}
						break;
					case 7:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(72);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(73);
						match(Less);
						setState(74);
						sum(8);
						}
						break;
					case 8:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(75);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(76);
						match(LessOrEqual);
						setState(77);
						sum(7);
						}
						break;
					case 9:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						match(Greater);
						setState(80);
						sum(6);
						}
						break;
					case 10:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						match(GreaterOrEqual);
						setState(83);
						sum(5);
						}
						break;
					case 11:
						{
						_localctx = new SumContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sum);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(NotEqual);
						setState(86);
						sum(4);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MoLangParser.NUMBER, 0); }
		public TerminalNode LeftBracket() { return getToken(MoLangParser.LeftBracket, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MoLangParser.RightBracket, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		return field(0);
	}

	private FieldContext field(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldContext _localctx = new FieldContext(_ctx, _parentState);
		FieldContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_field, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(93);
				name();
				{
				setState(94);
				match(T__3);
				setState(95);
				field(0);
				}
				}
				break;
			case 2:
				{
				setState(97);
				name();
				}
				break;
			case 3:
				{
				setState(98);
				match(NUMBER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field);
					setState(101);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					{
					setState(102);
					match(LeftBracket);
					setState(103);
					index();
					setState(104);
					match(RightBracket);
					}
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode LeftParen() { return getToken(MoLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MoLangParser.RightParen, 0); }
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			name();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(112);
				match(T__3);
				setState(113);
				name();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(LeftParen);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==NUMBER) {
				{
				setState(120);
				sum(0);
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(123);
				match(T__4);
				setState(124);
				sum(0);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(130);
			match(RightParen);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MoLangParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class IndexContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(MoLangParser.NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoLangListener ) ((MoLangListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoLangVisitor ) return ((MoLangVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_index);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				field(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(NUMBER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 6:
			return field_sempred((FieldContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean field_sempred(FieldContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\'\n\4\f\4\16\4*\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\5\7\67\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\t\3\t\3\t\7\tu\n\t\f\t\16\t"+
		"x\13\t\3\t\3\t\5\t|\n\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\5\13\u008b\n\13\3\13\2\4\f\16\f\2\4\6\b\n\f\16"+
		"\20\22\24\2\2\2\u0099\2\26\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b-\3\2\2"+
		"\2\n/\3\2\2\2\f\66\3\2\2\2\16e\3\2\2\2\20q\3\2\2\2\22\u0086\3\2\2\2\24"+
		"\u008a\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\35\5\6\4\2\31\35\5\b\5\2"+
		"\32\35\5\n\6\2\33\35\5\f\7\2\34\30\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2"+
		"\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\30\2\2\37 \5\4\3\2 !\7\31\2\2!\"\7"+
		"\3\2\2\"(\7\32\2\2#$\5\4\3\2$%\7\4\2\2%\'\3\2\2\2&#\3\2\2\2\'*\3\2\2\2"+
		"(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\33\2\2,\7\3\2\2\2-.\3\2\2"+
		"\2.\t\3\2\2\2/\60\5\16\b\2\60\61\7\5\2\2\61\62\5\4\3\2\62\13\3\2\2\2\63"+
		"\64\b\7\1\2\64\67\5\16\b\2\65\67\5\20\t\2\66\63\3\2\2\2\66\65\3\2\2\2"+
		"\67[\3\2\2\289\f\17\2\29:\7\22\2\2:Z\5\f\7\20;<\f\16\2\2<=\7\23\2\2=Z"+
		"\5\f\7\17>?\f\r\2\2?@\7\24\2\2@Z\5\f\7\16AB\f\f\2\2BC\7\25\2\2CZ\5\f\7"+
		"\rDE\f\13\2\2EF\7!\2\2FZ\5\f\7\fGH\f\n\2\2HI\7\16\2\2IZ\5\f\7\13JK\f\t"+
		"\2\2KL\7\f\2\2LZ\5\f\7\nMN\f\b\2\2NO\7\r\2\2OZ\5\f\7\tPQ\f\7\2\2QR\7\17"+
		"\2\2RZ\5\f\7\bST\f\6\2\2TU\7\20\2\2UZ\5\f\7\7VW\f\5\2\2WX\7\21\2\2XZ\5"+
		"\f\7\6Y8\3\2\2\2Y;\3\2\2\2Y>\3\2\2\2YA\3\2\2\2YD\3\2\2\2YG\3\2\2\2YJ\3"+
		"\2\2\2YM\3\2\2\2YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^_\b\b\1\2_`\5\22\n\2`a\7\6\2\2ab\5\16\b"+
		"\2bf\3\2\2\2cf\5\22\n\2df\7\37\2\2e^\3\2\2\2ec\3\2\2\2ed\3\2\2\2fn\3\2"+
		"\2\2gh\f\6\2\2hi\7\34\2\2ij\5\24\13\2jk\7\35\2\2km\3\2\2\2lg\3\2\2\2m"+
		"p\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2qv\5\22\n\2rs\7\6\2"+
		"\2su\5\22\n\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2y{\7\30\2\2z|\5\f\7\2{z\3\2\2\2{|\3\2\2\2|\u0081\3\2\2\2}~\7\7\2\2"+
		"~\u0080\5\f\7\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\31"+
		"\2\2\u0085\21\3\2\2\2\u0086\u0087\7\36\2\2\u0087\23\3\2\2\2\u0088\u008b"+
		"\5\16\b\2\u0089\u008b\7\37\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\25\3\2\2\2\r\34(\66Y[env{\u0081\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}