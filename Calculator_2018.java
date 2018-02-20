import java.util.Scanner;
public class Calculator_2018 {
public static void main(String[]args) {
	Scanner cal=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	Double num1=cal.nextDouble();
	System.out.println("Enter your second number");
	Double num2=cal.nextDouble();
	
	System.out.println("What operation would you like to perform?");
	String Operation=cal.next();
	
	
	if (Operation.equals("addition")) {
		double A=Addition(num1,num2);
	System.out.println(A);	
	
	}
	else if(Operation.equals("subtraction")) {
		double S=Subtraction(num1,num2);
		System.out.println(S);
	}
	else if(Operation.equals("Multiplication")) {
		double M=Product(num1,num2);
		System.out.println(M);
	}
	else if(Operation.equals("Division")) {
		double D=Quotient(num1,num2);
		System.out.println(D);
	}
	else {
		System.out.println("try again");
	}
}
	public static double Addition(double num1, double num2) {
	double add=(num1+ num2);
	return add;
	}
	
	public static double Subtraction(double num1, double num2) {
	double dif=(num1-num2);
	return dif;
	}
	
	public static double Product(double num1, double num2) {
	double multi=(num1*num2);
	return multi;
	}
	
	public static double Quotient(double num1, double num2) {
		double divide=(num1/num2);
		
		return divide;
	}
	
}
