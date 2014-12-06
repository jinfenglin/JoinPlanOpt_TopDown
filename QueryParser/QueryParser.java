// $ANTLR 3.4 C:\\Users\\P\\Desktop\\Query.g 2014-11-13 15:11:49

	package QueryParser;
	import logicalPlanTable.LogicalPlanTable;
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class QueryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ArithmeticExpression", "Date", "ID", "WS", "'!='", "'*'", "','", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'AND'", "'FROM'", "'SELECT'", "'WHERE'", "'\\''", "'_'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public QueryParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public QueryParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return QueryParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\P\\Desktop\\Query.g"; }


    	public LogicalPlanTable logPlanTable;
    	private LinkedList<String[]> columnList = new LinkedList<String[]>();
    	private LinkedList<String[]> spredList = new LinkedList<String[]>();
    	private LinkedList<String[]> jpredList = new LinkedList<String[]>();


    public static class query_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // C:\\Users\\P\\Desktop\\Query.g:24:1: query : 'SELECT' ( '*' | columnNameList ) 'FROM' tableNameList ( whereClause )? ;
    public final QueryParser.query_return query() throws RecognitionException {
        QueryParser.query_return retval = new QueryParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal1=null;
        Token char_literal2=null;
        Token string_literal4=null;
        QueryParser.columnNameList_return columnNameList3 =null;

        QueryParser.tableNameList_return tableNameList5 =null;

        QueryParser.whereClause_return whereClause6 =null;


        CommonTree string_literal1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree string_literal4_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:25:2: ( 'SELECT' ( '*' | columnNameList ) 'FROM' tableNameList ( whereClause )? )
            // C:\\Users\\P\\Desktop\\Query.g:25:4: 'SELECT' ( '*' | columnNameList ) 'FROM' tableNameList ( whereClause )?
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal1=(Token)match(input,19,FOLLOW_19_in_query56); 
            string_literal1_tree = 
            (CommonTree)adaptor.create(string_literal1)
            ;
            adaptor.addChild(root_0, string_literal1_tree);


            // C:\\Users\\P\\Desktop\\Query.g:25:13: ( '*' | columnNameList )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\P\\Desktop\\Query.g:25:14: '*'
                    {
                    char_literal2=(Token)match(input,9,FOLLOW_9_in_query59); 
                    char_literal2_tree = 
                    (CommonTree)adaptor.create(char_literal2)
                    ;
                    adaptor.addChild(root_0, char_literal2_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\P\\Desktop\\Query.g:25:18: columnNameList
                    {
                    pushFollow(FOLLOW_columnNameList_in_query61);
                    columnNameList3=columnNameList();

                    state._fsp--;

                    adaptor.addChild(root_0, columnNameList3.getTree());

                    }
                    break;

            }


            string_literal4=(Token)match(input,18,FOLLOW_18_in_query66); 
            string_literal4_tree = 
            (CommonTree)adaptor.create(string_literal4)
            ;
            adaptor.addChild(root_0, string_literal4_tree);


            pushFollow(FOLLOW_tableNameList_in_query68);
            tableNameList5=tableNameList();

            state._fsp--;

            adaptor.addChild(root_0, tableNameList5.getTree());


            		logPlanTable.initColumnList(columnList);
            	

            // C:\\Users\\P\\Desktop\\Query.g:30:3: ( whereClause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\P\\Desktop\\Query.g:30:3: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_query75);
                    whereClause6=whereClause();

                    state._fsp--;

                    adaptor.addChild(root_0, whereClause6.getTree());

                    }
                    break;

            }



            		logPlanTable.initSpredList(spredList);
            		logPlanTable.generatePlans();
            		logPlanTable.initEdgeList(jpredList);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class columnNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnNameList"
    // C:\\Users\\P\\Desktop\\Query.g:38:1: columnNameList : c1= columnName ( ',' cn= columnName )* ;
    public final QueryParser.columnNameList_return columnNameList() throws RecognitionException {
        QueryParser.columnNameList_return retval = new QueryParser.columnNameList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal7=null;
        QueryParser.columnName_return c1 =null;

        QueryParser.columnName_return cn =null;


        CommonTree char_literal7_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:39:2: (c1= columnName ( ',' cn= columnName )* )
            // C:\\Users\\P\\Desktop\\Query.g:39:4: c1= columnName ( ',' cn= columnName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnName_in_columnNameList92);
            c1=columnName();

            state._fsp--;

            adaptor.addChild(root_0, c1.getTree());


            		String[] column1 = new String[2];
            		column1[0] = (c1!=null?c1.tableName:null);
            		column1[1] = (c1!=null?input.toString(c1.start,c1.stop):null).toString();
            		columnList.add(column1);
            	

            // C:\\Users\\P\\Desktop\\Query.g:46:3: ( ',' cn= columnName )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:46:4: ',' cn= columnName
            	    {
            	    char_literal7=(Token)match(input,10,FOLLOW_10_in_columnNameList101); 
            	    char_literal7_tree = 
            	    (CommonTree)adaptor.create(char_literal7)
            	    ;
            	    adaptor.addChild(root_0, char_literal7_tree);


            	    pushFollow(FOLLOW_columnName_in_columnNameList105);
            	    cn=columnName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, cn.getTree());


            	    		String[] column2 = new String[2];
            	    		column2[0] = (cn!=null?cn.tableName:null);
            	    		column2[1] = (cn!=null?input.toString(cn.start,cn.stop):null).toString();
            	    		columnList.add(column2);	
            	    	

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnNameList"


    public static class tableNameList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableNameList"
    // C:\\Users\\P\\Desktop\\Query.g:56:1: tableNameList : tableName ( ',' tableName )* ;
    public final QueryParser.tableNameList_return tableNameList() throws RecognitionException {
        QueryParser.tableNameList_return retval = new QueryParser.tableNameList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal9=null;
        QueryParser.tableName_return tableName8 =null;

        QueryParser.tableName_return tableName10 =null;


        CommonTree char_literal9_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:57:2: ( tableName ( ',' tableName )* )
            // C:\\Users\\P\\Desktop\\Query.g:57:4: tableName ( ',' tableName )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_tableName_in_tableNameList125);
            tableName8=tableName();

            state._fsp--;

            adaptor.addChild(root_0, tableName8.getTree());

            // C:\\Users\\P\\Desktop\\Query.g:57:14: ( ',' tableName )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:57:15: ',' tableName
            	    {
            	    char_literal9=(Token)match(input,10,FOLLOW_10_in_tableNameList128); 
            	    char_literal9_tree = 
            	    (CommonTree)adaptor.create(char_literal9)
            	    ;
            	    adaptor.addChild(root_0, char_literal9_tree);


            	    pushFollow(FOLLOW_tableName_in_tableNameList130);
            	    tableName10=tableName();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tableName10.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableNameList"


    public static class tableName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableName"
    // C:\\Users\\P\\Desktop\\Query.g:60:1: tableName : ( ID | '_' )+ ;
    public final QueryParser.tableName_return tableName() throws RecognitionException {
        QueryParser.tableName_return retval = new QueryParser.tableName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:61:2: ( ( ID | '_' )+ )
            // C:\\Users\\P\\Desktop\\Query.g:61:4: ( ID | '_' )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\P\\Desktop\\Query.g:61:4: ( ID | '_' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:
            	    {
            	    set11=(Token)input.LT(1);

            	    if ( input.LA(1)==ID||input.LA(1)==22 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set11)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
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



            		logPlanTable.addTableRow(input.toString(retval.start,input.LT(-1)).toString());
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableName"


    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // C:\\Users\\P\\Desktop\\Query.g:67:1: whereClause : 'WHERE' predList ;
    public final QueryParser.whereClause_return whereClause() throws RecognitionException {
        QueryParser.whereClause_return retval = new QueryParser.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal12=null;
        QueryParser.predList_return predList13 =null;


        CommonTree string_literal12_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:68:2: ( 'WHERE' predList )
            // C:\\Users\\P\\Desktop\\Query.g:68:4: 'WHERE' predList
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal12=(Token)match(input,20,FOLLOW_20_in_whereClause162); 
            string_literal12_tree = 
            (CommonTree)adaptor.create(string_literal12)
            ;
            adaptor.addChild(root_0, string_literal12_tree);


            pushFollow(FOLLOW_predList_in_whereClause164);
            predList13=predList();

            state._fsp--;

            adaptor.addChild(root_0, predList13.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class predList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predList"
    // C:\\Users\\P\\Desktop\\Query.g:71:1: predList : pred ( 'AND' pred )* ;
    public final QueryParser.predList_return predList() throws RecognitionException {
        QueryParser.predList_return retval = new QueryParser.predList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal15=null;
        QueryParser.pred_return pred14 =null;

        QueryParser.pred_return pred16 =null;


        CommonTree string_literal15_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:72:2: ( pred ( 'AND' pred )* )
            // C:\\Users\\P\\Desktop\\Query.g:72:4: pred ( 'AND' pred )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_pred_in_predList175);
            pred14=pred();

            state._fsp--;

            adaptor.addChild(root_0, pred14.getTree());

            // C:\\Users\\P\\Desktop\\Query.g:72:9: ( 'AND' pred )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\P\\Desktop\\Query.g:72:10: 'AND' pred
            	    {
            	    string_literal15=(Token)match(input,17,FOLLOW_17_in_predList178); 
            	    string_literal15_tree = 
            	    (CommonTree)adaptor.create(string_literal15)
            	    ;
            	    adaptor.addChild(root_0, string_literal15_tree);


            	    pushFollow(FOLLOW_pred_in_predList180);
            	    pred16=pred();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pred16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predList"


    public static class pred_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pred"
    // C:\\Users\\P\\Desktop\\Query.g:74:1: pred : ( jpred | spred );
    public final QueryParser.pred_return pred() throws RecognitionException {
        QueryParser.pred_return retval = new QueryParser.pred_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        QueryParser.jpred_return jpred17 =null;

        QueryParser.spred_return spred18 =null;



        try {
            // C:\\Users\\P\\Desktop\\Query.g:75:2: ( jpred | spred )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==22) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==ID) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==14) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==ID) ) {
                                alt7=1;
                            }
                            else if ( (LA7_4==ArithmeticExpression||LA7_4==21) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA7_3==8||(LA7_3 >= 11 && LA7_3 <= 13)||(LA7_3 >= 15 && LA7_3 <= 16)) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\P\\Desktop\\Query.g:75:4: jpred
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_jpred_in_pred193);
                    jpred17=jpred();

                    state._fsp--;

                    adaptor.addChild(root_0, jpred17.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\P\\Desktop\\Query.g:76:4: spred
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spred_in_pred198);
                    spred18=spred();

                    state._fsp--;

                    adaptor.addChild(root_0, spred18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pred"


    public static class jpred_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jpred"
    // C:\\Users\\P\\Desktop\\Query.g:78:1: jpred : predLeft= columnName '=' predRight= columnName ;
    public final QueryParser.jpred_return jpred() throws RecognitionException {
        QueryParser.jpred_return retval = new QueryParser.jpred_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal19=null;
        QueryParser.columnName_return predLeft =null;

        QueryParser.columnName_return predRight =null;


        CommonTree char_literal19_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:79:2: (predLeft= columnName '=' predRight= columnName )
            // C:\\Users\\P\\Desktop\\Query.g:79:4: predLeft= columnName '=' predRight= columnName
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnName_in_jpred210);
            predLeft=columnName();

            state._fsp--;

            adaptor.addChild(root_0, predLeft.getTree());

            char_literal19=(Token)match(input,14,FOLLOW_14_in_jpred212); 
            char_literal19_tree = 
            (CommonTree)adaptor.create(char_literal19)
            ;
            adaptor.addChild(root_0, char_literal19_tree);


            pushFollow(FOLLOW_columnName_in_jpred216);
            predRight=columnName();

            state._fsp--;

            adaptor.addChild(root_0, predRight.getTree());


            		String[] jpred = new String[4];
            		jpred[0] = (predLeft!=null?predLeft.tableName:null);
            		jpred[1] = (predRight!=null?predRight.tableName:null);
            		jpred[2] = (predLeft!=null?input.toString(predLeft.start,predLeft.stop):null).toString();
            		jpred[3] = (predRight!=null?input.toString(predRight.start,predRight.stop):null).toString();
            		jpredList.add(jpred);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jpred"


    public static class spred_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spred"
    // C:\\Users\\P\\Desktop\\Query.g:90:1: spred : columnName compareOP spredRight ;
    public final QueryParser.spred_return spred() throws RecognitionException {
        QueryParser.spred_return retval = new QueryParser.spred_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        QueryParser.columnName_return columnName20 =null;

        QueryParser.compareOP_return compareOP21 =null;

        QueryParser.spredRight_return spredRight22 =null;



        try {
            // C:\\Users\\P\\Desktop\\Query.g:91:2: ( columnName compareOP spredRight )
            // C:\\Users\\P\\Desktop\\Query.g:91:4: columnName compareOP spredRight
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnName_in_spred230);
            columnName20=columnName();

            state._fsp--;

            adaptor.addChild(root_0, columnName20.getTree());

            pushFollow(FOLLOW_compareOP_in_spred232);
            compareOP21=compareOP();

            state._fsp--;

            adaptor.addChild(root_0, compareOP21.getTree());

            pushFollow(FOLLOW_spredRight_in_spred234);
            spredRight22=spredRight();

            state._fsp--;

            adaptor.addChild(root_0, spredRight22.getTree());

            		
            		String[] spred = new String[2];
            		spred[0] = (columnName20!=null?columnName20.tableName:null);
            		spred[1] = input.toString(retval.start,input.LT(-1)).toString();
            		spredList.add(spred);
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spred"


    public static class compareOP_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compareOP"
    // C:\\Users\\P\\Desktop\\Query.g:99:1: compareOP : ( '=' | '<' | '>' | '<=' | '>=' | '<>' | '!=' );
    public final QueryParser.compareOP_return compareOP() throws RecognitionException {
        QueryParser.compareOP_return retval = new QueryParser.compareOP_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set23=null;

        CommonTree set23_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:100:2: ( '=' | '<' | '>' | '<=' | '>=' | '<>' | '!=' )
            // C:\\Users\\P\\Desktop\\Query.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set23=(Token)input.LT(1);

            if ( input.LA(1)==8||(input.LA(1) >= 11 && input.LA(1) <= 16) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set23)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compareOP"


    public static class spredRight_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spredRight"
    // C:\\Users\\P\\Desktop\\Query.g:109:1: spredRight : ( '\\'' string '\\'' | ArithmeticExpression );
    public final QueryParser.spredRight_return spredRight() throws RecognitionException {
        QueryParser.spredRight_return retval = new QueryParser.spredRight_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal24=null;
        Token char_literal26=null;
        Token ArithmeticExpression27=null;
        QueryParser.string_return string25 =null;


        CommonTree char_literal24_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree ArithmeticExpression27_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:110:2: ( '\\'' string '\\'' | ArithmeticExpression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==ArithmeticExpression) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\P\\Desktop\\Query.g:110:4: '\\'' string '\\''
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal24=(Token)match(input,21,FOLLOW_21_in_spredRight289); 
                    char_literal24_tree = 
                    (CommonTree)adaptor.create(char_literal24)
                    ;
                    adaptor.addChild(root_0, char_literal24_tree);


                    pushFollow(FOLLOW_string_in_spredRight291);
                    string25=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string25.getTree());

                    char_literal26=(Token)match(input,21,FOLLOW_21_in_spredRight293); 
                    char_literal26_tree = 
                    (CommonTree)adaptor.create(char_literal26)
                    ;
                    adaptor.addChild(root_0, char_literal26_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\P\\Desktop\\Query.g:111:4: ArithmeticExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ArithmeticExpression27=(Token)match(input,ArithmeticExpression,FOLLOW_ArithmeticExpression_in_spredRight298); 
                    ArithmeticExpression27_tree = 
                    (CommonTree)adaptor.create(ArithmeticExpression27)
                    ;
                    adaptor.addChild(root_0, ArithmeticExpression27_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spredRight"


    public static class string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // C:\\Users\\P\\Desktop\\Query.g:114:1: string : ( ( ID )+ | Date );
    public final QueryParser.string_return string() throws RecognitionException {
        QueryParser.string_return retval = new QueryParser.string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID28=null;
        Token Date29=null;

        CommonTree ID28_tree=null;
        CommonTree Date29_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:115:2: ( ( ID )+ | Date )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==Date) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\P\\Desktop\\Query.g:115:4: ( ID )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\P\\Desktop\\Query.g:115:4: ( ID )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\P\\Desktop\\Query.g:115:4: ID
                    	    {
                    	    ID28=(Token)match(input,ID,FOLLOW_ID_in_string309); 
                    	    ID28_tree = 
                    	    (CommonTree)adaptor.create(ID28)
                    	    ;
                    	    adaptor.addChild(root_0, ID28_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\P\\Desktop\\Query.g:116:4: Date
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Date29=(Token)match(input,Date,FOLLOW_Date_in_string315); 
                    Date29_tree = 
                    (CommonTree)adaptor.create(Date29)
                    ;
                    adaptor.addChild(root_0, Date29_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class columnName_return extends ParserRuleReturnScope {
        public String tableName;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnName"
    // C:\\Users\\P\\Desktop\\Query.g:119:1: columnName returns [String tableName] : id1= ID '_' ID ;
    public final QueryParser.columnName_return columnName() throws RecognitionException {
        QueryParser.columnName_return retval = new QueryParser.columnName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id1=null;
        Token char_literal30=null;
        Token ID31=null;

        CommonTree id1_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree ID31_tree=null;

        try {
            // C:\\Users\\P\\Desktop\\Query.g:120:2: (id1= ID '_' ID )
            // C:\\Users\\P\\Desktop\\Query.g:120:4: id1= ID '_' ID
            {
            root_0 = (CommonTree)adaptor.nil();


            id1=(Token)match(input,ID,FOLLOW_ID_in_columnName331); 
            id1_tree = 
            (CommonTree)adaptor.create(id1)
            ;
            adaptor.addChild(root_0, id1_tree);


            char_literal30=(Token)match(input,22,FOLLOW_22_in_columnName333); 
            char_literal30_tree = 
            (CommonTree)adaptor.create(char_literal30)
            ;
            adaptor.addChild(root_0, char_literal30_tree);


            ID31=(Token)match(input,ID,FOLLOW_ID_in_columnName335); 
            ID31_tree = 
            (CommonTree)adaptor.create(ID31)
            ;
            adaptor.addChild(root_0, ID31_tree);



            		retval.tableName =(id1!=null?id1.getText():null).toString();
            	

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnName"

    // Delegated rules


 

    public static final BitSet FOLLOW_19_in_query56 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_9_in_query59 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_columnNameList_in_query61 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_query66 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_tableNameList_in_query68 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_whereClause_in_query75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnName_in_columnNameList92 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_columnNameList101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_columnName_in_columnNameList105 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_tableName_in_tableNameList125 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_tableNameList128 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_tableName_in_tableNameList130 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_20_in_whereClause162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_predList_in_whereClause164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pred_in_predList175 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_predList178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_pred_in_predList180 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_jpred_in_pred193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spred_in_pred198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnName_in_jpred210 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_jpred212 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_columnName_in_jpred216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnName_in_spred230 = new BitSet(new long[]{0x000000000001F900L});
    public static final BitSet FOLLOW_compareOP_in_spred232 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_spredRight_in_spred234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_spredRight289 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_string_in_spredRight291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_spredRight293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ArithmeticExpression_in_spredRight298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_string309 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_Date_in_string315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_columnName331 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_columnName333 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_columnName335 = new BitSet(new long[]{0x0000000000000002L});

}