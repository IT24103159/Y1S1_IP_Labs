import java.util.Scanner;

public class Final_7{

	public static float calcPayment(char type, int noParticipants){
	
		if (type == 'U'){
			if (noParticipants > 7) {
				return (6500 * noParticipants) * 95 / 100;
			}else{
				return (6500 * noParticipants);
			}
		}else if (type == 'P'){
			if (noParticipants > 7) {
				return (4500 * noParticipants) * 95 / 100;
			}else{
				return (4500 * noParticipants);
			}
		}else if (type == 'D'){
			if (noParticipants > 7) {
				return (3000 * noParticipants) * 95 / 100;
			}else{
				return (3000 * noParticipants);
			}
	
		}
		return 0;
	}
	public static float calAdditionalPay(int type, int noParticipants){
		
		switch(type){
			case 1:
				return (1500 * noParticipants);
				
			case 2:
				return (2500 * noParticipants);
				
			case 3:
				return (4000 * noParticipants);
				
			case 4:
				return 0;
			
			default:
        return 0;
		}
	}
	public static void displayDetails(float ticketsPay, float servicePay){
		System.out.printf("%.2f",ticketsPay +  servicePay);
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		char type;
		int sevType;
		
		assert calcPayment('U', 8) == 49400 : "Error in calcPayment() method";
		assert calcPayment('P', 5) == 22500 : "Error in calcPayment() method";
		
		for (int i = 1; i < 6; i++){
		
		do{
		System.out.print("Enter the ticket type : ");
		type = sc.next().charAt(0);
		if (type != 'U' && type != 'P' && type != 'D'){
			System.out.print("Please enter a valid ticket type\n");
		}
		}while (type != 'U' && type != 'P' && type != 'D');
		
		System.out.print("Number of participants for tickets : ");
		int noParticipantsTic = sc.nextInt();
		
		float ticketsPay = calcPayment(type, noParticipantsTic);
		
		do{
		System.out.print("Enter the sevice type : ");
		sevType = sc.nextInt();
		if (sevType < 1 || sevType > 4){
			System.out.print("Please enter a valid sevice type");
		}
		}while (sevType < 1 || sevType > 4);
		
		System.out.print("Number of participants for sevices : ");
		int noParticipantsSev = sc.nextInt();
		
		float servicePay = calAdditionalPay(sevType, noParticipantsSev);
		
		System.out.print("Net Payment : ");
		displayDetails(ticketsPay, servicePay);
		System.out.println();
		System.out.println();
		}
		sc.close();
	}






}
