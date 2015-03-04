import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FSM {
	private Map<Character,State> map = new HashMap();
	private int finalState = 0;
	private int currentState = 0;
	void addTransition(char token,int state,int newState){
		State s = new State(state,newState);

		map.put(token, s);
		
	}
	
	public boolean accept (String s){
	
		for(int i = 0;i<s.length()-1;i++){
			char symbol = s.charAt(i);
			Character key = new Character(symbol);
			System.out.println(map.get(currentState).map2);
			if(map.get(currentState) != null){
				try{
				int val = map.get(currentState).map2.get(key);
				currentState = val;
				
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
				//System.out.println(val);
				//int tempState = map.get(currentState).getState();
				//currentState = val;
			}
			else{
				currentState = -1;
			}
		}

		if(currentState == finalState){
			return true;
		}
		else{
		return false;
		}
	}
	public void addFinalState(int number){
		finalState = number;
	}

	public class State{
		private int state;
		private int newState;
		private Map<Integer,Integer> map2 = new HashMap();
		public State(int state,int newState){
			this.state = state;
			this.newState = newState;
		}

		public int getnewState(){
			return newState;
		}
		public int getState(){
			return state;
		}
		public Map<Integer,Integer> getMap(){
			return map2;
		}
		public void setTranstition(int state,int newState){
			if(map2.get(state) == null){
				map2.put(state, newState);
				//System.out.println(map2);
			}else{
				map2.put(state, newState);
				//System.out.println(map2);
			}
			//System.out.println(map2);
		}
		
	}

public static void main(String args []){
	FSM m = new FSM();
    m.addTransition('0', 0, 1);
    m.addTransition('0', 1, 1);
    m.addTransition('1', 1, 2);
    m.addTransition('0', 2, 3);
    m.addTransition('1', 2, 2);
    m.addTransition('0', 3, 3);
    m.addFinalState(3);
	//State test = m.map.get(1);
	//System.out.println(test.map2.get('1'));    
    System.out.println("0011100: "+ m.accept("0011100"));
//    System.out.println("01100: "+ m.accept("01100"));
//    System.out.println("11100: "+ m.accept("11100"));
//    System.out.println("001110011: "+ m.accept("001110011"));
	}
}


