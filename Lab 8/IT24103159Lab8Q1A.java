import java.util.Scanner;

public class IT24103159Lab8Q1A{
	
	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter 5 Numbers:");
	
	int count;
	int i = 4;
	int myArray[] = new int[5];
	
	for(count = 1; count <= 5; count++){
	
		System.out.print("Enter Number "+count+": ");
		myArray[i] = myObj.nextInt();
		i--;
	}
	
	System.out.println("\nArray in Reverse Order: ");
	
	for (i = 0; i < myArray.length; i++){
	
		System.out.print(myArray[i] + " " );
		
		if (i == 4)
		  System.out.println();
	}
	
	myObj.close();
	}
}
