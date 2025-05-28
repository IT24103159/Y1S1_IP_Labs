import java.util.Scanner;
public class IT24103159Lab6Q2B{
	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Please enter 10 numbers:");
	
	int inputNum ;
	int num = 1;
	String inputNumStr = "";
	
	while(num <= 10){
	System.out.print("Enter number "+num+": ");
	inputNum = myObj.nextInt();
	
	inputNumStr += String.valueOf(inputNum);
	inputNumStr += " ";
	
	num++;
	}
	System.out.println("\nThe numbers you entered are:");
	System.out.println(inputNumStr);
	
	myObj.close();
	}
}
