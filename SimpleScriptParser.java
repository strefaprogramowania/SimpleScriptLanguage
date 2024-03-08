// Generated from C:/Users/ZEMSTA/IdeaProjects/SimpleScript/SimpleScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19;
	public static final int
		RULE_keyword = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'script_start'", "'script_end'", "'if'", "'while'", "'open'", 
			"'file'", "'create'", "'add'", "'server'", "'color'", "'lib'", "'rev'", 
			"'flay'", "'inp'", "'input'", "'>>'", "'Str'", "'put'", "'build'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "SimpleScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleScriptListener ) ((SimpleScriptListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleScriptVisitor ) return ((SimpleScriptVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keyword);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(5);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(6);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(7);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(8);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(9);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(10);
				match(T__7);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(11);
				match(T__8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(12);
				match(T__9);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(13);
				match(T__10);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(14);
				match(T__11);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(15);
				match(T__12);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(16);
				match(T__13);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(18);
				match(T__14);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(20);
				match(T__15);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(21);
				match(T__16);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(22);
				match(T__17);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(23);
				match(T__18);
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
		"\u0004\u0001\u0013\u001b\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0000\u0000"+
		"\u0001\u0000\u0000\u0000.\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\u0019\u0005\u0001\u0000\u0000\u0004\u0019"+
		"\u0005\u0002\u0000\u0000\u0005\u0019\u0005\u0003\u0000\u0000\u0006\u0019"+
		"\u0005\u0004\u0000\u0000\u0007\u0019\u0005\u0005\u0000\u0000\b\u0019\u0005"+
		"\u0006\u0000\u0000\t\u0019\u0005\u0007\u0000\u0000\n\u0019\u0005\b\u0000"+
		"\u0000\u000b\u0019\u0005\t\u0000\u0000\f\u0019\u0005\n\u0000\u0000\r\u0019"+
		"\u0005\u000b\u0000\u0000\u000e\u0019\u0005\f\u0000\u0000\u000f\u0019\u0005"+
		"\r\u0000\u0000\u0010\u0019\u0005\u000e\u0000\u0000\u0011\u0019\u0001\u0000"+
		"\u0000\u0000\u0012\u0019\u0005\u000f\u0000\u0000\u0013\u0019\u0001\u0000"+
		"\u0000\u0000\u0014\u0019\u0005\u0010\u0000\u0000\u0015\u0019\u0005\u0011"+
		"\u0000\u0000\u0016\u0019\u0005\u0012\u0000\u0000\u0017\u0019\u0005\u0013"+
		"\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000"+
		"\u0000\u0000\u0018\u0004\u0001\u0000\u0000\u0000\u0018\u0005\u0001\u0000"+
		"\u0000\u0000\u0018\u0006\u0001\u0000\u0000\u0000\u0018\u0007\u0001\u0000"+
		"\u0000\u0000\u0018\b\u0001\u0000\u0000\u0000\u0018\t\u0001\u0000\u0000"+
		"\u0000\u0018\n\u0001\u0000\u0000\u0000\u0018\u000b\u0001\u0000\u0000\u0000"+
		"\u0018\f\u0001\u0000\u0000\u0000\u0018\r\u0001\u0000\u0000\u0000\u0018"+
		"\u000e\u0001\u0000\u0000\u0000\u0018\u000f\u0001\u0000\u0000\u0000\u0018"+
		"\u0010\u0001\u0000\u0000\u0000\u0018\u0011\u0001\u0000\u0000\u0000\u0018"+
		"\u0012\u0001\u0000\u0000\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0018"+
		"\u0014\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u0001\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}