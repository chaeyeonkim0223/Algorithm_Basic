package programmers;

import java.util.Arrays;

public class 비밀지도 {

	public static void main(String[] args) {
		int n = 5;
		int []arr1 = {9, 20, 28, 18, 11};
		int []arr2 = {30, 1, 21, 17, 28};
		String[] answer =solution(n,arr1,arr2);
		System.out.println(Arrays.toString(answer));
	}
	 public static String[] solution(int n, int[] arr1, int[] arr2) {
	        // step 1. 배열 1,2 만들기
	        // 2진수로변환
	        int[][] arr1_binary = new int [n][n];
	        int[][] arr2_binary = new int [n][n];
	        for(int i=0; i<n;i++){
	            String now = Integer.toBinaryString(arr1[i]); 
	            String now2 = Integer.toBinaryString(arr2[i]); 
	            int diff1 =n-now.length();
	            for(int j=diff1; j<n; j++){
	                arr1_binary[i][j] = now.charAt(j-diff1)-'0'; 
	            }
	            int diff2 = n-now2.length();
	            for (int j =diff2; j<n; j++) {
	            	arr2_binary[i][j] = now2.charAt(j-diff2)-'0';
				}
	        }
	        // step 2. 겹치기 
	        char [][]new_secret = new char [n][n];
	         for(int i=0; i<new_secret.length;i++){
	             // 둘중 하나라도 1이면 1 아니면 0
	            for(int j=0; j<new_secret[0].length; j++){
	             if(arr1_binary[i][j]==1 || arr2_binary[i][j]==1){
	                 new_secret[i][j]='#';
	             }else{
	                 new_secret[i][j]=' ';
	             }
	            }
	        }
	        // step 3. 출력하기 char[][] -> String[]
	        String[] answer = new String [n];
	        for(int i=0; i<new_secret.length; i++){
	            String str = "";
	            for(int j=0; j<new_secret.length; j++){
	                str += String.valueOf(new_secret[i][j]);
	            }
	            answer[i] = String.valueOf(str);
	        }
	        return answer;
	    }
	 /*
	  * 	String.format으로 자릿수 맞춰주기.
	  * 	replaceAll로 숫자를 문자로 변환해주기.
	  *     for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }
	  */

}
