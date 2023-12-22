package pattarn_program;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid month number");
		int num = sc.nextInt();
		if(num>0 && num<=12) {
			System.out.println(num+" It is valid month Number");
		}
		else {
			System.out.println(num+" It is not valid month Number");
		}
	}

}
