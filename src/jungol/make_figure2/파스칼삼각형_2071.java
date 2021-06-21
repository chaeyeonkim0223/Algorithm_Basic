package jungol.make_figure2;

import java.util.Scanner;

public class 파스칼삼각형_2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] nums = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if(j==0 || i==j) {
					nums[i][j] = 1;
				}else {
					nums[i][j] = nums[i-1][j-1]+ nums[i-1][j];
				}
			}
		}
		switch(m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(nums[i][j]+" ");
				}System.out.println();
			}
			break;
		case 2:
			for(int i=n-1; i>=0; i--) {
				//공백
				for(int j=0; j<n-i-1; j++) {
					System.out.print(" ");
				}
				//숫자
				for(int j=0; j<=i; j++) {
					System.out.print(nums[i][j]+ " ");
				}System.out.println();
			}
			break;
		case 3:
			for(int i=n-1; i>=0; i--) {
				for(int j=n-1; j>=i; j--) {
					System.out.print(nums[j][i]+ " ");
				}System.out.println();
			}
			break;
		}
	}

}
