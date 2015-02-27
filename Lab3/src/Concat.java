
public class Concat implements RegEx{
	RegEx first;
	RegEx second;
	public Concat (RegEx first, RegEx second){
		this.first = first;
		this.second = second;
	}
	

	@Override
	public boolean matches(String s) {
		//System.out.println(first.toString());
		//System.out.println(second.toString());
		int firstLast = s.lastIndexOf(first.toString());
		//System.out.println(index);
		int startSecond = s.indexOf(second.toString());
		int  lastSecond= s.lastIndexOf(second.toString());
		
		if (firstLast == 0 || lastSecond == -1 || startSecond == 0){
			return false;
		}
		//System.out.println(index2);
		String str1 = s.substring(0,firstLast);
		//System.out.println(str1);
		String str2 = s.substring(startSecond,s.length());
		//System.out.println(str2);
		if(first.matches(str1) && second.matches(str2)){
			return true;
		}
		return false;
	}

}
