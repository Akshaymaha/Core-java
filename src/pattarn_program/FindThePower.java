package pattarn_program;

import java.util.Scanner;

public class FindThePower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int b=sc.nextInt();
		int p = sc.nextInt();
		int power = power(b,p);
		System.out.println("b :"+b+" ,p:"+p);
		System.out.println("power: "+power );
	}

	private static int power(int b, int p) {
		// TODO Auto-generated method stub
		int power = 1;
		for(int i=1;i<=p;i++) {
			power = power*b;
		}
		return power;
	}

}
