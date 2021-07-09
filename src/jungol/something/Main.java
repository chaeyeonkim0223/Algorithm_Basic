package jungol.something;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int K = sc.nextInt();
		L: for (int i = 1; i <= K; i++) {
			for (int j = i; j <= K; j++) {
				if(fibo(i,j,D,K)) {
					System.out.println(i);
					System.out.println(j);
					break L;
				}
			}
		}
				
	}

	private static boolean fibo(int i, int j, int d, int k) {
		int day=1;
		int dduck=0;
		int firstDay=i, secondDay=j;
		
		while(day < d && dduck <=k) {
			dduck = firstDay + secondDay;
			firstDay = secondDay;
			secondDay = dduck;
			day++;
			if(day == d && dduck== k )return true;
		}
		return false;
	}

}
