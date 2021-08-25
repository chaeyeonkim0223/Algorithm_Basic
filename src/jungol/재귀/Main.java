package jungol.재귀;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
/*
 * 조합으로뽑고 뽑은인덱스 == 뽑은거랑 같은거의 최대 길이인것을 정렬하여 출력한다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		int [] num = new int [n];
		max = Integer.MIN_VALUE;
		for (int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= n ; i++) {
			combination(new boolean[n],new int[i],0,0,arr);		
		}
	}
	private static int max;
	private static void combination(boolean isInIndex[], int[] sel,int start, int idx, int[] arr) {
		if( idx == sel.length ) {
//			System.out.println(Arrays.toString(sel));
//			System.out.println(Arrays.toString(isInIndex));
//			for (int i = 0; i < isInIndex.length; i++) {
//				if(isInIndex[i]) System.out.print(i+" ");
//			}
			for (int i = 0; i < sel.length; i++) {
				if(isInIndex[i]) {
					boolean flag = false;
					for (int j = 0; j < sel.length; j++) {
						if(sel[j] == i+1) {
							flag = true;
//							System.out.println("뽑은숫자들중에 같은인덱스가있다."+i);
						}
					}
					if(!flag) return;
				}
			}
			if(max < sel.length) {
				max = sel.length;
				int[] temp = new int [sel.length];
				for (int i = 0; i < sel.length; i++) {
					temp[i] = sel[i];
				}
				Arrays.sort(temp);
				for (int i = 0; i < temp.length; i++) {
					System.out.println(temp[i]);
				}System.out.println();
			}
			return;
		}
		for (int i = start; i < arr.length; i++) {
			sel[idx] = arr[i];
			isInIndex[i] = true;
			combination(isInIndex, sel, i+1, idx+1, arr);
			isInIndex[i] = false;
		}
	}

}
