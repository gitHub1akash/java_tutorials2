package loops;

public class Pattern5 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i<= n; i = i+1) {
			for(int j = n-1; j>= i; j= j-1) {
				System.out.print("  ");
			}
			for(int k = 1; k <=i; k = k+1) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}

}
