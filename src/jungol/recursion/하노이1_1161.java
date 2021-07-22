package jungol.recursion;

import java.util.Scanner;

public class 하노이1_1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//원판갯수, 출발기둥, temp기둥, 목적기둥
		hanoi(n,1,2,3);
	}

	private static void hanoi(int n, int start, int temp, int to) {
		if(n<1) return;
		//start->temp
		hanoi(n-1,start,to,temp);
		System.out.println(n+" : "+start+" -> "+to);
		//temp->to
		hanoi(n-1,temp,start,to);
	}

}
