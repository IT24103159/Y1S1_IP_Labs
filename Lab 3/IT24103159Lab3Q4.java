import java.util.Scanner;

public class IT24103159Lab3Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number: ");
		
		int enterNum = input.nextInt();
		
		if (enterNum>99999){
			System.out.println("Please Enter a five-digit number");
			
			} else {
			  System.out.println("");
		
		int fiveDigit = enterNum / 10000;
		  if (fiveDigit>0){
		    System.out.print(+fiveDigit);
		  
		  }
		enterNum = enterNum % 10000;
		
		int fourDigit = enterNum / 1000;
		  if (fourDigit>0){
		    System.out.print(" "+fourDigit);
		  
		  }
		enterNum = enterNum % 1000;
		
		int threeDigit = enterNum / 100;
		  if (threeDigit>0){
		    System.out.print(" "+threeDigit);
		  
		  }
		enterNum = enterNum % 100;
		
		int twoDigit = enterNum / 10;
		  if (twoDigit>0){
		    System.out.print(" "+twoDigit);
		  
		  }
		enterNum = enterNum % 10;
		
		int oneDigit = enterNum / 1;
		  if (oneDigit>0){
		    System.out.println(" "+oneDigit);
		  
		  }
			}
			
		
		
		
		
		input.close();
		
}
}
