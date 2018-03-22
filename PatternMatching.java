package gui;

import java.io.*;

import org.omg.CORBA.PUBLIC_MEMBER;

import edu.stanford.nlp.patterns.ConstantsAndVariables.PatternIndexWay;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.trees.tregex.*;

public class PatternMatching {
	public String output="";
	public void PatternMatch()throws IOException {
		
		ChooseFile cf = new ChooseFile();
		
		String pattern="NP",sentence;
		Parser parser=new Parser();
		Tree tree=null;
		TregexPattern p=TregexPattern.compile(pattern);
		TregexMatcher m=null;
		
		
		
		String PATH=cf.getPath();
		System.out.println(PATH);
		BufferedReader br=new BufferedReader(new FileReader(PATH));
		int an=657583,dp=6877,ar=6568,at=6582,ka=7571;
		while((sentence=br.readLine())!=null){
			tree=parser.parse(sentence);
			m=p.matcher(tree);
			while(m.find()){
				
				output+="\n"+m.getMatch().toString();
				
			}
		}
		
		
		br.close();
		}
	
	
}
	
