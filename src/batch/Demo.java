package batch;

public class Demo {
	public static void main(String[] args) {
		String st = "Akshay";
		String rev = "";
		
		for(int i=0;i<st.length();i++) {
			
			rev = st.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
