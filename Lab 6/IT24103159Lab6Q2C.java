import java.util.Scanner;
public class IT24103159Lab6Q2C{
	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Please enter 10 numbers:");
	
	int inputNum ;
	int num = 1;
	String inputNumStr = "";
	int sum =0;
	double avg ;
	
	while(num <= 10){
	System.out.print("Enter number "+num+": ");
	inputNum = myObj.nextInt();
	
	sum = sum + inputNum ;
	
	inputNumStr += String.valueOf(inputNum);
	inputNumStr += " ";
	
	num++;
	}
	System.out.println("\nThe numbers you entered are:");
	System.out.println(inputNumStr);
	
	System.out.println("\nSum of the numbers: "+sum);
	
	num = num -1;      // num = 11
	avg = (double) sum / num ;
	System.out.println("Average of the numbers: "+avg);
	
	myObj.close();
	}
}
