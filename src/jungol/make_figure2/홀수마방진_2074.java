package jungol.make_figure2;

import java.util.Scanner;

public class 홀수마방진_2074 {
	static int n;
	static int [][]nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		nums = new int [n][n];
		int idx=1,r=0,c=n/2;
		fill(r,c,idx);
		/*
		while(idx<=n*n) {
			nums[r][c]= idx++;
			if((idx-1)%n ==0) r++;
			else {
				r--;c--;
				if(r<1) r=n;
				if(c<1) c=n;
			}
			
		}*/
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(nums[i][j]+" ");
			}System.out.println();
		}
	}
	//전달받은 위치 한곳만 채우고 다음 위치를 호출하는 재귀함수
	static void fill(int r, int c, int num) {
		if(num> n*n) return;
		if(r<0) r=n-1; 
		if(c<0) c=n-1;
		nums[r][c]= num;
		if(num%n==0) fill(r+1,c,num+1);
		else fill(r-1,c-1,num+1);
	}

}
