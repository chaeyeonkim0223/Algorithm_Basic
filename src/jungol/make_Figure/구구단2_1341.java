package jungol.make_Figure;

import java.util.Scanner;

public class 구구단2_1341 {

	static int s, e;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (2 <= s && s <= 9 && 2 <= e && e <= 9) {
				break;
			} else {
				System.out.println("INPUT ERROR!");
				continue;
			}
		}
		gugu();

	}

	private static void gugu() {
		if (s > e) {
			for (int j = s; j >= e; j--) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
					if (i % 3 == 0)System.out.println();
				}
				System.out.println();
			}
		} else {
			for (int j = s; j <= e; j++) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
					if (i % 3 == 0) System.out.println();
				}
				System.out.println();
			}
		}
	}

}
