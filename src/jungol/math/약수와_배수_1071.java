package jungol.math;

import java.util.Scanner;

public class 약수와_배수_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int [n];
		for(int i=0; i<n;i++) {
			numbers[i]= sc.nextInt();
		}
		int devide = sc.nextInt();
		int ySum =0,bSum=0;
		for(int i=0; i<n; i++) {
			if(numbers[i]%devide==0) {
				bSum += numbers[i];
			}
			if (devide%numbers[i]==0) {
				ySum += numbers[i];
			}
		}
		System.out.println(ySum);
		System.out.println(bSum);
	}

}
