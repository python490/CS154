
public class Iteration implements RegEx{
	RegEx base;
	public Iteration(RegEx base){
		this.base = base;
	}
	@Override
	public boolean matches(String s) {

		for(int i=0;i<s.length();i++){
			String element = "" + s.charAt(i);
			
			if(!base.matches(element)){
				return false;
			}
		}
		return true;
	}
	public String toString(){
		return "" + base.toString();
	}


}
