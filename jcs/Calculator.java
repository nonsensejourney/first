/**
*/
public class Calculator{
	/**
	*/
	private static int result;
	/**
	general action
	*/
	public static void act(String choice, int... prmtr){
		if (choice.equals("add")){
			Calculator.add(prmtr);
		}
		else if (choice.equals("sub")){
			Calculator.sub(prmtr);
		}
		else if (choice.equals("mul")){
			Calculator.mul(prmtr);
		}
		else if (choice.equals("div")){
			Calculator.div(prmtr);
		}
	}
		/**
	addition
	*/
	public static void add(int... prmtr){
		Calculator.result=prmtr[0]+prmtr[1];
	}
		
	/**
	subtraction
	*/
	public static void sub(int... prmtr){
		Calculator.result=prmtr[0]-prmtr[1];
	}
	
	/**
	multiplication
	*/
	public  static void mul(int... prmtr){
		Calculator.result=prmtr[0]*prmtr[1];
	}
	
	/**
	division
	*/
	public static  void div(int... prmtr){
		Calculator.result=prmtr[0]/prmtr[1];
	}
	
	/**
	@return result of calculation
	*/
	public static int getResult(){
		return Calculator.result;
	}
	
	/**
	clean result of calculation
	*/
	public static void cleanResult(){
		Calculator.result=0;
	} 
	
	
}