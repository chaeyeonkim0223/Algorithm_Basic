package jungol.재귀;

import java.util.Scanner;

public class 팩토리얼_1309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(recur(n));
	}

	private static long recur(int n) {
		if(n<=1) {
			System.out.println(n + "! = "+1);
			return 1;
		}
		System.out.println(n + "! = " + n + " * " + (n-1) + "!");
		return n * recur(n-1);
	}

}
