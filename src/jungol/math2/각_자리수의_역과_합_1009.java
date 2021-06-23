package jungol.math2;

import java.util.Scanner;

public class 각_자리수의_역과_합_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = null;
		while(true) {
			String num = sc.next();
			if(num.equals("0")) break;
			//역
			sb = new StringBuilder();
			sb.append(num);
			String str = sb.reverse().toString();
			int idx=0;
			//불필요 0 제거
			while(str.charAt(idx)=='0') {
				idx++;
			}
			for (int i = idx; i < num.length(); i++) {
				System.out.print(str.charAt(i));
			}System.out.print(" ");
			//합
			int sum=0;
			for (int i = 0; i < num.length(); i++) {
				sum += num.charAt(i)-'0';
			}
			System.out.println(sum);
		}
	}

}
