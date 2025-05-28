import java.util.Scanner;

public class IT24103159Lab4Q2{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter exam marks (out of 100): ");
	float examMarks = input.nextFloat();
	if (examMarks>100){
		System.out.println("Invalid input for exam marks. Terminating program.");

	}else if(examMarks<0){
		System.out.println("Invalid input for exam marks. Terminating program.");
	
	}else{
  
    System.out.print("Please enter lab submission marks (out of 100): ");
	  float labMarks = input.nextFloat();
	  if (labMarks>100){
		  System.out.println("Invalid input for lab submission marks. Terminating program.");
		  
		  
	  }else if(labMarks<0){
		  System.out.println("Invalid input for lab submission marks. Terminating program.");
	  
	  }else{
	  
	    System.out.print("Please enter the percentage given for the exam: ");
	    float percentageExam = input.nextFloat();
      
      System.out.print("Please enter the percentage given for the lab submission: ");
	    float percentageLab = input.nextFloat();
    
      float percentage = percentageExam + percentageLab;
        if (percentage != 100){
          System.out.println("The percentages must add up to 100. Terminating program.");
          
        }else {
          float finalMarks = (examMarks*percentageExam/100) + (labMarks*percentageLab/100);
          System.out.println("");
          System.out.println("Final Exam Mark is : " +finalMarks);
	      
          }
      }
      }


	  input.close();
	


	}
}
