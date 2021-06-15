package jungol.math;

import java.util.Scanner;

public class 최대공약수와최소공배수_1658 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd=0, lcm=0;
		if(b>a) {
			int temp = b;
			b = a;
			a = temp;
		}
		for(int i=1; i<b+1; i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		lcm = a * b / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}

}
