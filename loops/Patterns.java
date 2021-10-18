package loops;
import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		
		
     Scanner sc = new Scanner(System.in);
     
     int a = sc.nextInt();
    

		for(int j = 1; j <= a; j = j+1) {
		for(int i = 1; i<=a; i = i+1) {
			System.out.print('*'+ " ");
		}
            System.out.println();
	}

}
}