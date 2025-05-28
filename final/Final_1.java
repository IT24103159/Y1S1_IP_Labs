// Final Exam Mock Test Coding Question 1 – Part A
import java.util.Scanner;

public class Final_1{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String customerName[] = new String[5];
		int accountNum[] = new int[5];
		char transactionType[] = new char[5];
		double amount[] = new double[5];
		
		double totDeposit = 0;
		int depositCount = 0;
		double totWithdrawal = 0; 
		int withdrawCount = 0;
		double maxDeposit = 0;
		String maxDepositName = "";
		double maxWithdrawal = 0;
		String maxWithdrawalName = "";
		
		for (int i = 0; i <= 4; i++){
			
			System.out.print("Enter Customer " + (i+1) + " Name : ");
			customerName[i] = sc.next();
			
			System.out.print("Enter Account Number : ");
			accountNum[i] = sc.nextInt();
			
			do {
			  System.out.print("Enter Transaction Type : ");
			  transactionType[i] = sc.next().charAt(0);
			  if (transactionType[i] != 'W' && transactionType[i] != 'w' && transactionType[i] != 'D' && transactionType[i] != 'd'){
			    System.out.println("Please enter a valid value");
			  }
			}while (transactionType[i] != 'W' && transactionType[i] != 'w' && transactionType[i] != 'D' && transactionType[i] != 'd' );
			
			System.out.print("Enter Amount : ");
			amount[i] = sc.nextDouble();
			
			System.out.println();
			}

			for (int i = 0; i <= 4; i++){
			  if (transactionType[i] == 'w' || transactionType[i] == 'W'){
			    totWithdrawal = totWithdrawal + amount[i];
			    withdrawCount++;
			    if (maxWithdrawal < amount[i]){
			      maxWithdrawal = amount[i];
			      maxWithdrawalName = customerName[i];
			    }
			  }else {
			   totDeposit = totDeposit + amount[i];
			   depositCount++;
			   if (maxDeposit < amount[i]){
			      maxDeposit = amount[i];
			      maxDepositName = customerName[i];
			    }
			  }
		  }
		 System.out.println("Total Deposit Amount is : "+totDeposit);
		 System.out.println("Total Withdrawal Amount is : "+totWithdrawal);
		 System.out.println("Count of All Deposit Transactions is : "+depositCount);
		 System.out.println("Count of All Withdrawal Transactions is : "+withdrawCount);
		 System.out.println("Maximum Deposit Amount Customer Name is : "+maxDepositName);
		 System.out.println("Maximum Withdrawal Amount Customer Name is : "+maxWithdrawalName);
		 
		sc.close();
	}




}
