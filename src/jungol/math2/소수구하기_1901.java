package jungol.math2;

import java.util.Scanner;

public class 소수구하기_1901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(isPrime(num)) {
				System.out.println(num);
			}
			else {
				//내 앞,뒤 소수만 확인해봐도 됨. 굳이 2~1000000개의 소수를 다 구하지 않아도 된다.
				boolean flag = false;
				for (int j = 0; !flag; j++) {
					//이 두개는 동시출력이거나 하나만 만족하면 하나만출력하고 끝.
					if(isPrime(num-j)) {
						System.out.print(num-j+" ");
						flag = true;
					}
					if(isPrime(num+j)) {
						System.out.print(num+j);
						flag = true;
					}
				}System.out.println();
			}
		}
		
	}static boolean isPrime(int number) {
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
