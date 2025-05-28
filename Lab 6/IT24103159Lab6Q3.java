import java.util.Scanner;

public class IT24103159Lab6Q3{
  public static void main (String[] args){
  
  Scanner myObj = new Scanner(System.in);
  
  System.out.println("Enter positive integers (terminate input with -99):");
  
  int x;
  int n = 0;
  int xSquared = 0;
  int xSquaredsum = 0;
  
  do {
  System.out.print("Enter a number: ");
  x = myObj.nextInt();
    while (x<=0 && x!=-99){
      System.out.println("Invalid input Please enter a positive integer or -99 to terminate");
      System.out.print("Enter a number: ");
      x = myObj.nextInt();
    }
    if (x!=-99){
    xSquared = x*x;
    xSquaredsum = xSquaredsum + xSquared;
    n=n+1;
    }

  }while (x!=-99);
  
  if (n > 0){
  double RMS =  Math.sqrt((double)xSquaredsum / n );
  System.out.println("\nThe Root Mean Squre (RMS) is: "+RMS);
  }else{
  System.out.println("\nNo positive integers were entered. RMS cannot be calculated");
  } 
 
  myObj.close();
  }
}

