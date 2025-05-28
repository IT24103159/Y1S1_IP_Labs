public class IT24103159Lab9Q3{

  // Method to add two integers
	public static int add(int num1, int num2){
	
		return num1 + num2;
	}
	 // Method to multiply two integers
	public static int multiply(int num1, int num2){
	
		return num1 * num2;
	}
	 // Method to square an integer
	public static int square(int num1){
	
		return num1 * num1;
	}
	
	public static void main(String[] args){
	  
	  // Expression (3 * 4 + 5 * 7)^2
		int part1 = multiply(3, 4);
		int part2 = multiply(5, 7);
		int sum1 = add(part1, part2);
		int ans1 = square(sum1);
		
		// Expression (4 + 7)^2 + (8 + 3)^2
		int sum2 = add(4, 7);
		int sum3 = add(8, 3);
		int part3 = square(sum2);
		int part4 = square(sum3);
		int ans2 = add(part3, part4);
		
		System.out.println("Result of (3 * 4 + 5 * 7)\u00B2      : " + ans1);
		System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2   : " + ans2);
		
		
	}
}
