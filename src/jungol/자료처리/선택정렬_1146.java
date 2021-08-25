package jungol.자료처리;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬_1146 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int start=0;
		int size = arr.length-1;
		while(size-->0) {
			//최솟값 찾기
			int min=Integer.MAX_VALUE;
			for (int i = start; i < arr.length; i++) {
				if(arr[i]<min) min = arr[i];
			}
			//맨앞과 바꾸기
			for (int i = start; i < arr.length; i++) {
				if(min == arr[i]) {
					int temp = arr[i];
					arr[i] = arr[start];
					arr[start] = temp;
					start+=1;
					break;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
		}
	}
}
