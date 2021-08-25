package jungol.자료처리;

import java.util.Scanner;

public class 버블정렬_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		int point = arr.length-1;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < point; j++) {
				// 첫번쨰 값이 크면 자리를 바꾼다.
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			point--;
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]+" ");
			}System.out.println();
		}
	}

}
