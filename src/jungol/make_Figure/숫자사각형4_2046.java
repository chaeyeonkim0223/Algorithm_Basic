package jungol.make_Figure;

import java.util.Scanner;

public class 숫자사각형4_2046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int type = sc.nextInt();
		switch (type) {
		case 1:
			for(int i=1; i<n+1; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(i+" ");
				}System.out.println();
			}
			break;
		case 2:
			for(int i=0; i<n; i++) {
				if(i%2==0) {
					for(int j=1; j<n+1; j++) {
						System.out.print(j+" ");
					}System.out.println();
				}else {
					for(int j=n; j>0; j--) {
						System.out.print(j+" ");
					}System.out.println();
				}
			}
			break;
		case 3:
			for(int i=1; i<n+1; i++) {
				for(int j=1; j<n+1; j++) {
					System.out.print(i*j +" ");
				}System.out.println();
			}
			break;
		}
		
	}

}
