package edu.quang.java;

import java.util.Scanner;

public class SumDemo {
	public static void main(String[] args) {

		int n;
		int sum = 0;
		Scanner scan;

		do {
			System.out.print("Input N = ");
			scan = new Scanner(System.in);
			n = scan.nextInt();
		} while (n <= 0);

		for (int i = 0; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum = " + sum);
	}
}