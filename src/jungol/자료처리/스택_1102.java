package jungol.자료처리;

import java.util.Scanner;
import java.util.Stack;

public class 스택_1102 {
/*
 * i: push
 * o: pop
 * c: size
 */
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < n ; i++) {
			char now = sc.next().charAt(0);
			if(now =='i') {
				stk.push(sc.nextInt());
			}else if(now=='o'){
				if(stk.isEmpty()) {
					System.out.println("empty");
				}else {
					System.out.println(stk.pop());
				}
			}else {
				System.out.println(stk.size());
			}
		}
	}

}
