package Oops;

public class Demo {
	
	public static boolean isRoteted(String s1,String s2) {
		
	boolean isRotate = false;
	
	if(s1 == null || s2 == null) {
		return false;
	}
	else if(s1.length()!=s2.length()) {
		return false;
	}
	else
	{
	String concat = s1+s1;
	return concat.contains(concat);
	}
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		String s1 = "amazon";
		String s2 = "Akshay";  //"azonam";
		
		System.out.println(isRoteted(s1, s2));
	}

}
