import java.util.Scanner;

public class IT24103159Lab5Q3{
	public static void main(String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.print("Enter Start Date (1-31): ");
	int startDate = myObj.nextInt();
	
	System.out.print("Enter End Date (1-31): ");
	int endDate = myObj.nextInt();
	
	if ((startDate<1 || startDate>31) || (endDate<1 || endDate>31)){
		System.out.println("Error: Days must be between 1 and 31");
	}else{
	    if (startDate > endDate){
	      System.out.println("Error: Start Date must be less than End Date");
	    }else{
	      int numDays = endDate - startDate;
	      double roomCharge = 48000;
	      double totAmount;
	      
	      System.out.println("");
	      System.out.println("Room Charges Per Day: Rs. "+roomCharge+"/=");
	      System.out.println("Number of Days Reserved: "+numDays);
	      
	      if ( numDays < 3){
	        totAmount = numDays*roomCharge;
	        System.out.println("Total Amount to be Paid: "+totAmount);
	      }else if ( numDays >= 5){
	        totAmount = numDays*roomCharge*80/100;
	        System.out.println("Total Amount to be Paid: "+totAmount);
	      }else {
	        totAmount = numDays*roomCharge*90/100;
	        System.out.println("Total Amount to be Paid: "+totAmount);
	     }
	    }
	}
	
	myObj.close();
	}
}
