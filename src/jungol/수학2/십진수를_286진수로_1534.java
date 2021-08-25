package jungol.수학2;

import java.util.Scanner;

public class 십진수를_286진수로_1534 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int B = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(n/B>0) {
			if(B==2||B==8) {
				sb.append(n%B);
			}else {
				if((n%B>=10)) 	sb.append((char)(n%B + 55));
				else sb.append(n%B);
			}
			n/=B; 
		}
		sb.append(n);
		sb.reverse();
		System.out.println(sb.toString());
	}

}
