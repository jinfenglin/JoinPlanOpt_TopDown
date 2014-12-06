// $ANTLR 3.4 C:\\Users\\P\\Desktop\\Query.g 2014-11-13 15:11:49

	package QueryParser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int ArithmeticExpression=4;
    public static final int Date=5;
    public static final int ID=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QueryLexer() {} 
    public QueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\P\\Desktop\\Query.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:11:6: ( '!=' )
            // C:\\Users\\P\\Desktop\\Query.g:11:8: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:12:6: ( '*' )
            // C:\\Users\\P\\Desktop\\Query.g:12:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:13:7: ( ',' )
            // C:\\Users\\P\\Desktop\\Query.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:14:7: ( '<' )
            // C:\\Users\\P\\Desktop\\Query.g:14:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:15:7: ( '<=' )
            // C:\\Users\\P\\Desktop\\Query.g:15:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:16:7: ( '<>' )
            // C:\\Users\\P\\Desktop\\Query.g:16:9: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:17:7: ( '=' )
            // C:\\Users\\P\\Desktop\\Query.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:18:7: ( '>' )
            // C:\\Users\\P\\Desktop\\Query.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:19:7: ( '>=' )
            // C:\\Users\\P\\Desktop\\Query.g:19:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:20:7: ( 'AND' )
            // C:\\Users\\P\\Desktop\\Query.g:20:9: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:21:7: ( 'FROM' )
            // C:\\Users\\P\\Desktop\\Query.g:21:9: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:22:7: ( 'SELECT' )
            // C:\\Users\\P\\Desktop\\Query.g:22:9: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:23:7: ( 'WHERE' )
            // C:\\Users\\P\\Desktop\\Query.g:23:9: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:24:7: ( '\\'' )
            // C:\\Users\\P\\Desktop\\Query.g:24:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:25:7: ( '_' )
            // C:\\Users\\P\\Desktop\\Query.g:25:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:127:2: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Users\\P\\Desktop\\Query.g:127:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Users\\P\\Desktop\\Query.g:127:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:130:2: ( ( '0' .. '9' )+ '-' ( '0' .. '9' )+ '-' ( '0' .. '9' )+ )
            // C:\\Users\\P\\Desktop\\Query.g:130:4: ( '0' .. '9' )+ '-' ( '0' .. '9' )+ '-' ( '0' .. '9' )+
            {
            // C:\\Users\\P\\Desktop\\Query.g:130:4: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match('-'); 

            // C:\\Users\\P\\Desktop\\Query.g:130:20: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('-'); 

            // C:\\Users\\P\\Desktop\\Query.g:130:36: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:133:2: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\P\\Desktop\\Query.g:133:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\P\\Desktop\\Query.g:133:7: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ArithmeticExpression"
    public final void mArithmeticExpression() throws RecognitionException {
        try {
            int _type = ArithmeticExpression;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\P\\Desktop\\Query.g:136:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\P\\Desktop\\Query.g:136:4: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // C:\\Users\\P\\Desktop\\Query.g:136:4: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            // C:\\Users\\P\\Desktop\\Query.g:136:15: ( '.' ( '0' .. '9' )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\P\\Desktop\\Query.g:136:16: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\P\\Desktop\\Query.g:136:20: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\P\\Desktop\\Query.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ArithmeticExpression"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\P\\Desktop\\Query.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | ID | Date | WS | ArithmeticExpression )
        int alt9=19;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\P\\Desktop\\Query.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // C:\\Users\\P\\Desktop\\Query.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // C:\\Users\\P\\Desktop\\Query.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // C:\\Users\\P\\Desktop\\Query.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // C:\\Users\\P\\Desktop\\Query.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // C:\\Users\\P\\Desktop\\Query.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // C:\\Users\\P\\Desktop\\Query.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // C:\\Users\\P\\Desktop\\Query.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // C:\\Users\\P\\Desktop\\Query.g:1:56: T__16
                {
                mT__16(); 


                }
                break;
            case 10 :
                // C:\\Users\\P\\Desktop\\Query.g:1:62: T__17
                {
                mT__17(); 


                }
                break;
            case 11 :
                // C:\\Users\\P\\Desktop\\Query.g:1:68: T__18
                {
                mT__18(); 


                }
                break;
            case 12 :
                // C:\\Users\\P\\Desktop\\Query.g:1:74: T__19
                {
                mT__19(); 


                }
                break;
            case 13 :
                // C:\\Users\\P\\Desktop\\Query.g:1:80: T__20
                {
                mT__20(); 


                }
                break;
            case 14 :
                // C:\\Users\\P\\Desktop\\Query.g:1:86: T__21
                {
                mT__21(); 


                }
                break;
            case 15 :
                // C:\\Users\\P\\Desktop\\Query.g:1:92: T__22
                {
                mT__22(); 


                }
                break;
            case 16 :
                // C:\\Users\\P\\Desktop\\Query.g:1:98: ID
                {
                mID(); 


                }
                break;
            case 17 :
                // C:\\Users\\P\\Desktop\\Query.g:1:101: Date
                {
                mDate(); 


                }
                break;
            case 18 :
                // C:\\Users\\P\\Desktop\\Query.g:1:106: WS
                {
                mWS(); 


                }
                break;
            case 19 :
                // C:\\Users\\P\\Desktop\\Query.g:1:109: ArithmeticExpression
                {
                mArithmeticExpression(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\4\uffff\1\22\1\uffff\1\24\4\15\3\uffff\1\32\6\uffff\4\15\2\uffff"+
        "\1\37\3\15\1\uffff\1\43\2\15\1\uffff\1\15\1\47\1\50\2\uffff";
    static final String DFA9_eofS =
        "\51\uffff";
    static final String DFA9_minS =
        "\1\11\3\uffff\1\75\1\uffff\1\75\1\116\1\122\1\105\1\110\3\uffff"+
        "\1\55\6\uffff\1\104\1\117\1\114\1\105\2\uffff\1\101\1\115\1\105"+
        "\1\122\1\uffff\1\101\1\103\1\105\1\uffff\1\124\2\101\2\uffff";
    static final String DFA9_maxS =
        "\1\172\3\uffff\1\76\1\uffff\1\75\1\116\1\122\1\105\1\110\3\uffff"+
        "\1\71\6\uffff\1\104\1\117\1\114\1\105\2\uffff\1\172\1\115\1\105"+
        "\1\122\1\uffff\1\172\1\103\1\105\1\uffff\1\124\2\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\5\uffff\1\16\1\17\1\20\1\uffff"+
        "\1\22\1\5\1\6\1\4\1\11\1\10\4\uffff\1\21\1\23\4\uffff\1\12\3\uffff"+
        "\1\13\3\uffff\1\15\1\14";
    static final String DFA9_specialS =
        "\51\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\1\5\uffff\1\13\2\uffff\1"+
            "\2\1\uffff\1\3\3\uffff\12\16\2\uffff\1\4\1\5\1\6\2\uffff\1\7"+
            "\4\15\1\10\14\15\1\11\3\15\1\12\3\15\4\uffff\1\14\1\uffff\32"+
            "\15",
            "",
            "",
            "",
            "\1\20\1\21",
            "",
            "\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "",
            "",
            "\1\31\2\uffff\12\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "\32\15\6\uffff\32\15",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\32\15\6\uffff\32\15",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\32\15\6\uffff\32\15",
            "\32\15\6\uffff\32\15",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | ID | Date | WS | ArithmeticExpression );";
        }
    }
 

}