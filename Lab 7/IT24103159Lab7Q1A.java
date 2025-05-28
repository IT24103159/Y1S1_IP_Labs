import java.util.Scanner;

public class IT24103159Lab7Q1A{
	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter marks for four subjects:");
	
	System.out.print("Enter Subject Mark 1: ");
	double mark1 = myObj.nextDouble();
	
	System.out.print("Enter Subject Mark 2: ");
	double mark2 = myObj.nextDouble();
	
	System.out.print("Enter Subject Mark 3: ");
	double mark3 = myObj.nextDouble();
	
	System.out.print("Enter Subject Mark 4: ");
	double mark4 = myObj.nextDouble();
	
	double sum = mark1 + mark2 + mark3 + mark4;
	double avg = sum / 4;
	
	System.out.println("\nAverage is : "+avg);
	
	if (avg >= 75){
    System.out.println("Overall Grade is : Distinction");
	}else if (avg >= 50){
	  System.out.println("Overall Grade is : Credit");
	}else {
	  System.out.println("Overall Grade is : Fail");
	}

	myObj.close();
	}
}
