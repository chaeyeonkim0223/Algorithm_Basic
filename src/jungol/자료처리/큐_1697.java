package jungol.자료처리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 큐_1697 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();	
		for (int i = 0; i < n ; i++) {
			char now = sc.next().charAt(0);
			if(now =='i') {
				q.add(sc.nextInt());
			}else if(now=='o'){
				if(q.isEmpty()) {
					System.out.println("empty");
				}else {
					System.out.println(q.poll());
				}
			}else {
				System.out.println(q.size());
			}
		}
	}

}
