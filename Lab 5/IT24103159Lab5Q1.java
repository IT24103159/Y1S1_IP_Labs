import java.util.Scanner;
public class IT24103159Lab5Q1{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        System.out.print ("Enter the first integer: ");
        int num1 = myObj.nextInt();
        
        System.out.print ("Enter the second integer: ");
        int num2 = myObj.nextInt();

        System.out.print ("Enter the third integer: ");
        int num3 = myObj.nextInt();

        System.out.println("");

        System.out.println("User entered numbers are :" + num1 +" " + num2+" "+ num3+" ");

        int smallestNum = Math.min(num1, Math.min( num2 ,num3 ));
        System.out.println("The Smallest number is: " +smallestNum);

        int largestNum = Math.max(num1, Math.min( num2 ,num3 ));
        System.out.println("The Largest number is: " +largestNum);


        myObj.close();

    }
}