package jungol.수학;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 숫자의개수_1430 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.toString();
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String total = String.valueOf(A*B*C);
		int arr[] = new int [10];
		for(int i=0; i<total.length(); i++) {
			arr[total.charAt(i)-'0']++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static class B {
		
	}

}
