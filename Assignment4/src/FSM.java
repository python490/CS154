import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class FSM {
	Map<Character,State> map = new HashMap();
	private ArrayList<Integer> finalState = new ArrayList<Integer>();
	private int currentState = 0;
	
	void addTransition(char token,int state,int newState){

		Character current = token;
		if(map.get(current)==null){
			State s1 = new State();
			s1.setTransition(state, newState);
			map.put(token, s1);
		}
		else{
			State n = new State();
			n.transition.putAll(map.get(current).transition);
			n.setTransition(state,newState);
			map.put(token, n);
		}

	}
	
	void addTransitionHelper(int range1 , int range2,int state, int newState){
		for(int i = range1;i<range2;i++){
			Character insert = Character.forDigit(i, 10);
			 addTransition(insert,state,newState);
		}
	}
	

	public boolean accept (String in){
		int currentState = 0;
	    String s = in;
		for(int i = 0;i<=s.length()-1;i++){
			char symbol = s.charAt(i);
			Character temp  = symbol;
			if(map.get(temp) != null){
				State value = map.get(temp);
				//System.out.println(value.transition.get(currentState));
				if(value.transition.get(currentState)!=null){
					int compare = value.transition.get(currentState);
					currentState = compare;
					//System.out.println("After condition: " + currentState);
				}
				else{
					//System.out.println("Setting to negative");
					currentState = -1;
					
				}
			}
			else{
				//System.out.println("Enters here");
				currentState = -1;
				break;
			}
		}
		//System.out.println(currentState);
		if(finalState.contains(currentState)){
			return true;
		}
		else{
		return false;
		}
	
	}

	public void addFinalState(int number){
		finalState.add(number);
	}

	public class State{
		private int state;
		private int newState;
		private Map<Integer,Integer> transition = new Hashtable<Integer, Integer>();

		public int getnewState(){
			return newState;
		}
		public int getState(){
			return state;
		}
		public Map<Integer,Integer> getMap(){
			return transition;
		}
		public void setTransition(int state,int newState){
				transition.put(state, newState);
				
		}
		public void printOut(){
			System.out.println(transition);
		}
	}


}


