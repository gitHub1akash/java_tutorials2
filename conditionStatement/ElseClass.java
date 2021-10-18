package conditionStatement;
import java.util.Scanner;


public class ElseClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			
			System.out.println(" the number is EVEN");
			
		}
		else {
			System.out.println(" the number is ODD");
		}
		
		

	}

}
