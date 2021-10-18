package conditionStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12, b = 1, c = 3;
		int result = 0;
		
		if (a > b) {
			if(a > c) {
			result = a;	
			} else {
				result = c;
			}
			
		}
		
		else {
			if (b > c) {
				result = b;
			}
			else {
				result = c;
			}
		}
		 System.out.println(result);
		
   
		
		
		
		
	}

}
