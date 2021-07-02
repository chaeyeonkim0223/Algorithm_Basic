package jungol.something;

import java.util.Scanner;

public class 색종이_초_1438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]square = new int [100][100];
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int r = sc.nextInt();
			for (int t = r; t < r+10 ; t++) {
				for (int k = c; k < c+10; k++) {
					if(square[t][k]!=1) {
						square[t][k]=1;
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
