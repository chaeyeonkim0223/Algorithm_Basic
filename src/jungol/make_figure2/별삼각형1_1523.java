package jungol.make_figure2;

import java.util.Scanner;

public class 별삼각형1_1523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n<1 || n>100 || m<1 || m>3) {
			System.out.println("INPUT ERROR!");
		}else {
		char[][] arr = new char[n*2][n*2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] =' ';
			}
		}
		switch(m) {
		case 1:
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}System.out.println();
			}
			break;
		case 2:
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-i; j++) {
					System.out.print("*");
				}System.out.println();
			}
			break;
		case 3:
			for(int i=0; i<n; i++) {
				for(int j=n-1-i; j<n+i; j++) {
					arr[i][j] = '*';
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n*2; j++) {
					System.out.print(arr[i][j]);
				}System.out.println();
			}
			break;
			
		}
		}
	}

}
