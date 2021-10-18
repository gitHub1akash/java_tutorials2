package loops;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 
		 
		 for(int i = 1; i <=a; i=i+1) {
			 for(int j = 1; j<=i-1; j=j+1 ) {
				
				 System.out.print("  ");
			 }
			 for(int k = 1; k<=(a-i+1); k=k+1) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 

	}

}
