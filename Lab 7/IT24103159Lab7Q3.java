import java.util.Scanner;

public class IT24103159Lab7Q3{
	public static void main (String[] args){
	
	Scanner myObj = new Scanner(System.in);
	
	int n = 1;
	
	while (n <= 5){
	
	  System.out.println("Customer "+n);
	  
	  System.out.print("Enter total bill amount: ");
	  double totAmount = myObj.nextDouble();
	  
	  System.out.print("Enter mode of payment (C for cash, O for other): ");
	  char payMod = myObj.next().charAt(0);
	  int asciiValue = payMod;
	  
	  
	  if (asciiValue == 67 || asciiValue == 99){
	    
	    double discount = totAmount * 5 / 100;
	    double paidAmount = totAmount - discount;
	    
	    System.out.println("Discount is : "+discount);
	    System.out.println("Amount to be paid : "+paidAmount +"\n");
	    
	  }else if (asciiValue == 79 || asciiValue == 111){
	    
	    System.out.println("No discount applicable");
	    System.out.println("Amount to be paid : "+totAmount +"\n");
	    
	  }else {
	  
	    System.out.println("Payment Mode is Not Valid" +"\n");
	    
	  }
	  n++;
	}
	myObj.close();
	}
}
