package jungol.make_Figure;

import java.util.Scanner;

public class 문자사각형1_1307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch ='A';
		char[][] arr = new char[n][n];
		for(int i=n-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--) {
				arr[j][i] = ch++;
				if(ch =='[') ch = 'A';
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}

}
