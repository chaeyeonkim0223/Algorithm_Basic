package jungol.math2;

import java.util.Scanner;

public class 소수_1740 {
	static int M,N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		int sum=0,min=Integer.MAX_VALUE;
		
		for (int i = M; i <= N; i++) {
			if(isPrime(i)) {
				sum +=i;
				min = (min > i) ? i : min; 
			}
		}
		if(min != Integer.MAX_VALUE) {
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println(-1);
		}
	
	}
	static boolean isPrime(int number) {
		if(number < 2) return false;
		int sq = (int)Math.sqrt(number);
		//1과 자신 이외에 약수가 있으면 소수가 아니다. 
		//수가 커질 경우를 대비해 제곱근으로 계산
		for (int i = 2; i <= sq; i++) {
			if(number%i==0) return false;
		}
		return true;
	}
}
