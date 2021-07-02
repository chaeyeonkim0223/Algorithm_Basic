package jungol.something;

import java.util.Scanner;

public class 색종이_중_1671 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]square = new int [100+2][100+2];
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int r = sc.nextInt();
			for (int t = r+1; t < r+10+1 ; t++) {
				for (int k = c+1; k < c+10+1; k++) {
					if(square[t][k]!=1) {
						square[t][k]=1;
					}
				}
			}
		}
//		for (int i = 0; i < square.length; i++) {
//			for (int j = 0; j < square[0].length; j++) {
//				System.out.print(square[i][j]);
//			}System.out.println();
//		}
		//둘레구하기
		for (int i = 1; i < 102; i++) {
			for (int j = 1; j < 102; j++) {
				if(square[i][j]==1) {
					//좌우
					if(square[i][j-1]==0 || square[i][j+1]==0)ans++;
					//상하
					if(square[i-1][j]==0 || square[i+1][j]==0)ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
