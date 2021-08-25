package jungol.자료처리;

import java.util.Scanner;

public class 쇠막대기_2858 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int cnt=0,ans=0;
		for (int i = 0; i < arr.length; i++) {
			//레이저가 아닌 경우에만 cnt++
			if(i<arr.length-1 && arr[i+1]!=')' && arr[i]=='(') cnt++;
			if(arr[i]==')') {
				//레이저
				if(arr[i-1]=='(') {
					ans += cnt;
				}
				//+1
				else if(arr[i-1]==')') {
					ans++;
					cnt--;
				}
			}
		}
		System.out.println(ans);
	}

}
