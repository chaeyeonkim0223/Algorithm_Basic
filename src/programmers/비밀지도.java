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
		 	// 풀이 1.
		    // step 1. 배열 1,2 만들기
	        // 2진수로변환
		 	/*
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
	        */
	        // 풀이 2.
	        String[] answer = new String [n];
	        for(int i=0; i<n ; i++){
	            //2진수로 변환
	            String temp = "";
	            String n1 = Integer.toBinaryString(arr1[i]);
	            String n2 = Integer.toBinaryString(arr2[i]);
	            n1 = String.format("%" + n + "s", n1);
	            n2 = String.format("%" + n + "s", n2);
	            n1 = n1.replaceAll(" ", "0");
	            n2 = n2.replaceAll(" ", "0");
	            for(int j=0; j<n; j++){
	                if(n1.charAt(j) == '0' && n2.charAt(j) == '0'){
	                    temp +=" ";
	                }else{
	                    temp +="#";
	                }
	            }
	            answer[i]= temp;
	            //or연산
	            //string format으로 넣기
	        }
	        return answer;
	        
	    }

}
