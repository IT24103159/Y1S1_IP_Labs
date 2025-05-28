import java.util.Scanner;

public class Final_8{

	public static double calcFinalMark(double assigmentMark, double examMark){
		return (assigmentMark * 30 / 100) + (examMark * 70 / 100);
	
	}
	public static char findGrades(double finalMark){
	  if (finalMark >= 75){
	    return 'A';
	  }else if (finalMark >= 60){
	    return 'B';
	  }else if (finalMark >= 50){
	    return 'C';
	  }else {
	    return 'F';
	  }
	}
	public static void printDetails(String name, double finalMark, char grade){
	  System.out.print(name+"\t\t");
	  System.out.printf("%.2f",finalMark);
	  System.out.print("\t\t\t"+grade+"\n");
	}
	public static void main(String[] args){
	  
	  Scanner sc = new Scanner(System.in);
	  
	  String name[] = new String[5];
	  double assigmentMark[] = new double[5];
	  double assigmentMarktest;
	  double examMark[] = new double[5];
	  double examMarktest;
	  double finalMark[] = new double[5];
	  char grade[] = new char[5];
	  
	  for (int i = 0; i < 5; i++){
	  
	  System.out.print("Enter Name of Student "+(i+1)+": ");
	  name[i] = sc.next();
	  
	  do{
	    System.out.print("Enter Assignment Mark (out of 100) for "+name[i]+": ");
	    assigmentMarktest = sc.nextDouble();
	    if (assigmentMarktest > 100){
	      System.out.println("Enter a valid Assignment Mark");
	    }
	  }while (assigmentMarktest > 100);
	  assigmentMark[i] = assigmentMarktest;
	  
	  do{
	  System.out.print("Enter Exam Paper Mark (out of 100) for "+name[i]+": ");
	  examMarktest = sc.nextDouble();
	  if (examMarktest > 100){
	      System.out.println("Enter a valid Exam Paper Mark");
	    }
	  }while (examMarktest > 100);
	  examMark[i] = examMarktest;
	  
	  System.out.println();
	  }
	  
	  System.out.println("Name\t\tFinal Mark\t\tGrade");
	  for (int i = 0; i < 5; i++){
	    finalMark[i] = calcFinalMark(assigmentMark[i], examMark[i]);
	    grade[i] = findGrades(finalMark[i]);
	    printDetails(name[i], finalMark[i] ,grade[i]);
	  }
	
	  sc.close();
	}
}
