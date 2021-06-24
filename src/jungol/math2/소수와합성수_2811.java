package jungol.math2;

import java.util.Arrays;
import java.util.Scanner;

public class 소수와합성수_2811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			int nowNum = sc.nextInt();
			int sq = (int)Math.sqrt(nowNum);
			for (int j = 1; j <= sq; j++) {
				if(nowNum%j==0) {
					nums[i]++;
					if(j != nowNum/j) {
						nums[i]++;
					}
				}
			}
			/*
			for (int j = 1; j*j <= nowNum; j++) {
				if(nowNum%j==0) {
					nums[i]++;
					if(j != nowNum/j) {
						nums[i]++;
					}
				}
			}
			 */
		}
		//출력
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) System.out.println("number one");
			else if (nums[i]==2) System.out.println("prime number");
			else System.out.println("composite number");
		}
	}

}
