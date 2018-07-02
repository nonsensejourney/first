public class Calculate{
public static void main(String[] arg){
System.out.println("Calculate...");
int first = Integer.valueOf(arg[0]);
int second = Integer.valueOf(arg[1]);
int summ = first + second;
int sub12 = first - second; 
int mult = first * second;
int div12 = first / second;  
int div21 = second / first; 
System.out.println("Sum is "+ summ +" Sub is "+sub12 + " Mult is "+mult+ " Div is "+div12);
}
}