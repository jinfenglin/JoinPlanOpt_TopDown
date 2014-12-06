package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import logicalPlanTable.LogicalPlanTable;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import QueryParser.QueryLexer;
import QueryParser.QueryParser;

public class ParserAndTranslator {
	
	/**
	 * queryFileLoader is used to load a query file
	 * @return
	 */
	public static String queryFileLoader(){
		/*
		 * fileChooser is used to choose a file
		 */
		FileChooserPopup fileChooser = new FileChooserPopup();
		fileChooser.choose("", "sql");
		String path = fileChooser.filePath;
		String query = "";
		File file = new File(path);
		/*
		 * If no such file, directly return
		 */
		if(!file.exists()){
			return "";
		}
		/*
		 * read the content of the selected file
		 * and return the content string
		 */
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String temp = "";
			while((temp = reader.readLine()) != null){
				query += " ";
				query += temp.toUpperCase();
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			try {
				reader.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		return query;
	}
	
	public static void main(String[] args){
		String query = queryFileLoader();
		ANTLRStringStream in = new ANTLRStringStream(query);
    	QueryLexer lexer = new QueryLexer(in);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        parser.logPlanTable = new LogicalPlanTable();
        try {
			parser.query();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        LogicalPlanTable logTable = parser.logPlanTable;
        logTable.print();
        /**
         * For TPCH_10.sql
         */
		System.out.println(logTable.join("o","(c,n)"));
		System.out.println(logTable.join("l","(o,(c,n))"));
		System.out.println(logTable.getPlan("(l,(o,(c,n)))"));
/*		System.out.println(logTable.join("l","(o,(c, n))"));
		System.out.println(logTable.getPlan("(l,(o,(c, n)))"));
		System.out.println(logTable.join("(l,o)","c"));	
		System.out.println(logTable.getPlan("((l, o),c)"));
		System.out.println(logTable.join("((l,o),c)","n"));
		System.out.println(logTable.getPlan("(((l, o),c),n)"));
		System.out.println(logTable.join("(l,o)","(c,n)"));
		System.out.println(logTable.getPlan("((l, o),(c,n))"));
*/
        /**
         * For TPCH_2.sql
         */
/*        System.out.println(logTable.join("p","(ps,s)"));
		System.out.println(logTable.getPlan("(p,(ps, s))"));
		System.out.println(logTable.getPlan("(n,r)"));
		System.out.println(logTable.join("(n,r)","(p,(ps, s))"));
		System.out.println(logTable.getPlan("((n,r),(p,(ps, s)))"));
*/
	}
}
