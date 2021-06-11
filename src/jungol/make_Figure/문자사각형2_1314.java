package jungol.make_Figure;

import java.util.Scanner;

public class 문자사각형2_1314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch ='A';
		char[][] arr = new char[n][n];
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				for(int j=0; j<n; j++) {
					arr[j][i]= ch++;
					if(ch =='[') ch ='A';
				}
			}else {
				for(int j=n-1; j>=0; j--) {
					arr[j][i]= ch++;					
					if(ch =='[') ch ='A';
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}

}
