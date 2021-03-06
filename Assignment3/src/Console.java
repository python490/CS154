import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Console {
   protected BufferedReader stdin =
      new BufferedReader(
         new InputStreamReader(System.in));
   protected PrintWriter stdout =
      new PrintWriter(
         new BufferedWriter(
            new OutputStreamWriter(System.out)), true);
   protected PrintWriter stderr =
      new PrintWriter(
         new BufferedWriter(
            new OutputStreamWriter(System.err)), true);
   public void controlLoop() {
	      while(true) {
	         try {
	            stdout.print("-> ");
	            stdout.flush(); // force the write
	            String cmmd = stdin.readLine();
	            //cmmd = cmmd.trim(); // trim white space

	            if (cmmd.equalsIgnoreCase("quit")) break;
	            stdout.println(execute(cmmd));
	         } catch(Exception e) {
	            stdout.println(e.getMessage());
	         }
	      } // while
	      stdout.println("bye");
	   }
 private float computation(String symbol, float num1, float num2){
	 String s = symbol;
	 float solution = 0;
	 switch(s){
	 case "*":
		 solution = num1 * num2;
		 break;
	 case "+":
		 solution = num1 + num2;
		 break;
	 case "-":
		 solution = num1 - num2;
		 break;
	 case "/":
		 solution = num1/num2;
		 break;
		 
	 }
	 return solution;
 }
 String execute(String input) {
	System.out.println(input);
	String float1 = "([0-9]*\\.?[0-9]+)(\\s)+(\\+|\\-|\\*|/)(\\s)+([0-9]*\\.?[0-9]+)";
	String math = "([0-9]*\\.?[0-9])?(\\s)?(\\+|-)";
	//([0-9].?[0-9]?)(\s)+(\+|\-)(\s)+([0-9].?[0-9]?)
	Pattern c1 = Pattern.compile(float1);
	Pattern c3 = Pattern.compile(math);
	Matcher m = c1.matcher(input);
	float val1 = 0;
	float val2 = 0;
	float answer = 0;
	String symbol = "";
	while(true){
		try{
			if(m.find()){
			val1 = Float.parseFloat(m.group(1));
			//System.out.println(m.group(5));
			String i = m.group(1);
			//System.out.println("Enters here 1 :" + val1);
			}
		}catch(Exception e){
			return "Invalid Number";
		}
/*
		try{
			String space = m.group(2);
			//System.out.println("Enters here 2 :" + space);
		}catch(Exception e){
			return "Requires a Spaces";
		}
		*/
		try{
			symbol = m.group(3);
			//System.out.println("Enters here 3 :" + symbol);
		}
		catch(Exception e){
			return "Invalid operator";
		}
/*		
		try{
			String space2 = m.group(4);
			String space = m.group(2);
			//System.out.println("Enters here 4 :" + space2);
		}catch(Exception e){
			return "Requires a Spaces";
		}
*/		
		try{
			
			val2 = Float.parseFloat(m.group(5));
			//String s = m.group(5);
			//System.out.println("Enters here 5 :" + val2);

		}catch(Exception e){
			return "Invalid input";
		}
		break;
	}
	answer = computation(symbol,val1,val2);
	return "" +answer;

 } // controlLoop
}

