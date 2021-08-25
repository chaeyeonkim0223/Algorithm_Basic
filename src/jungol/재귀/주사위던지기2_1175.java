package jungol.재귀;

import java.util.Scanner;

public class 주사위던지기2_1175 {
	static int N,M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		dice(new int [N],0,0);
	}
	private static void dice(int sel[], int sum, int idx) {
		//합이 M을 넘을경우 가지치기
		if(sum > M) return;
		//N개만큼 뽑았을때
		if(idx == N) {
			//합이 M인경우에만 출력
			if(sum == M) {
				for (int i = 0; i < sel.length; i++) {
					System.out.print(sel[i]+" ");
				}System.out.println();
			}
			return;
		}
		for (int i = 1; i <= 6 ; i++) {
			sel[idx]= i;
			dice(sel, sum + i, idx+1);
		}
	}

}
