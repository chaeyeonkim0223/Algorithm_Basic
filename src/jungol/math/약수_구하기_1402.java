package jungol.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 다른 방법for (i = 1; i <= N; i++)
{
    if (N % i == 0)   // i가 N의 약수이면
    {
        cnt++; // 약수의 개수(cnt)를 증가한다.
        if (cnt == K)   // 약수의 개수가 K개이면
        {
            printf("%d\n", i); // K번째 약수인 i를 출력하고
            return 0; // 프로그램을 종료한다.
        }
    }
}
 */
public class 약수_구하기_1402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				list.add(i);
		}
		if (list.size() < K) {
			System.out.println(0);
		} else {
			System.out.println(list.get(K - 1));
		}
	}

}
