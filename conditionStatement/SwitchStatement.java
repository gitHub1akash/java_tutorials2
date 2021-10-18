package conditionStatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("enter the first term");
		
		int a = sc.nextInt();
		
		System.out.println("enter the second term");
		
		int b = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter the operator");
		
		char o = sc.nextLine().charAt(0);
		
		
		int result = 0;
		
		
		switch(o) {
		
		case '+' :
			result = a + b;
			break;
		case '-':
			 result = a - b;
			 break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default :
		    System.out.println("invalid ");
		}
		
		
		System.out.println(result);
		
	}

}
