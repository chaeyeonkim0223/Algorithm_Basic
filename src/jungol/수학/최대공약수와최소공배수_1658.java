package jungol.수학;

import java.util.Scanner;

public class 최대공약수와최소공배수_1658 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd=0, lcm=0;
		if(b>a) { // 시간을 줄이는데 크게 도움은 되지못한다.
			int temp = b;
			b = a;
			a = temp;
		}
//		for(int i=1; i<b+1; i++) {
//			if(a%i==0 && b%i==0) {
//				gcd=i;
//			}
//		}
		gcd = gcd_get_recursive(a, b);
		lcm = a * b / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
	static int gcd_get (int x, int y) {
		int r;
		while(y!=0) { //y가 0이면 x가 최대공약수이므로 종료.
			r = x%y;
			x = y;
			y = r;
		}
		return x; // 최대공약수를 리턴한다.
	}
	static int gcd_get_recursive ( int x, int y ) {
		if(y==0) return x;
		return gcd_get_recursive(y, x%y); // // x와 y의 최대공약수는 y와 x % y 의 최대공약수와 같다.
	}
}
