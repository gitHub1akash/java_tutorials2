package array;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {1, 2, -5, -8, 7, 5};
		
		int n = a.length;
		
		boolean sorted = true;	
	
		for(int i=0; i<(n-1); i=i+1) {
			for(int j =0; j<(n-1-i); j=j+1) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1]; 
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;
			   }
				
			}
			if(sorted) break;
		}
		
//		for(int i=0; i<n; i=i+1) {
//			System.out.print(a[i] + " ");
//		
		
		
		for(int item : a) {
			System.out.print(item+" ");
	
		}

	}

}
