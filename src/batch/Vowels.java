package batch;

import java.util.HashSet;
import java.util.Set;

public class Vowels {
	public static void main(String[] args) {
		
		String s1 = "aeiou";
		
		Set<Character> set = new HashSet<Character>();
		for(int i = 0;i< s1.length();i++) {
			char c = s1.charAt(i);
			if(isVowel(c)) {
				set.add(c);
			}
			
		}
		System.out.println("Vowels are : ");
		for(Character c :set) {
			System.out.print(" "+c);
		}
			
	}
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		return true;
		}else {
			return false;
		}
		
	}

}
