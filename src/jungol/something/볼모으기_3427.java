package jungol.something;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 빨간색을 왼쪽으로 모을 때
 * 파란색을 왼쪽으로 모을 떄
 * 빨간색을 오른쪽으로 모을 떄
 * 파란색을 오른쪽으로 모을 때
 */
public class 볼모으기_3427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int res = Integer.MAX_VALUE;
		char[] copy = Arrays.copyOf(arr, n);
		// 왼쪽시작
		int count = 0;
		//빨간색을 모을 때
		int change=0;
		for (int i = 0; i < copy.length; i++) {
			if (arr[i] == 'B') change=1;
			if(change==1&&arr[i]=='R')count++;
		}
		res = Math.min(res, count);
		
		change=0;
		count = 0;
		for (int i = n-1; i >=0; i--) {
			if (arr[i] == 'B') change=1;
			if(change==1&&arr[i]=='R')count++;
		}
		res = Math.min(res, count);
		//파란색을 모을 때
		change=0;
		count = 0;
		for (int i = 0; i < copy.length; i++) {
			if (arr[i] == 'R') change=1;
			if(change==1&&arr[i]=='B')count++;
		}
		res = Math.min(res, count);
		
		change=0;
		count = 0;
		for (int i = n-1; i >=0; i--) {
			if (arr[i] == 'R') change=1;
			if(change==1&&arr[i]=='B')count++;
		}
		res = Math.min(res, count);
		
		System.out.println(res);
	}

	// 같은 볼끼리 모였는지 확인하는 함수-> 처음엔 이걸로 while문돌리려했는데 n이 커서 시간초과가 났다. 한번씩만 돌려야 한다.
	static boolean isEnd(char[] copy) {
		int cnt = 0;
		for (int i = 0; i < copy.length - 1; i++)
			if (copy[i] != copy[i + 1])
				cnt++;
		if (cnt == 0 || cnt == 1)
			return false;
		else
			return true;
	}
}
