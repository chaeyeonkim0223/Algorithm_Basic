package jungol.string;

import java.util.Scanner;
import java.util.Stack;

public class 그릇_2604 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int res=10;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i-1)==str.charAt(i)) {
				res +=5;
			}else {
				res +=10;
			}
		}
		System.out.println(res);
	}

}
