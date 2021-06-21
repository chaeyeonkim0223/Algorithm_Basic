package jungol.make_figure2;

import java.util.Scanner;

public class 달팽이사각형_1707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] nums = new int [n+2][n+2];
		
		  for (int i = 0; i <= n + 1; i++) {
		        nums[0][i] = nums[n+1][i] = 1; // 0행(맨위), n+1행(맨아래) 모두 1로 채우기
		        nums[i][0] = nums[i][n+1] = 1; // 0열(맨앞), n+1열(맨뒤) 모두 1로 채우기
		    }
		
		int idx=1;
		int r =1,c=0;
		while(idx<=n*n) {
			 while(nums[r][c+1]==0) { // 오른쪽이 0인동안
		            c++; // 오른쪽으로 이동
		            nums[r][c]=idx++;
		        }
		        while(nums[r+1][c]==0) { // 아래쪽이 0인동안
		            r++; // 아래쪽으로 이동
		            nums[r][c]=idx++;
		        }
		        while(nums[r][c-1]==0) { // 왼쪽이 0인동안
		            c--; // 왼쪽으로 이동
		            nums[r][c]=idx++;
		        }
		        while(nums[r-1][c]==0) { // 위이 0인동안
		            r--; // 위쪽으로 이동
		            nums[r][c]=idx++;
		        }
			
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(nums[i][j]+ " ");
			}System.out.println();
		}
		
	}

}
