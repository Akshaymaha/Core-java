package batch;

public class PrimeNum {
	public static void main(String[] args) {
		
		int num = 9;
		int i=2;
		while(i<=num) {
			if(num%i==0) {
				break;
			}
			i++;
		}
		if(i==num) {
			System.out.println("It is prime Number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
