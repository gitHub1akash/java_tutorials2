package operaters;

public class BitWiseOperator {

	public static void main(String[] args) {
		
		int y = 9;
				
		int x = 13;
		
		int z = y & x;
		
		int d = y | x;
		
		int f = y >> 1;
		
		int g = x << 1;
		
		System.out.println( "the 'AND' value is "+ z+  "   "  +"the 'OR'  value is"+ d);
		
		System.out.println("the RIGHT SHIFT value is "+f+"    " +"the LEFT SHIFT value is "+g);

	}

}
