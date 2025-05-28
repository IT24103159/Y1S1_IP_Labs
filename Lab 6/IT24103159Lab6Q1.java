import java.util.Scanner;
public class IT24103159Lab6Q1{
	public static void main(String[] args){
	
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = myObj.nextDouble();
		
		double square = num * num;
		System.out.println("The square of "+num+" is : "+square);
		
		double squareRoot = Math.sqrt(num);
		System.out.println("The squre root of "+num+" is : "+squareRoot);
		
	myObj.close();
	}
}
