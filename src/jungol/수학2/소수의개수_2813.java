package jungol.수학2;

import java.util.Scanner;

public class 소수의개수_2813 {
    static int prime[] = new int[2000005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        prime = new int [2000005];
        int cnt=0;
        eratos(N);
        for (int i = M; i <=N ; i++) {
            if(prime[i]==0) {
                cnt++; //1이아니다=소수이다
            }
        }
        System.out.println(cnt);
    }
    static void eratos(int N) {
        prime[0]=prime[1]=1;
         for (int i=2; i*i<=N; i++)
            {
        	 	//한번 더 거르기
                if (prime[i]== 0) {
                    for(int j=i*i; j<=N; j+=i) {
                        prime[j]=1;
                    }
                }
            } 
    }
}
