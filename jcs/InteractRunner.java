import java.util.Scanner;

/**
starting Calvulatir, providing input user's data
*/
public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner (System.in);
		try{
			Calculator calc = new Calculator();
			String exit ="n";
			while (!exit.equals("y")){
				System.out.println("Enter first argument: ");
				String first = reader.next();
				System.out.println("Enter second argument: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("Result is "+calc.getResult());
				calc.cleanResult();
				System.out.println("Exit:y/n");
				exit=reader.next();
			}
		}
			finally{
				reader.close();
			}
		}
	}