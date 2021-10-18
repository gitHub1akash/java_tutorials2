package conditionStatement;

public class LogicalStatement {
	
	public static void main(String[] args) {
		
		int x = 10 ;
		
		if(x >= 1 && x <= 100) {
			
			System.out.println(x);
		}
		
		if(x >= 1 || x <= 100) {
			System.out.println(x);
		}
	}

}
