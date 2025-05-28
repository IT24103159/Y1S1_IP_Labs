import java.util.Scanner;

public class IT24103159Lab4Q3{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	
	String result = (num > 0) ? 	"The number is: Positive" : (num <0) ? "The number is: Negative" : "The number is Zero";
	System.out.println(result);
	
	input.close();

}
}
	
