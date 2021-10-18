package userInput; 
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		int p = x.nextInt();
		
		double r = x.nextDouble();
		int t = x.nextInt();
		
		
		double si = p * r * t / 100;
		
		System.out.println(si);
		

	}

}
