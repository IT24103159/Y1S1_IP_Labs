import java.util.Scanner;

public class Final_3{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int sum = 0;
	int remainder;
	
	for (int count = 1; count != 0; count++){
	System.out.print("Enter a number : ");
	int enterNum = sc.nextInt();
	
	if (enterNum != -99){
		for (int i = 1; i <= 20; i++){
		
			remainder = i % enterNum;
			if (remainder != 0){
				sum = sum + i;
			}
		
		}
		System.out.println("Sum is : "+sum);
		
		  if (sum >= 150){
		  
		    
		  }
		sum = 0;
	}else{
		break;
	}
	}
	
	
	
	sc.close();
	}


}
