import java.util.Scanner;

public class IT24103159Lab8Q4{

	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	int count;
	int i = 0;
	int studentsArray[] = new int[8];
	
	for (count = 1; count <= 8;){
		System.out.print("Enter Student ID for Student "+count+": ");
		int enterID = myObj.nextInt();
		
		if (enterID > 0){
			studentsArray[i] = enterID;
			count++;
			i++;
		}else{
			System.out.println("Error: Please Enter ONLY Positive Numbers");
		}
	}
	  System.out.print("\nEnter a Student ID to Search: ");
	  int searchID = myObj.nextInt();
	  
	  boolean found = false;
	  
	  for (i = 0; i < studentsArray.length; i++){
	    if (searchID == studentsArray[i]){
	      found = true;
	      break;
	    }
	  }
	
	  if (found){
	    System.out.println("\nStudent is Available");
	  }else{
	    System.out.println("\nStudent is Not Available");
	  }
	
	
	myObj.close();
	}

}
