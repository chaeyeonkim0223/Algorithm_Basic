package jungol.something;

import java.util.Scanner;

public class 연속부분합찾기_1836 {
	//static 쓰면 시간 초과 발생
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		//지금까지 1 2 -2 4
		for (int i = 0; i < n; i++) {
			if(sum + arr[i] <0) {
				ans = Math.max(ans, sum);
				sum=0;
			}else {
				sum += arr[i];
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}

}
