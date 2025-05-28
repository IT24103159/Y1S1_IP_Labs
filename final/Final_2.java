// Final Exam Mock Test Coding Question  – Part B
import java.util.Scanner;

public class Final_2{

  public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
  
  char panel[][] = new char[3][3];
  
  for (int i = 0; i < 3; i++){
    for (int j = 0; j < 3; j++){
      
      System.out.print("Enter Color for Position [" + i +","+j+"] :");
      panel[i][j] = sc.next().charAt(0);
    
    }
     System.out.println();
  }
  
  System.out.println("LED Panel Visual Display:");
  
  for (int i = 0; i < 3; i++){
    for (int j = 0; j < 3; j++){
    
      System.out.print(" "+panel[i][j]);
    }
    System.out.println();
  }
  System.out.println();
  
  System.out.print("Select a Color (R, G, or B) to display all locations :");
  char selectColour = sc.next().charAt(0);
  
  System.out.print("Location of All "+selectColour+" LED Bulbs are : ");
  
  for (int i = 0; i < 3; i++){
    for (int j = 0; j < 3; j++){
    
      if (selectColour == panel[i][j]){
        System.out.print("["+i+","+j+"]");
      }
    }
    
  }
  System.out.println();
  
  
  
  sc.close();
  }

}
