public class IT24103159Lab7Q2C{
	public static void main (String[] agrs){
	
	int x = 1;
	int z = 5;
	int y = 1;
	
	while (y <= 5){ 
	  while (x <= z){
	  
	    if (x == z){
	    System.out.print(z+"\n");
	    x++;
	    }else{
	    System.out.print(z);
	    x++;
	    }
	  }
      x = x - z;
	    z = z - 1;
	    y++;
	}
	}
}
