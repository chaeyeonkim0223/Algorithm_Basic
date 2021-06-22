package jungol.make_figure2;

import java.util.Scanner;

public class 달팽이삼각형_1337 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int r = -1, c = -1;
		int num = 0;

		for (int i = 0; i < N; ++i) {
			for (int j = i; j < N; ++j) {
				if (i % 3 == 0) {
					r++;
					c++;
				} else if (i % 3 == 1) {
					c--;
				} else if (i % 3 == 2) {
					r--;
				}
				arr[r][c] = (num++) % 10;
			}

		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
