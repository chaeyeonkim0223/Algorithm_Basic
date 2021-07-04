package jungol.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 암호풀기_1880 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] dec = br.readLine().toCharArray();//인덱스 0,1,2,3-> a,b,c,d,라고 생각
		char[] input = br.readLine().toCharArray();//바꿀 문자열
		for (int i = 0; i < input.length; i++) {
			//공백
			if(input[i]==' ') {
				System.out.print(input[i]);
			}else {
				//대소체크
				//input이 소문자면( 97=a이상이면 )
				if(input[i]>=97) {
					//소문자로 출력해야하니까 input a가 들어왔다? -> a-a = 0 , 
					System.out.print(dec[input[i]-'a']);
				}else {
					//소문자는 97~112 대문자는 65~90 
					//대문자면 대문자로 출력해야함
					//소문자와 대문자의 int값 차이는 32
					System.out.print((char)(dec[input[i]-'A']-32));
				}
			}
		}
	}

}
