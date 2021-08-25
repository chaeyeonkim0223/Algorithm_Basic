package jungol.도형만들기2;

import java.util.Scanner;
/**
 * 
 * @author tomyb
 * 바깥부분을 1로 채우고 0인 곳만 채워나가는 방법
 */
public class 대각선지그재그_1495_가장자리1로채우기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int [n+2][n+2];
		int idx=1,r=1,c=1;
		nums[r][c]=idx++;
		//가장자리1로 채우기
		for (int i = 0; i < n+2; i++) {
			for (int j = 0; j < n+2; j++) {
				nums[0][i] = nums[i][0] = 1;
				nums[n+1][i] = nums[i][n+1] = 1;
			}
		}
		while(idx<=n*n) {
			//1) 아래로 한 번 이동 (불가능하면 오른쪽으로) 
			if(nums[r+1][c] == 0) r++;
			else c++;
			nums[r][c]=idx++;
			//2) 오른쪽 위로 가능한 만큼 이동 (가장 위나 가장 오른쪽에 도달하면 종료) 
			while(nums[r-1][c+1]==0) {
				nums[--r][++c]= idx++;
			}
			//3) 오른쪽으로 한 번 이동 (불가능하면 아래로) 
			if(nums[r][c+1] == 0) c++;
			else r++;
			nums[r][c]=idx++;
			//4) 왼쪽 아래로 가능한 만큼 이동 (가장 왼쪽이나 가장 아래쪽에 도달하면 종료) 
			while(nums[r+1][c-1]==0) {
				nums[++r][--c]= idx++;
			}
		}
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				System.out.print(nums[i][j]+" ");
			}System.out.println();
		}
	}

}
