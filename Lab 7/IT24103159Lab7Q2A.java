public class IT24103159Lab7Q2A{
	public static void main (String[] args){
	
	int column = 1;
	int row = 1;
	String x = "$" ;
	String y = " ";
	
	while (row <= 4){
	  while (column <= 5){
		  System.out.print(x);
		  x = y + "$";
		  column ++;
    }
    column = column - 5;
    row ++;
    x = "$";
    System.out.println("");
  }
	}
}
