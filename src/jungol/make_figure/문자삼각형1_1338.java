package jungol.make_figure;

import java.util.Scanner;

public class 문자삼각형1_1338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = 'A';
		//공백 초기화 안해서 틀림
		char [][] square = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				square[i][j] = ' ';
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=i, k=n-1; j<n; j++, k--) {
				square[j][k] = ch++;
				if(ch > 'Z') ch ='A';
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(square[i][j]+" ");
			}System.out.println();
		}
	}

}
