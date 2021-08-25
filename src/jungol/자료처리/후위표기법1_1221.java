package jungol.자료처리;

import java.util.Scanner;
import java.util.Stack;

public class 후위표기법1_1221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stk = new Stack<>();
		//연산식 들어옴
		for (int i = 0; i < n; i++) {
			char now = sc.next().charAt(0);
			//피연산자
			if(now>='0' && now <='9') {
				stk.add(now-'0');
			}
			//연산자
			else {
				int second = stk.pop();
				int first = stk.pop();
				switch (now) {
				case '+':
					stk.add(first + second);
					break;
				case '-':
					stk.add(first - second);
					break;
				case '/':
					stk.add(first / second);
					break;
				case '*':
					stk.add(first * second);
					break;
				}
			}
		}//end for
		System.out.println(stk.pop());
	}

}
