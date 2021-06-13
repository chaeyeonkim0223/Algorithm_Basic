package jungol.make_figure;

import java.util.Scanner;

public class 문자삼각형2_1339 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char[][] square;
		char ch = 'A';

		n = sc.nextInt();
		if (n < 1 || n > 100 || n % 2 == 0) {
			System.out.println("INPUT ERROR");
		} else {
			square = new char[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					square[i][j] = ' ';
				}
			}

			for (int i = n / 2; i >= 0; i--) {
				for (int j = i; j < n - i; j++) {
					square[j][i] = ch++;
					if (ch > 'Z')ch = 'A';
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(square[i][j] + " ");
				}System.out.println();
			}
		}
	}

}
