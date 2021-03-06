
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
		int flen = first.toString().length();
		int startSecond = s.indexOf(second.toString());
		boolean flag = false;
		boolean flag2 = false;
		
		if (firstLast == -1 || startSecond == -1){
			return false;
		}

		String str1 = s.substring(0,firstLast+1);

		String str2 = s.substring(startSecond,s.length());
		/*
		int jump = flen;
		for(int i = 0;i<str1.length();i++){
			String s1 = str1.substring(i,jump);
			//System.out.println(s1);
			if(!first.matches(s1)){
				return false;
			}
			i += flen;
			jump += flen;
			
		}
		return true;
		*/
		
		if(first.matches(str1) && second.matches(str2)){
			return true;
		}
		return false;
	
	}
}
