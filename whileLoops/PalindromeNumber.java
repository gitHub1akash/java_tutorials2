package whileLoops;
import java.util.Scanner;


public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		
		while(temp>0) {
			
			int lastDigit = temp%10 ;
			
			temp /= 10;
			
			sum = (sum*10)+lastDigit;
		}
		if(n == sum)  System.out.println(n +" is a palindrome number");
		else System.out.println(n + "  is not a palindrome number");
			
	}

}
