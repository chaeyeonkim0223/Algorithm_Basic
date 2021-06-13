package jungol.math;

import java.util.Scanner;

/*
 * System.out.println(input1 * (input2 % 10));

		System.out.println(input1 * (input2 % 100 / 10));

		System.out.println(input1 * (input2 / 100));
 */
public class 곱셈_1692 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		String second = sc.next();
		for (int j = 2; j >= 0; j--) {
			int temp = 0;
			temp += first * (second.charAt(j) - '0');
			System.out.println(temp);
		}
		System.out.println(first * Integer.parseInt(second));

	}

}
