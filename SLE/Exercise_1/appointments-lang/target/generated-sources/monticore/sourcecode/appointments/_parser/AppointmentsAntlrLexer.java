// Generated from /Users/hhk/Documents/GitHub/Code/SLE/appointments-lang/target/generated-sources/monticore/sourcecode/appointments/_parser/AppointmentsAntlr.g4 by ANTLR 4.7.1

package appointments._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AppointmentsAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, COLON=14, LCURLY=15, MINUS=16, 
		RCURLY=17, POINT=18, SLASH=19, Name=20, WS=21, SL_COMMENT=22, ML_COMMENT=23, 
		Digits=24, Char=25, String=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "COLON", "LCURLY", "MINUS", "RCURLY", 
		"POINT", "SLASH", "Name", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", 
		"Digits", "Digit", "Char", "SingleCharacter", "String", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", 
		"HexDigit", "OctalDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'true'", "'false'", "'appointment'", "'participants:'", 
		"', '", "'once'", "'daily'", "'weekly'", "'monthly'", "'start'", "'end'", 
		"'break'", "':'", "'{'", "'-'", "'}'", "'.'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "COLON", "LCURLY", "MINUS", "RCURLY", "POINT", "SLASH", "Name", 
		"WS", "SL_COMMENT", "ML_COMMENT", "Digits", "Char", "String"
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





	private AppointmentsAntlrParser _monticore_parser;

	protected AppointmentsAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(AppointmentsAntlrParser in) {
	  this._monticore_parser = in;
	}

	protected void storeComment(){
	  if (getCompiler() != null) {
	    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
	    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
	    _comment.set_SourcePositionStart(startPos);
	    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
	    getCompiler().addComment(_comment);
	  }
	}


	public AppointmentsAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AppointmentsAntlr.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			String_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			_channel=HIDDEN;


			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			storeComment();


			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			storeComment();


			break;
		}
	}
	private void Char_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void String_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return ML_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ML_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LA(2) != '/';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0120\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u00b3\n\25"+
		"\f\25\16\25\u00b6\13\25\3\26\3\26\3\26\5\26\u00bb\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\7\30\u00c4\n\30\f\30\16\30\u00c7\13\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00d4\n\31\f\31\16"+
		"\31\u00d7\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u00e1\n\32"+
		"\r\32\16\32\u00e2\3\33\3\33\3\34\3\34\3\34\5\34\u00ea\n\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\5\36\u00f3\n\36\3\36\3\36\3\36\3\37\6\37\u00f9"+
		"\n\37\r\37\16\37\u00fa\3 \3 \5 \u00ff\n \3!\3!\3!\3!\5!\u0105\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0112\n\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\61"+
		"\31\63\32\65\2\67\339\2;\34=\2?\2A\2C\2E\2G\2I\2K\2\3\2\13\6\2&&C\\aa"+
		"c|\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2\f\f\17\17,,\3"+
		"\2))\4\2$$^^\n\2$$))^^ddhhppttvv\5\2\62;CHch\2\u0123\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\67\3\2\2\2\2;\3\2\2\2\3M\3\2\2\2\5R\3\2\2\2\7W\3\2\2\2\t]\3\2\2\2\13"+
		"i\3\2\2\2\rw\3\2\2\2\17z\3\2\2\2\21\177\3\2\2\2\23\u0085\3\2\2\2\25\u008c"+
		"\3\2\2\2\27\u0094\3\2\2\2\31\u009a\3\2\2\2\33\u009e\3\2\2\2\35\u00a4\3"+
		"\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'"+
		"\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00bf\3\2"+
		"\2\2\61\u00cc\3\2\2\2\63\u00e0\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2"+
		"\29\u00ee\3\2\2\2;\u00f0\3\2\2\2=\u00f8\3\2\2\2?\u00fe\3\2\2\2A\u0104"+
		"\3\2\2\2C\u0111\3\2\2\2E\u0113\3\2\2\2G\u011a\3\2\2\2I\u011c\3\2\2\2K"+
		"\u011e\3\2\2\2MN\7p\2\2NO\7w\2\2OP\7n\2\2PQ\7n\2\2Q\4\3\2\2\2RS\7v\2\2"+
		"ST\7t\2\2TU\7w\2\2UV\7g\2\2V\6\3\2\2\2WX\7h\2\2XY\7c\2\2YZ\7n\2\2Z[\7"+
		"u\2\2[\\\7g\2\2\\\b\3\2\2\2]^\7c\2\2^_\7r\2\2_`\7r\2\2`a\7q\2\2ab\7k\2"+
		"\2bc\7p\2\2cd\7v\2\2de\7o\2\2ef\7g\2\2fg\7p\2\2gh\7v\2\2h\n\3\2\2\2ij"+
		"\7r\2\2jk\7c\2\2kl\7t\2\2lm\7v\2\2mn\7k\2\2no\7e\2\2op\7k\2\2pq\7r\2\2"+
		"qr\7c\2\2rs\7p\2\2st\7v\2\2tu\7u\2\2uv\7<\2\2v\f\3\2\2\2wx\7.\2\2xy\7"+
		"\"\2\2y\16\3\2\2\2z{\7q\2\2{|\7p\2\2|}\7e\2\2}~\7g\2\2~\20\3\2\2\2\177"+
		"\u0080\7f\2\2\u0080\u0081\7c\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2"+
		"\u0083\u0084\7{\2\2\u0084\22\3\2\2\2\u0085\u0086\7y\2\2\u0086\u0087\7"+
		"g\2\2\u0087\u0088\7g\2\2\u0088\u0089\7m\2\2\u0089\u008a\7n\2\2\u008a\u008b"+
		"\7{\2\2\u008b\24\3\2\2\2\u008c\u008d\7o\2\2\u008d\u008e\7q\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7j\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7{\2\2\u0093\26\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7v\2\2\u0099\30\3\2\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u009d\7f\2\2\u009d\32\3\2\2\2\u009e"+
		"\u009f\7d\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2\u00a3\7m\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5\36\3\2\2"+
		"\2\u00a6\u00a7\7}\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\"\3\2\2"+
		"\2\u00aa\u00ab\7\177\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7\60\2\2\u00ad&\3"+
		"\2\2\2\u00ae\u00af\7\61\2\2\u00af(\3\2\2\2\u00b0\u00b4\t\2\2\2\u00b1\u00b3"+
		"\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5*\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\17\2\2"+
		"\u00b8\u00bb\7\f\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb,\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd\u00be\b\27\2\2\u00be"+
		".\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c5\3\2\2"+
		"\2\u00c2\u00c4\n\4\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\b\30\3\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\30\4\2\u00cb\60\3\2"+
		"\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d5\3\2\2\2\u00cf"+
		"\u00d0\6\31\2\2\u00d0\u00d4\7,\2\2\u00d1\u00d4\5+\26\2\u00d2\u00d4\n\6"+
		"\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\61\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\b\31\5\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b"+
		"\31\4\2\u00de\62\3\2\2\2\u00df\u00e1\5\65\33\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\64\3\2\2"+
		"\2\u00e4\u00e5\4\62;\2\u00e5\66\3\2\2\2\u00e6\u00e9\7)\2\2\u00e7\u00ea"+
		"\59\35\2\u00e8\u00ea\5A!\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\b\34\6\2\u00ed8\3\2\2\2"+
		"\u00ee\u00ef\n\7\2\2\u00ef:\3\2\2\2\u00f0\u00f2\7$\2\2\u00f1\u00f3\5="+
		"\37\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\7$\2\2\u00f5\u00f6\b\36\7\2\u00f6<\3\2\2\2\u00f7\u00f9\5? \2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb>\3\2\2\2\u00fc\u00ff\n\b\2\2\u00fd\u00ff\5A!\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff@\3\2\2\2\u0100\u0101\7^\2\2\u0101\u0105"+
		"\t\t\2\2\u0102\u0105\5C\"\2\u0103\u0105\5E#\2\u0104\u0100\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105B\3\2\2\2\u0106\u0107\7^\2\2\u0107"+
		"\u0112\5K&\2\u0108\u0109\7^\2\2\u0109\u010a\5K&\2\u010a\u010b\5K&\2\u010b"+
		"\u0112\3\2\2\2\u010c\u010d\7^\2\2\u010d\u010e\5G$\2\u010e\u010f\5K&\2"+
		"\u010f\u0110\5K&\2\u0110\u0112\3\2\2\2\u0111\u0106\3\2\2\2\u0111\u0108"+
		"\3\2\2\2\u0111\u010c\3\2\2\2\u0112D\3\2\2\2\u0113\u0114\7^\2\2\u0114\u0115"+
		"\7w\2\2\u0115\u0116\5I%\2\u0116\u0117\5I%\2\u0117\u0118\5I%\2\u0118\u0119"+
		"\5I%\2\u0119F\3\2\2\2\u011a\u011b\4\62\65\2\u011bH\3\2\2\2\u011c\u011d"+
		"\t\n\2\2\u011dJ\3\2\2\2\u011e\u011f\4\629\2\u011fL\3\2\2\2\17\2\u00b4"+
		"\u00ba\u00c5\u00d3\u00d5\u00e2\u00e9\u00f2\u00fa\u00fe\u0104\u0111\b\3"+
		"\27\2\3\30\3\b\2\2\3\31\4\3\34\5\3\36\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}