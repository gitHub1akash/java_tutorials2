package lists;

import java.util.*;


public class CountPairswhosesumisequaltoX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> l1 = new LinkedList();
		LinkedList<Integer> l2 = new LinkedList();
		for(int i=1;i<=6;i++) {
			l1.add(i);
		}
		for(int i=11;i<=13;i++) {
			l2.add(i);
		}
		int x = 15;

		solution os = new solution();
		os.countPairs(l1,l2,x);
		
	}
	

}
