package batch;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			num.add(i);
		}
		for(int number:num) {
			System.out.println(num+" ");
		}
	}

}
