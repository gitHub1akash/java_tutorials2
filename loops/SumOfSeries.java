package loops;
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		float result = 0;
		
		for(float i = 1; i <= a; i = i + 1) {
			
			result += (1 / i) ;
		}
		System.out.println(result);

	}

}
