import java.util.Scanner;
public class IT24103159Lab3Q1B{
	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double pricePerKg = input.nextDouble();
	
		System.out.print("Enter the number of kilograms you want to buy: ");
		double kilograms = input.nextDouble();

		double totalAmount = pricePerKg * kilograms; 
		
		//System.out.println("The total amount is: "+totalAmount);
 
		double discountRate = 0.10; // 10% discount
		double discountAmount = totalAmount * discountRate;
		double finalAmount = totalAmount-discountAmount;

		System.out.println();

		System.out.println("The total amount with 10% discount is: "+finalAmount);
               
		input.close();

}
}
