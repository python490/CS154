
import java.util.*;
import java.util.function.*;
public class Combinators {
   
   // returns p1 | p2
   public static Parser alt(Parser p1, Parser p2) {
      Parser parser = new Parser();
      parser.setParser(
         result->{
            if (result.fail)return result; 
            Choice answer = new Choice();
            answer.choice = p1.apply(result);
            if (answer.choice.fail)  {
               answer.choice = p2.apply(result);
            }
            if (answer.choice.fail) return answer.choice;
            answer.unseen = answer.choice.unseen;
            return answer;
      });
      return parser;
   }
   
   

}

