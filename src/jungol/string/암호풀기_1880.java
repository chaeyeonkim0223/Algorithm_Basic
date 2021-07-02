package jungol.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 암호풀기_1880 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] dec = br.readLine().toCharArray();
		char[] input = br.readLine().toCharArray();
		for (int i = 0; i < input.length; i++) {
			//공백
			if(input[i]==' ') {
				System.out.print(input[i]);
			}else {
				//대소체크
				if(input[i]>=97) {
					System.out.print(dec[input[i]-'a']);
				}else {
					//소문자는 97~112 대문자는 65~90
					System.out.print((char)(dec[input[i]-'A']-32));
				}
			}
		}
	}

}
