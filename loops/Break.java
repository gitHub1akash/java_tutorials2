package loops;

public class Break {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i = i+1) {
			if(i > 20) {
				break;
			}
			System.out.println(i);
		}
    
	}

}
