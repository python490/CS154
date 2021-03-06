
public class Tester {

	
	static void Lab5(){
		FSM m = new FSM();
	    m.addTransition('0', 0, 1);
	    m.addTransition('0', 1, 1);
	    m.addTransition('1', 1, 2);
	    m.addTransition('0', 2, 3);
	    m.addTransition('1', 2, 2);
	    m.addTransition('0', 3, 3);
	    m.addFinalState(3);

	    System.out.println("001110: "+ m.accept("001110"));
	    System.out.println("01100: "+ m.accept("01100"));
	    System.out.println("11100: "+ m.accept("11100"));
	    System.out.println("001110011: "+ m.accept("001110011"));
		}
	
	static void natRegEx(){

		FSM m = new FSM();
		m.addTransition('0', 0, 1);
		m.addTransition('0', 1, 2);
		m.addTransitionHelper(1, 10, 0, 3);
		m.addTransitionHelper(1, 10, 3, 3);
		m.addTransitionHelper(0, 10, 3, 3);
		m.addFinalState(3);
		m.addFinalState(1);
		//System.out.println(m.map.get('2'));
	    System.out.println("0: "+ m.accept("0"));
	    System.out.println("111222: "+ m.accept("111222"));
	    System.out.println("00000: "+ m.accept("00000"));
	    System.out.println("111u555: "+ m.accept("111u555"));
	
	}
	
	static void dateRegEx(){
		FSM m = new FSM();
		m.addTransitionHelper(0,10,0,1);
		m.addTransitionHelper(0,10,1,2);
		m.addTransition('/',2,3);
		m.addTransitionHelper(0,10,3,4);
		m.addTransitionHelper(0,10,4,5);
		m.addTransition('/',5,6);
		m.addTransitionHelper(0,10,6,7);
		m.addTransitionHelper(0,10,7,8);
		
		m.addFinalState(8);
	    System.out.println("12/05/92: "+ m.accept("12/05/92"));
	    System.out.println("03/15/33: "+ m.accept("03/15/33"));
	    System.out.println("122/055/922/: "+ m.accept("122/055/922"));
	    System.out.println("1/15/2013: "+ m.accept("1/15/2013"));
	}
	
	static void nameRegEx(){
		FSM m = new FSM();
		m.addTransition('a', 0, 1);
		m.addTransition('b', 0, 1);
		m.addTransition('c', 0, 1);
		m.addTransition('a', 1, 1);
		m.addTransition('b', 1, 1);
		m.addTransition('c', 1, 1);
		m.addTransitionHelper(0, 10, 1, 1);
		m.addFinalState(1);
	    System.out.println("a9: "+ m.accept("a9"));
	    System.out.println("bb: "+ m.accept("bb"));
	    System.out.println("rabbcc55464: "+ m.accept("rabbcc55464"));
	    System.out.println("aaaaad97: "+ m.accept("aaaaad97"));
	}
	public static void main(String args []){
		System.out.println("LAB 5 -------");
		Lab5();
		System.out.println();
		System.out.println("LAB6 -------");
		System.out.println("+++++ NAT REG EX +++++");
		natRegEx();
		System.out.println("+++++DATE REG EX +++++");
		dateRegEx();
		System.out.println("+++++ NAME REG EX +++++");
		nameRegEx();
		}
}
