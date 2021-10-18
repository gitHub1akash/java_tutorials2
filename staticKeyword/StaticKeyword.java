package staticKeyword;

import staticKeyword.A.B;
import staticKeyword.A.C;

public class StaticKeyword {
	
	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}

	
	

	public static void main(String[] args) {
		
		

		A objA = new A();
		B objB = objA.new B();
		
		C objC = new A.C();
		
		System.out.println(" inside main");
		
	}
	static {
		System.out.println("in block 3");
	}

}
