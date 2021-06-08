package jungol.make_Figure;

import java.util.Scanner;

public class 구구단_2191 {
	static int s,e;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {	
			s = sc.nextInt();
			e = sc.nextInt();
			if(2<=s && s<=9 && 2<=e && e<=9) {
				break;
			}
			else {
				System.out.println("INPUT ERROR!");
				continue;
			}
		}
		gugu();

	}

	private static void gugu() {
		for (int i = 1; i <= 9; i++) {
			if(s>e) {
				for (int j = s; j >= e; j--) {
					if(j*i<10)System.out.printf("%d * %d =  %d   ", j,i,j*i);
					else System.out.printf("%d * %d = %d   ", j,i,j*i);
				}
				System.out.println();				
			}else {
				for (int j = s; j <= e; j++) {
					if(j*i<10)System.out.printf("%d * %d =  %d   ", j,i,j*i);
					else System.out.printf("%d * %d = %d   ", j,i,j*i);
				}
				System.out.println();	
			}
		}
	}

}
