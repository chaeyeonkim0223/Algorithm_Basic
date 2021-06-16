package jungol.math;

import java.util.Arrays;
import java.util.Scanner;
// 17MB	405ms
public class 약수_2810_배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [1000]; // 1000 * 1000 1억이니까 제곱근인 100만큼만 선언
		int sqrt = (int) Math.sqrt(n);
		int cnt = 0;
		for(int i=1; i<=sqrt; i++) {
			if(n%i==0) { // i가 n의 약수라면
				arr[cnt++] =i; // 작은약수 i 저장
				if(i != n/i) { // ex 10 * 10 = 100처럼 같지않다면
					arr[cnt++] = n/i; // 큰 약수 저장
				}
			}
		}
		int[] arr2 = new int [cnt];
		System.arraycopy(arr, 0, arr2, 0, cnt);
		Arrays.sort(arr2);
		for(int i=0; i<cnt; i++) {
			System.out.print(arr2[i]+ " ");
		}
	}

}
