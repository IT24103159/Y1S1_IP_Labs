import java.util.Scanner;

public class Final_6{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int matrixA[][] = new int[4][4];
	int matrixB[][] = new int[4][4];
	int sum = 0;
	
	for (int i = 0; i < 4; i++){
		for (int j = 0; j < 4; j++){
			System.out.print("Enter a number : ");
			matrixA[i][j] = sc.nextInt();
		}
	System.out.println();	
	}
	for (int j = 0; j < 4; j++){
		for (int i = 0; i < 4; i++){
			matrixB[j][i] = matrixA[i][j];
		
		}
	}
	for (int i = 0; i < 4; i++){
		for (int j = 0; j < 4; j++){
			System.out.print(" " + matrixA[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 0; i < 4; i++){
		for (int j = 0; j < 4; j++){
			System.out.print(" " + matrixB[i][j]);
		}
		System.out.println();
	}
	
	for (int i = 0; i < 4; i++){
		for (int j = 2; j == 2; j++){
			sum = sum + matrixB[i][j];
		}
		
	}
	System.out.println("Calculate the sum of column 3 : "+sum);
	sc.close();
	}

}
