package jungol.make_figure2;

import java.util.Scanner;

public class 별삼각형2_1719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] square = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				square[i][j] = ' ';
			}
		}
		if (n > 100 || n < 1 || n % 2 == 0 || m < 1 || m > 4) {
			System.out.println("INPUT ERROR!");
		} else {

			switch (m) {
			case 1:
				for (int i = n / 2; i >= 0; i--) {
					for (int j = i; j < n - i; j++) {
						square[j][i] = '*';
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= n / 2; j++) {
						System.out.print(square[i][j]);
					}
					System.out.println();
				}
				break;
			case 2:
				for (int i = 0; i <= n / 2; i++) {
					for (int j = n / 2 - i; j <= n / 2 + i; j++) {
						square[j][i] = '*';
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= n / 2; j++) {
						System.out.print(square[i][j]);
					}
					System.out.println();
				}
				break;
			case 3:
				for (int i = 0; i < n; i++) {
					if (i <= n / 2) {
						for (int j = i; j < n - i; j++) {
							square[i][j] = '*';
						}
					} else {
						for (int j = n - 1 - i; j <= i; j++) {
							square[i][j] = '*';
						}
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(square[i][j]);
					}
					System.out.println();
				}
				break;
			case 4:
				for (int i = 0; i < n; i++) {
					if (i <= n / 2) {
						for (int j = i; j <= n / 2; j++) {
							square[i][j] = '*';
						}
					} else {
						for (int j = n / 2; j <= i; j++) {
							square[i][j] = '*';
						}
					}
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(square[i][j]);
					}
					System.out.println();
				}
				break;

			}
		}
	}

}
