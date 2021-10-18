package conditionStatement; 
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a >= 18) {
		
		System.out.println("you can vote now");
	
		}
		
		if(a < 18) {
		
			System.out.println("you can't vote now");
		}
	}

  }
