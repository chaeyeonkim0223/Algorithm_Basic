package jungol.문자열;

import java.util.Scanner;

public class 문자열찾기_2514 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] str = sc.next().toCharArray();
		int KOI=0,IOI=0;
		for (int i = 0; i < str.length-2; i++) {
			if(str[i]=='K'&&str[i+1]=='O'&&str[i+2]=='I') KOI++;
			if(str[i]=='I'&&str[i+1]=='O'&&str[i+2]=='I') IOI++;
		}
		System.out.println(KOI);
		System.out.println(IOI);
	}

}
