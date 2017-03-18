package com.atfuif;

import java.util.Arrays;

public class Text04 {
	public static void main(String[] args) {
		int [] number = {5,900,1,5,77,30,64,700};
		int [] nun = new int[number.length];
		Arrays.sort(number);
		int[] copyOf = Arrays.copyOf(number, number.length);
		for(int i = 0; i < number.length; i++){
			System.out.print(number[i]);}
		System.out.println("------------------");
		for (int i = 0; i < copyOf.length; i++) {
			System.out.println(copyOf[i]);
		}

	}
}
