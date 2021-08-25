package jungol.도형만들기2;

import java.util.Scanner;

public class 별삼각형3_1329 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 1 || N > 100 || N % 2 == 0) {
			System.out.println("INPUT ERROR!");
		} else {
			for (int i = 0; i < N; i++) {
				if (i <= N / 2) {
					// 공백 0,1,2,,,
					for (int j = 0; j < i; j++) {
						System.out.print(" ");
					}
					// 별 1,3,5,,,
					for (int j = 0; j < (i + 1) * 2 - 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					// 공백
					for (int j = 0; j < N - i - 1; j++) {
						System.out.print(" ");
					}
//					//별 5,3,1,,
					for (int j = 0; j < (N - i) * 2 - 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}

}
