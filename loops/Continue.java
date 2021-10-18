package loops;

public class Continue {

	public static void main(String[] args) {
		
		for(int i =1; i<= 50 ; i = i+1) {
			if(i>20 && i<=30) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		

	}

}
