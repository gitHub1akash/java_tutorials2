package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
			boolean b = true;	
			
		for(int i = 2; i < a; i = i + 1) {
			
		
		if(a % i == 0) {
			b = false;
		break;
		}
		
		
		}
		if(a < 2) b = false;
		System.out.println("is prime." + "the statement is " + b);
	    
}
}