// Generated from A:/Projects/Programming/Java/molang/src/main/java/com/wither/molang\MoLang.g4 by ANTLR 4.8
package gen.com.wither.molang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, And=6, Or=7, NullCoalescing=8, 
		Not=9, Less=10, LessOrEqual=11, Equal=12, Greater=13, GreaterOrEqual=14, 
		NotEqual=15, Add=16, Subtract=17, Multiply=18, Divide=19, This=20, Return=21, 
		LeftParen=22, RightParen=23, LeftBrace=24, RightBrace=25, LeftBracket=26, 
		RightBracket=27, STRING=28, NUMBER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "And", "Or", "NullCoalescing", 
			"Not", "Less", "LessOrEqual", "Equal", "Greater", "GreaterOrEqual", "NotEqual", 
			"Add", "Subtract", "Multiply", "Divide", "This", "Return", "LeftParen", 
			"RightParen", "LeftBrace", "RightBrace", "LeftBracket", "RightBracket", 
			"STRING", "NUMBER", "WS"
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
			"STRING", "NUMBER", "WS"
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


	public MoLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MoLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u009d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0087\n\35\f\35\16\35\u008a"+
		"\13\35\3\36\6\36\u008d\n\36\r\36\16\36\u008e\3\36\3\36\7\36\u0093\n\36"+
		"\f\36\16\36\u0096\13\36\5\36\u0098\n\36\3\37\3\37\3\37\3\37\2\2 \3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3"+
		"\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2"+
		"\rI\3\2\2\2\17L\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2"+
		"\2\31Y\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37a\3\2\2\2!d\3\2\2\2#f\3\2\2"+
		"\2%h\3\2\2\2\'j\3\2\2\2)l\3\2\2\2+q\3\2\2\2-x\3\2\2\2/z\3\2\2\2\61|\3"+
		"\2\2\2\63~\3\2\2\2\65\u0080\3\2\2\2\67\u0082\3\2\2\29\u0084\3\2\2\2;\u008c"+
		"\3\2\2\2=\u0099\3\2\2\2?@\7A\2\2@\4\3\2\2\2AB\7=\2\2B\6\3\2\2\2CD\7?\2"+
		"\2D\b\3\2\2\2EF\7\60\2\2F\n\3\2\2\2GH\7.\2\2H\f\3\2\2\2IJ\7(\2\2JK\7("+
		"\2\2K\16\3\2\2\2LM\7~\2\2MN\7~\2\2N\20\3\2\2\2OP\7A\2\2PQ\7A\2\2Q\22\3"+
		"\2\2\2RS\7#\2\2S\24\3\2\2\2TU\7>\2\2U\26\3\2\2\2VW\7>\2\2WX\7?\2\2X\30"+
		"\3\2\2\2YZ\7?\2\2Z[\7?\2\2[\32\3\2\2\2\\]\7@\2\2]\34\3\2\2\2^_\7@\2\2"+
		"_`\7?\2\2`\36\3\2\2\2ab\7#\2\2bc\7?\2\2c \3\2\2\2de\7-\2\2e\"\3\2\2\2"+
		"fg\7/\2\2g$\3\2\2\2hi\7,\2\2i&\3\2\2\2jk\7\61\2\2k(\3\2\2\2lm\7v\2\2m"+
		"n\7j\2\2no\7k\2\2op\7u\2\2p*\3\2\2\2qr\7t\2\2rs\7g\2\2st\7v\2\2tu\7w\2"+
		"\2uv\7t\2\2vw\7p\2\2w,\3\2\2\2xy\7*\2\2y.\3\2\2\2z{\7+\2\2{\60\3\2\2\2"+
		"|}\7}\2\2}\62\3\2\2\2~\177\7\177\2\2\177\64\3\2\2\2\u0080\u0081\7]\2\2"+
		"\u0081\66\3\2\2\2\u0082\u0083\7_\2\2\u00838\3\2\2\2\u0084\u0088\t\2\2"+
		"\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089:\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0097\3\2\2\2\u0090\u0094\7\60\2\2\u0091"+
		"\u0093\t\4\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0090\3\2\2\2\u0097\u0098\3\2\2\2\u0098<\3\2\2\2\u0099\u009a\t\5\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\b\37\2\2\u009c>\3\2\2\2\7\2\u0088\u008e"+
		"\u0094\u0097\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}