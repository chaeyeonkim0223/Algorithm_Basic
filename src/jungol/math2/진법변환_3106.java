package jungol.math2;

import java.util.Scanner;

public class 진법변환_3106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int before = sc.nextInt();
			if(before==0) break;
			String n = sc.next();
			int after = sc.nextInt();
			//int로 하면 범위 벗어남. 2^63이 1억이 넘기 때문.//
			long ten=0,idx=1;
			for (int i = n.length()-1; i>=0 ; i--) {
				if(n.charAt(i)>='A'&& n.charAt(i)<='Z') {
					ten += (int)(n.charAt(i)-55)*idx;
				}else {
					ten += (n.charAt(i)-'0')*idx;
				}
				idx *= before;
			}
			StringBuilder sb = new StringBuilder();
			while(ten/after>0) {
				if((ten%after>=10)) {
					sb.append((char)(ten%after + 55));
				}
				else sb.append(ten%after);
				ten/=after; 
			}
			if(ten>=10) {
				sb.append((char)(ten+55));
			}else {
				sb.append(ten);
			}
			System.out.println(sb.reverse().toString());
		}
	}

}
