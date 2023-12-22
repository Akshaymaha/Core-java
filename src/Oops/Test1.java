package Oops;

public class Test1 {
public static void main(String[] args) {
	String s1 = "AKSHAY";
	s1 = s1.toLowerCase();
	int count =0;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e'
				|| s1.charAt(i) == 'i'
				|| s1.charAt(i) == 'o'
				|| s1.charAt(i) == 'u') {
			count++;
		}
		
	}
	System.out.println("total number of count are :"+count);
}
}
