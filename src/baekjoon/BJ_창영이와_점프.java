package baekjoon;

import java.util.Scanner;

public class BJ_창영이와_점프 {
	static int N,K,arr[],max;
	public static void main(String[] args) {
//		시작점 임의설정, 점프 최대 1번 
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		max = Integer.MIN_VALUE;
		arr = new int [N-1];
		for (int i = 0; i < N-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N-1; i++) {
			int step=1;
			boolean flag =false;
			for (int j = i; j < N-1; j++) {
				if(arr[j]>K) {
					if(!flag) {
						step++;
						flag = true;
						continue;
					}else {
						max = Math.max(max, step);
						break;
					}
				}else {
					step++;
				}
			}
			max = Math.max(max, step);
		}
		System.out.println(max);
	}

}
