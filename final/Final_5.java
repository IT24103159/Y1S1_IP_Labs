import java.util.Scanner;

public class Final_5{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int array1[] = new int[7];
	int array2[] = new int[7];
	
	for (int i = 0; i < array1.length; i++){
		System.out.print("Enter a nmuber : ");
		array1[i] = sc.nextInt();
	}
	int temp = array1[0];
	
	for (int i = 0; i < 6; i++){
		array2[i] = array1[i+1];
	}
	array2[array2.length-1] = temp;
	
	for (int i = 0; i < array2.length; i++){
		System.out.print(" "  + array2[i]);
	}
	
	int min = array2[0];
	for (int i = 0; i < array1.length; i++){
		if (min > array2[i]){
			min = array2[i];
		}
	}
	System.out.println("minimum value is : "  + min);
	
	sc.close();
	}





}
