package conditionStatement;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		
		int a = 40, b = 15, c = 6;
		int result = 0;
		
		
		result = (a > b) ? ((b > c) ? a : c) : ((b > c) ? b : c) ;
		 
		System.out.println(result);

	}

}
