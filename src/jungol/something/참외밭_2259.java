package jungol.something;

import java.util.Arrays;
import java.util.Scanner;

public class 참외밭_2259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = new int [6];
		int idx=0,max_h=Integer.MIN_VALUE,max_w=Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			sc.nextInt();
			if(i%2==0) {
				arr[idx++]= sc.nextInt();
				if(arr[idx-1]>max_w) max_w=arr[idx-1];
			}
			else {
				arr[idx++]= sc.nextInt();
				if(arr[idx-1]>max_h) max_h=arr[idx-1];
			}
		}
		int minus_h=0,minus_w=0;
		for (int i = 0; i < 6; i++) {
			//뺄 세로변 찾기
			if(arr[i]==max_w) {
				minus_h = Math.abs(arr[(i-1+6)%6]-arr[(i+1+6)%6]);
			}
			//뺄 가로변 찾기
			if(arr[i]==max_h) {
				minus_w = Math.abs(arr[(i-1+6)%6]-arr[(i+1+6)%6]);
			}
		}
		System.out.println(((max_h*max_w)-(minus_h*minus_w))*k);
	}

}
