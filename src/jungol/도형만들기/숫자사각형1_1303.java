package jungol.도형만들기;

import java.util.Scanner;

public class 숫자사각형1_1303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int idx=0;
		for(int i=0; i<n ; i++) {
			for(int j=0; j<m ; j++) {
				System.out.print(++idx + " ");
			}System.out.println();
		}
	}

}
