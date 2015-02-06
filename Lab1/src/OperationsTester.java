import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class OperationsTester {
	
	public static void main(String args []){
		Set<Integer> a = new HashSet<Integer>();
		      
		for(int i = 0; i < 20; i++) a.add(i * 2);
		   
		 Set<Integer>  b = Operations.filter(a,(Integer x)->x%4==0);
		 Set<Integer>  c = Operations.filter(a,(Integer x)->x%6==0);
		 Set<Integer> d = Operations.map(b, (x)->5 * x);
		 Set<Integer> e = Operations.map(b, (x)->10 * x);
		 System.out.println("Original Set1 = " + a);
		 System.out.println("Filter x % 4 == 0");
		 System.out.println("Set after Filter = " + b);
		 System.out.println("Filter x % 6 == 0");
		 System.out.println("Set after Filter = " + c);
		 System.out.println("Map ->5 * x");
		 System.out.println("Set after Map = " + d);
		 System.out.println("Map ->10 * x");
		 System.out.println("Set after Map = " + e);
		 
		      
		  Set<Integer> f = new HashSet<Integer>();
		  f.add(0);
		  f.add(75);
		  f.add(100);
		      
		  Map<Integer,String> map= Operations.Unicodemap(7);
		  Map<Integer,String> map2= Operations.Unicodemap(4);
		  Map<Integer,String> map3= Operations.Unicodemap(0);
		  System.out.println("The unicode map is = " + map + " "+ map2 + " " + map3);
		  Set<Integer> testSet = new HashSet<Integer>();
		  testSet.add(1);
		  testSet.add(2);
		  testSet.add(3);
		  testSet.add(4);
		  Set<Integer> testSet2 = new HashSet<Integer>();
		  testSet2.add(1);
		  testSet2.add(2);
		  testSet2.add(3);
		  testSet2.add(4);
		  testSet2.add(5);
		  testSet2.add(6);
		  System.out.println("Powerset of " +testSet);
		  for (Set<Integer> s : Operations.power(testSet)) {
			  System.out.print(s);
			 }
		  
		  System.out.println("\nPowerset of " +testSet2);
		  for (Set<Integer> s : Operations.power(testSet2)) {
			  System.out.print(s);
			 }	 
			
			
		}


	
}