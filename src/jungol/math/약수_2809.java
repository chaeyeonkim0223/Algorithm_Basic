package jungol.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 약수_2809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 1000 1000 
		List<Integer> list = new ArrayList<>();
		for(int i=1; i*i<=n; i++) {
			if(n%i==0) {
				if(!list.contains(i)) list.add(i);
				if(!list.contains(n/i)) list.add(n/i);
			}
		}
		Collections.sort(list);
		for( int a : list ){
			System.out.print(a+" ");
		}
	}

}
