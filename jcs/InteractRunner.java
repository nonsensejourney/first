import java.util.*;
import java.lang.System.*;

/**
 
*/
public class InteractRunner{
	
	    static int numberOfOperations = 0;               // shows nuber of operations
		static String serial = "default";                       // shows if previos result will be used in next operation
		static String choice = "not chosen";             // ralated to what exactly operation is
		static String exit = "n";                        // "no" or "yes" as answer on question: are you going to exit?
		static String firstArgument = "default";         // first agrument		
		static String secondArgument = "default";        // first agrument
		static int[] argmnts = {0,0};                        // array of int agruments
    	                       
		//* operation keys */
		static String[] addK={"first addend","second addend","Sum"};
		static String[] subK={"minuend","subtrahend","Difference"};
		static String[] mulK={"multiplicand","multiplier","Product"};
		static String[] divK={"dividend","divisor","Quotient"};
		static String[] keys = {"default","default","default"};
	
	public static void main(String[] arg){
		
				
		//* main instructions */
		System.out.println("Hello!");
		while(!exit.equals("y")){
			Check.chooseOperationorQuit();
			Data.input();
			Calculator.act(choice, argmnts);
			Data.output();
			numberOfOperations++;
			Check.exit();			
		}
		
	}
	//* io data*/
	static class Data{
		String datain = "default";
		static Scanner inreader = new Scanner (System.in);
		
        static void output(){
			System.out.println("____________________");
			System.out.println("");
			System.out.println("Result is "+Calculator.getResult());
			System.out.println("");
		}		
		
		static void input(){
			
			InteractRunner.Data.setKeys();
			
        if (InteractRunner.numberOfOperations==0){
			System.out.println("Enter "+keys[0]+": ");
			InteractRunner.firstArgument = inreader.next();
			System.out.println("Enter "+keys[1]+": ");
			InteractRunner.secondArgument = inreader.next();
			argmnts[0]=Integer.valueOf(InteractRunner.firstArgument);
			argmnts[1]=Integer.valueOf(InteractRunner.secondArgument);
		}
        else{		
		
		    if (InteractRunner.serial.equals("n")) {
			   System.out.println("Enter "+keys[0]+": ");
			   InteractRunner.firstArgument = inreader.next();
			   System.out.println("Enter "+keys[1]+": ");
			   InteractRunner.secondArgument = inreader.next();
			   argmnts[0]=Integer.valueOf(InteractRunner.firstArgument);
			   argmnts[1]=Integer.valueOf(InteractRunner.secondArgument);
		}
		    else if (InteractRunner.serial.equals("y")) {
			        System.out.println("Enter "+keys[1]+": ");
			        InteractRunner.secondArgument = inreader.next();
					InteractRunner.firstArgument = Integer.toString(Calculator.getResult());
					argmnts[0]=Calculator.getResult();
			        argmnts[1]=Integer.valueOf(InteractRunner.secondArgument);
		}
		}	
		}	
		        static void setKeys(){
				     if (InteractRunner.choice.equals("add")) {System.arraycopy(InteractRunner.addK,0,InteractRunner.keys,0,2);}
				else if (InteractRunner.choice.equals("sub")) {System.arraycopy(InteractRunner.subK,0,InteractRunner.keys,0,2);}
				else if (InteractRunner.choice.equals("mul")) {System.arraycopy(InteractRunner.mulK,0,InteractRunner.keys,0,2);}
				else if (InteractRunner.choice.equals("div")) {System.arraycopy(InteractRunner.divK,0,InteractRunner.keys,0,2);}
				}
				
		}
		
	
	//* action manager */
	static class Check{
		static String answer = "default";
		static void chooseOperationorQuit(){
			//String choice = "default";
			
			Scanner creader = new Scanner (System.in);
			System.out.println("Choose operation or quit: add/sub/mul/div/q");
			choice = creader.next();
			
			if(choice.equals("q")) {
				Calculator.cleanResult();
				InteractRunner.exit="y";
                System.out.println("Googbye!"); 				
				}
			else if (choice.equals("add")){
				InteractRunner.choice="add";				
			}
			else if (choice.equals("sub")){
				InteractRunner.choice="sub";
			}
			else if (choice.equals("mul")){
				InteractRunner.choice="mul";
			}
			else if (choice.equals("div")){
				InteractRunner.choice="div";
			}
		}
		static void exit(){
			Scanner areader = new Scanner (System.in);
			System.out.println("Exit? y/n");
			answer = areader.next();
			
			if (answer.equals("y")){
				Calculator.cleanResult();
				InteractRunner.exit = InteractRunner.Check.answer;
                System.out.println("Googbye!"); 				
			}
			else if (answer.equals("n")){
				InteractRunner.Check.serial();
			}
		}
	
	    static void serial(){
			Scanner sreader = new Scanner (System.in);
			System.out.println("Are you going to use previuos result as first argument in next calculation? y/n");
			InteractRunner.serial = sreader.next();
		}
	}		
}
	