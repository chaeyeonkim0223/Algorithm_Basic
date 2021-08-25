package jungol.재귀;

import java.util.Scanner;

public class 주사위던지기1_1169 {
	static int N,M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		switch(M) {
		case 1:
			//중복순열
			permutation(new int [N],0);
			break;
		case 2:
			//조합
			combination(new int [N], 1, 0);
			break;
		case 3:
			//순열
			permutation2(new int [N], new boolean [7], 0);
			break;
		}
	}
	private static void permutation2(int[] sel, boolean [] v, int idx) {
		if(idx == N) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = 1; i <= 6 ; i++) {
			if(v[i]) continue;
			v[i]= true;
			sel[idx]=i;
			permutation2(sel,v, idx+1);
			v[i]= false;
		}
	}
	private static void combination(int[] sel, int start, int idx) {
		if(idx == N) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = start; i <= 6; i++) {
			sel[idx] =i;
			combination(sel, i, idx+1);
		}
	}
	private static void permutation(int[] sel, int idx) {
		if(idx == N) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = 1; i <= 6 ; i++) {
			sel[idx]=i;
			permutation(sel, idx+1);
		}
	}

}
