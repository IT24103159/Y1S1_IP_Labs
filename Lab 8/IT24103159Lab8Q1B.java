import java.util.Scanner;

public class IT24103159Lab8Q1B{

	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter 5 Numbers:");
	
	int count;
	int i = 0;
	int myArray[] = new int[5];
	int evenArray[] = new int[5];
	int remainder;
	int n = 0;
	
	for (count = 1; count <= 5; count++){
	
		System.out.print("Enter Number "+count+": ");
		myArray[i] = myObj.nextInt();
		
	  remainder = myArray[i]%2;
	  if (remainder == 0){
	    evenArray[n] = myArray[i];
	    n++;
    }
	  
		i++;
		
	}
	
	System.out.println("\nmyArray Contents: ");
	
	for (i = 0; i < myArray.length; i++){
	
		System.out.print(myArray[i] + " " );
		
		if (i == 4)
		  System.out.println();
	}
	
	System.out.println("\nevenArray Contents: ");
	
	for (n = 0; n < evenArray.length; n++){
	
		System.out.print(evenArray[n] + " " );
		
		if (n == 4)
		  System.out.println();
	}
	
	
	myObj.close();
	}

}
