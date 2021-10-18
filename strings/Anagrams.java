package strings;

public class Anagrams {

	public static void main(String[] args) {
		
		String a = "aba";
		String b = "aab";
		boolean isAnagram = false;
		
		boolean visited [] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
			for(int i=0; i<a.length(); i=i+1) {
				char c = a.charAt(i);
				isAnagram = false;
				for(int j = 0; j<b.length();j=j+1) {
					if(b.charAt(j) == c && !visited[j]) {
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		}
		if(isAnagram) {
			System.out.println("is anagram");
		}
		else {
			System.out.println("not Anagram");
		}

	}

}
