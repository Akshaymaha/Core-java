package com.w3spoiint;

import java.util.Arrays;

public class TestExa {
	public static void main(String[] args) {
		
		int ar[] = {15,81,11,20,6,19};
		for(int i : ar) {
			System.out.println(i+" ");
		}
		
		Arrays.parallelSort(ar,0,4);
		System.out.println("\nArray Element after sorting");
		
		for(int i:ar) {
			System.out.println(i+" ");
		}
	}

}
