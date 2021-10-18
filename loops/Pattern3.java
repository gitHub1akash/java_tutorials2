package loops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 
		for(int i = 1; i<= a; i =i+1) {
			for(int k =a; k>=i; k= k-1 ) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
