package jungol.make_figure2;

import java.util.Scanner;

public class 달팽이사각형_1707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]nums = new int [n+2][n+2];
		for(int i=0; i<=n+1 ; i++) {
			nums[0][i] = nums [n+1][i] =1;
			nums[i][0] = nums [i][n+1] =1;
		}
		int idx=1,r=1,c=0;
		while(idx<=n*n) {
			//우
			while(nums[r][c+1]==0) {
				c++;
				nums[r][c] = idx++;
			}
			//하
			while(nums[r+1][c]==0) {
				r++;
				nums[r][c] = idx++;
			}
			//좌
			while(nums[r][c-1]==0) {
				c--;
				nums[r][c] = idx++;
			}
			//상
			while(nums[r-1][c]==0) {
				r--;
				nums[r][c] = idx++;
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(nums[i][j]+ " ");
			}System.out.println();
		}
		
	}

}
