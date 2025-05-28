import java.util.Scanner;

public class IT24103159Lab7Q1B{
	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	for (int i = 1; i <= 3; i++){
	System.out.println("Student "+i);
	
	System.out.print("Enter marks: ");
	double mark1 = myObj.nextDouble();
	double mark2 = myObj.nextDouble();
	double mark3 = myObj.nextDouble();
	double mark4 = myObj.nextDouble();
	
	double sum = mark1 + mark2 + mark3 + mark4;
	double avg = sum / 4;
	
	System.out.println("Average is : "+avg);
	
	if (avg >= 75){
    System.out.println("Overall Grade is : Distinction");
	}else if (avg >= 50){
	  System.out.println("Overall Grade is : Credit");
	}else {
	  System.out.println("Overall Grade is : Fail");
	}
  System.out.println();
	}
	myObj.close();
	}
}
