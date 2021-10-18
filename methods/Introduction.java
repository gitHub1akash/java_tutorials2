package methods;

public class Introduction {

	public static void main(String[] args) {
	
		int c = 10;
		int d = 20;
		int e = 52;
		int f = 65;
		int g = 23;
		
		int result = maxOf(c,d,e);
		
		print();
		System.out.println(result);
		
		
		print();
		System.out.println(maxOf(d,e,f));
	}

	
static int maxOf(int a,int b,int c) {
	if(a>b) {
	      if(a>c) {
		    return a;
	      }
	      else {
		    return c;
	       }
	}
	else {
	     if(b>c) {
		   return b;
	     }
	     else {
	   	  return c;
	     }
	}
}
static void print() {
	System.out.print("maxm of the number is : ");
}

}
	


