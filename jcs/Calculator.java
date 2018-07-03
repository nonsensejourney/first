/**
*/
public class Calculator{
	/**
	*/
	private int result;
	/**
	*/
	public void add(int... prmtr){
		for (Integer param:prmtr){
			this.result+=param;
		}
	}
	/**
	@return result of calculation
	*/
	public int getResult(){
		return this.result;
	}
	/**
	clean result of calculation
	*/
	public void cleanResult(){
		this.result=0;
	} 
}