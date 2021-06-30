package jungol.string;

import java.util.Scanner;

public class 세로읽기_2857 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][15];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 15; j++) {
				arr[i][j]=' ';
			}//
		}
		for (int i = 0; i < 5; i++) {
			int idx=0;
			String now = sc.next();
			max = Math.max(max, now.length());
			for (int j = 0; j < now.length(); j++) {
				arr[i][idx++]=now.charAt(j);
			}
		}
		//세로로 읽기
		for (int i = 0; i < max; i++) {//열
			for (int j = 0; j < 5; j++) {//행
				if(arr[j][i]!=' ')System.out.print(arr[j][i]);
			}
		}
		
		
	}

}
