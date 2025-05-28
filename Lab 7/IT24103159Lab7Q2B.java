public class IT24103159Lab7Q2B{
	public static void main (String[] args){
	
	int n = 1;
	String x = "*";
	String y = " ";
	String z = "-";
	
	do {
		System.out.println(n+y+z+y+x);
		n++;
		x = x + y + "*";
	} while (n <= 5);
	}
}
