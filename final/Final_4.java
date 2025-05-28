import java.util.Scanner;

public class Final_4{

	public static double calDiscount(int time, double totalAmount ){
		
		double discount = 0.0;
		if (totalAmount >= 5000){
			if (time == 19 || time == 20){
				discount = totalAmount * 10 / 100;
			
			}else if (time == 22){
				discount = totalAmount * 12 / 100;
			}
		}else if (totalAmount >= 2500 && totalAmount < 5000){
			if (time == 19 || time == 20){
				discount = totalAmount * 7 / 100;
			
			}else if (time == 22){
				discount = totalAmount * 9 / 100;
			}
		
		
		}
		
		return discount;
	
	
	}
	public static void displayGift(double finalTotal){
	
		if (finalTotal >= 7000){
			System.out.println("Packet of Milk");
		}else if (finalTotal < 7000 && finalTotal >= 5000){
			System.out.println("Pack of 6 Eggs");
		}else if (finalTotal < 5000 && finalTotal >= 3000){
			System.out.println("1 Kg of Sugar");
		}else if (finalTotal < 3000 ){
			System.out.println("No Gift");
		}
	
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int timeDis;
		
		do{
			System.out.print("Enter a time : ");
			timeDis = sc.nextInt();
			if (timeDis < 19 || timeDis >= 23){
				System.out.println("invalid time");
			} 
		}while (timeDis < 19 || timeDis >= 23);
		
		System.out.print("Enter a total amount : ");
		double totaAlmount = sc.nextDouble();
		
		double finalTotal = totaAlmount - calDiscount(timeDis, totaAlmount);
		System.out.println("Final total : "+finalTotal);
		
		System.out.print("Free gift: ");
		displayGift(finalTotal);
		
	
		sc.close();
	}



}
