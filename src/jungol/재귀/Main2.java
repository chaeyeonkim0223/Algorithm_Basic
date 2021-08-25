package jungol.재귀;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		combi(new int [6],arr,0,0);
	}

	private static void combi(int[] sel, int []arr, int start, int idx) {
		if( idx == sel.length ) {
			System.out.println("도착");
			int [] temp = new int [sel.length];
			for (int i = 0; i < sel.length; i++) {
				temp[i] = sel[i];
			}
			Arrays.sort(temp);
			System.out.println(Arrays.toString(temp));
			return;
		}
		for (int i = start; i < sel.length; i++) {
			sel[i] = arr[i];
			combi(sel, arr, i+1, idx+1);
		}
	}

}
