package jungol.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		배열에서 1~n개까지 다뽑아본다음   
//		int [][] arr = new int [n][2];
		int [] arr = new int [n];
		int [] num = new int [n];
		max = Integer.MIN_VALUE;
		for (int i = 1; i <= n ; i++) {
			arr[i] = i;
			num[i] = sc.nextInt();
		}
		for (int i = 1; i <= n ; i++) {
			combination(new int[i], 0,0,arr,num);		
		}
	}
	static int max;
	private static void combination(int[] sel,int start, int idx, int[] arr, int[] num) {
		if( idx == sel.length ) {
			if(sel.length>max) {
				int[] temp = new int [sel.length];
				for (int i = 0; i < sel.length; i++) {
					temp[i] = sel[i];
				}
				Arrays.sort(temp);
				for (int i = 0; i < temp.length; i++) {
					System.out.print(temp[i]);
				}
			}
		}
		for (int i = start; i < num.length; i++) {
			sel[idx] = num[i];
			combination(sel, i+1, idx+1, arr, num);
		}
	}

}
