
public class Concatination extends Result {
	private Result kid0, kid1;
	
	public void setConcatination(Result result0, Result result1){
		this.kid0 = result0;
		this.kid1 = result1;
	}
	
	public String toString(){
		return "" + kid0 + "" + kid1;
	}
}
