
public class Concat implements RegEx{
	RegEx first;
	RegEx second;
	public Concat (RegEx first, RegEx second){
		this.first = first;
		this.second = second;
	}
	

	@Override
	public boolean matches(String s) {

		int firstLast = s.lastIndexOf(first.toString());

		int startSecond = s.indexOf(second.toString());
		
		
		if (firstLast == -1 || startSecond == -1){
			return false;
		}

		String str1 = s.substring(0,firstLast+1);

		String str2 = s.substring(startSecond,s.length());


		if(second.matches(str2)){
			return true;
		}
		return false;
	}

}