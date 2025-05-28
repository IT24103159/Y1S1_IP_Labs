import java.util.Scanner;

public class IT24103159Lab9Q1{

	public static void main (String[] args){
		
		Scanner myObj = new Scanner(System.in);
    
    // Input values for a, b, and c
		System.out.print("Enter value a: ");
		double a = myObj.nextDouble();
		
		System.out.print("Enter value b: ");
		double b = myObj.nextDouble();
		
		System.out.print("Enter value c: ");
		double c = myObj.nextDouble();
		
		// Calculate the discriminant
		double discriminant = Math.pow(b,2) - 4 * a * c;
		
		if (discriminant > 0){
		
		        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
		        
		        System.out.println("\nRoots are real and different :");
		        System.out.println("Root 1: "+root1);
		        System.out.println("Root 2: "+root2);
		
		}else if (discriminant == 0){
		        double root = -b / (2 * a);
		        
            System.out.println("\nRoots are real and the same:");
            System.out.println("Root: " + root);
		
		}else {
		
		        System.out.println("\nRoots are complex");
		}
		
		myObj.close();
	}


}
