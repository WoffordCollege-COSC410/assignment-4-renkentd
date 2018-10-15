package edu.wofford;

import java.util.Scanner;

public class ConsoleMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] input = new int[2];
		for (int i = 0; i < 2; i++){
			input[i] = Integer.parseInt(args[i]);
		}
		System.out.println(input[0]);
		System.out.println(input[1]);
		

	}
}