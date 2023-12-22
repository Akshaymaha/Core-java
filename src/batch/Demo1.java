package batch;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = "Hi good morning";
		String rev="";
		String[] a = s1.split(" ");
		for(int i=0;i<a.length;i++) {
			
			rev = a[i]+" "+rev;
			
		}
		System.out.println(rev);
	}
}
