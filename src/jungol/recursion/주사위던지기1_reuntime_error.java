package jungol.recursion;

import java.util.Scanner;

public class 주사위던지기1_reuntime_error {
//중복: 같은숫자가 여러개
//조합: 같은구성이 없는것.
//중복조합: 같은숫자가 여러개이지만 같은구성은 없는것.
	
	static int n,m;
	static int num[];
	static boolean isSelected[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		num = new int [3];
		isSelected = new boolean[7];
		if(m==1) {
			//중복순열
			permutation(n, 0);
		}else if (m==2) {
			//중복조합
			combination(n, 1, 0);
		}else {
			//순열
			permutation2(n, 0);
		}
	}
	private static void permutation2(int n, int idx) {
		if(idx == n) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = 1; i <= 6 ; i++) {
			if(isSelected[i]) continue;
			num[idx]= i;
			isSelected[i] = true;
			permutation2(n, idx+1);
			isSelected[i] = false;
		}
		
	}	
	private static void combination(int n, int start, int idx) {
		if( idx == n ) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = start; i <= 6 ; i++) {
			num[idx] = i;
			combination(n, i, idx+1);
		}
	}
	private static void permutation(int n, int k) {
		if(k == n) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = 1; i <= 6; i++) {
			num[k] = i;
			permutation(n, k+1);
		}
	}

}
