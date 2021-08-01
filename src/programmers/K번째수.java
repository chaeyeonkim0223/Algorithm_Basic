package programmers;

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //인덱스 i-1~j-1까지 자르기. 
        //새 배열에 만들어 넣기
        //k-1인덱스의 수 구해서 배열에 넣기
         int[] answer = new int[commands.length] ;
        int inputIdx=0;
	        for(int tc=0; tc<commands.length; tc++){
	            int i = commands[tc][0];
	            int j = commands[tc][1];
	            int k = commands[tc][2];
	            System.out.println(i +" "+ j + " "+ k);
	            int newArray[] = new int [j-i+1]; //i부터j까지는 j-i+1
	            int idx=0;
	            for(int start=i-1; start<=j-1; start++){//start<=j-1해야 i부터j까지
	                newArray[idx++] = array[start];
	            }
	            Arrays.sort(newArray);
	            System.out.println("k번쨰의 수 "+ newArray[k-1]);
	            answer[inputIdx++] = newArray[k-1];
	        
            }
        return answer;
    
    }
}