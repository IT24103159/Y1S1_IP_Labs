import java.util.Scanner;

public class IT24103159Lab8Q3{

	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	int count;
	int i = 0;
	int positiveNum[] = new int[6];
	int max = positiveNum[0];
	
	for (count = 1; count <= 6; ){
	
		System.out.print("Enter a Positive Number ("+count+"/6): ");
		int enterNum = myObj.nextInt();
		if (enterNum > 0){
			positiveNum[i] = enterNum;
			i++;
			count++;
		}else{
			System.out.println("Error: Please Enter ONLY Positive Numbers");
		}
		
	}
	System.out.println("\nArray Contents:");
	for (i = 0; i < 6; i++){
	  System.out.print(positiveNum[i]+" ");
	  if (i == 5)
		  System.out.println();
	
	}
	
	for (i = 0; i < 6; i++ ){
	  if (positiveNum[i] > max){
	    max = positiveNum[i];
	  }
	
	}
	System.out.println("The Maximum Number Entered: "+max);
	myObj.close();
	}
}
