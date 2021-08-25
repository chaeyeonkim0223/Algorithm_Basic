package jungol.도형만들기2;

import java.util.Scanner;
/**
 * 
 * @author tomyb
 *
 */
public class 대각선지그재그_1495_조건체크 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int [n][n];
		int idx=1,r=0,c=0;
		nums[0][0]=idx++;
		
		while(idx<=n*n) {
			//1) 아래로 한 번 이동 (불가능하면 오른쪽으로) 
			if(r+1 != n) r++;
			else c++;
			nums[r][c]=idx++;
			//2) 오른쪽 위로 가능한 만큼 이동 (가장 위나 가장 오른쪽에 도달하면 종료) 
			while(r-1>=0 && c+1<n) {
				nums[--r][++c]= idx++;
			}
			//3) 오른쪽으로 한 번 이동 (불가능하면 아래로) 
			if(c+1 != n) c++;
			else r++;
			nums[r][c]=idx++;
			//4) 왼쪽 아래로 가능한 만큼 이동 (가장 왼쪽이나 가장 아래쪽에 도달하면 종료) 
			while(r+1 <n && c-1>=0) {
				nums[++r][--c]= idx++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nums[i][j]+" ");
			}System.out.println();
		}
	}

}
