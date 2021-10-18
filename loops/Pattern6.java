package loops;

public class Pattern6 {

	public static void main(String[] args) {
		
		int n = 6;

		for(int j = 1; j<=n; j = j+1) {
		for(int i = 1; i<=j; i=i+1) {
			System.out.print('*' + " ");
		}
        System.out.println();
	}	
		for(int i=1; i<=n; i=i+1) {		
			for(int k=n-i; k>0; k=k-1) {
				System.out.print(" ");
			}		
			for(int j=1; j<=i; j=j+1) {		
				System.out.print("* ");		
			}
			for(int l=n-1; l>0; l=l-1) {			
				System.out.print(" ");	
			}	
			System.out.println();
		}	
	}
}
