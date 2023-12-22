package pattarn_program;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int num = sc.nextInt();
		
		/*
		 * if(num%2==0) { System.out.println("even number"); } else {
		 * System.out.println("odd number"); }
		 */
		switch(num%2) {
		case 0 : System.out.println("even");
		break;
		case 1 : System.out.println("odd");
		break;
		}
	}

}
