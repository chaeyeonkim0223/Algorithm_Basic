package jungol.string;

import java.util.Scanner;

public class 문자열찾기_fail {
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] str = sc.next().toCharArray();
		int KOI=0,IOI=0;
		String koiString="KOI",ioiSTring="IOI";
		for (int i = 0; i < str.length ; i++) {
			if(str[i]=='K') {
				boolean flag_koi=true;
				for (int j = 0; j < 3 & i+j < str.length & flag_koi; j++) {
					if(koiString.charAt(j)!=str[i+j]) flag_koi = false;
				}
				if(flag_koi) KOI++;
			}
			if(str[i]=='I') {
				boolean flag_ioi=true;
				for (int j = 0; j < 3 & i+j < str.length & flag_ioi; j++) {
					if(ioiSTring.charAt(j)!=str[i+j]) flag_ioi = false;
				}
				if(flag_ioi) IOI++;//
			}
		}
		System.out.println(KOI);
		System.out.println(IOI);
	}

}
