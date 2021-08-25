package jungol.수학;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 최대공약수_최소공배수_1002 {
	static int gcd=0,lcm=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] numbers = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		lcm = gcd = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			gcd = get_gcd(gcd, numbers[i]);
			lcm = get_lcm(lcm, numbers[i]);
		}
		System.out.print(gcd +" "+ lcm);
		
	}
	private static int get_lcm(int x, int y) {
		return x*y / gcd_get_recursive(x, y);
	}
	static int gcd_get_recursive ( int x, int y ) {
		if(y==0) return x;
		return gcd_get_recursive(y, x%y); // // x와 y의 최대공약수는 y와 x % y 의 최대공약수와 같다.
	}
	
	static int get_gcd(int x, int y) {
		int r;
		while(y!=0) { //y가 0이면 x가 최대공약수이므로 종료.
			r = x%y;
			x = y;
			y = r;
		}
		return x; // 최대공약수를 리턴한다.
	}
	

}
