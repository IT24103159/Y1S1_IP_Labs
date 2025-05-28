import java.util.Scanner;

public class IT24103159Lab9Q4{

  // Method to calculate the final mark
	public static double calcFinalMark(double assignmentMark, double examMark){
	
		double finalMark = ((assignmentMark * 30) / 100) + ((examMark * 70) / 100);
		return finalMark;
	
	}
	// Method to find the grade based on the final mark
	public static char findGrade(double finalMark){
		
		char grade;
		if (finalMark >= 75){
			grade = 'A';
		}else if (finalMark >= 60){
			grade = 'B';
		}else if (finalMark >= 50){
			grade = 'C';
		}else{
			grade = 'F';
		}
		
		return grade;
	}
	// Method to print the details of the student
	public static void printDetails(String name, double finalMark, char grade){

	System.out.printf("%-10s %-10.2f %-10c%n", name, finalMark, grade);
  
  }
   // Main method
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[5];
		double assignmentMark[] = new double[5];
		double examMark[] = new double[5];
		double finalMark[] = new double[5];
		char grade[] = new char[5];
		
		for (int i = 0; i <= 4; i++){
		
		System.out.print("\nEnter Name of Student "+ (i+1) +": ");
		name[i] = sc.next();
		
		System.out.print("Enter Assignment Mark (out of 100) for "+name[i]+": ");
		assignmentMark[i] = sc.nextDouble();
		
		System.out.print("Enter Exam Paper Mark (out of 100) for "+name[i]+": ");
		examMark[i] = sc.nextDouble();
		
		finalMark[i] = calcFinalMark(assignmentMark[i], examMark[i]);
		grade[i] = findGrade(finalMark[i]);
		
		}
		
		System.out.println();
		System.out.println("Name      Final Mark  Grade");
		
		for (int i = 0; i <= 4; i++){
		
		  printDetails(name[i], finalMark[i], grade[i]);
		}
	
		sc.close();
	}


}
