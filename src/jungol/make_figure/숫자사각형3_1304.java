package jungol.make_figure;

import java.util.Scanner;

public class 숫자사각형3_1304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = 0;
		int square[][] = new int[n][n];
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++) 
				square[j][i] = ++idx;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(square[i][j] + " ");
			}System.out.println();
		}
	}
}


