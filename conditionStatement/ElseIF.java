package conditionStatement;

import java.util.Scanner;

public class ElseIF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		if(s > 0 && s <= 10) {
			
		System.out.println("the number lies in the range 0 to 10");
		}
		else if (s > 10 && s <= 20) {
			
		System.out.println("the number lies in the range 10 to 20 "); }		
		
		else if (s > 20 && s<= 30) {
			System.out.println("the number lies in the range 20 to 30");
		}
		else  {
			System.out.println("the number is greater then 30");
		}

	}

}
