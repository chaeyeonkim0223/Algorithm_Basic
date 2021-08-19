package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static class Solution {
	    // 나누어떨어지는값을 오름차순으로 정렬
	    // 예외 나누어떨어지는게 하나도없으면 -1담아서 반환
	    public int[] solution(int[] arr, int divisor) {
	        // int cnt=0;
	        List<Integer>list = new ArrayList<>();
	        for(int i=0; i<arr.length;i++){
	            if(arr[i]%divisor == 0){
	                list.add(arr[i]);
	                // cnt++;
	            }
	        }
	        if(list.size()==0){
	            int[] answer = new int [1];
	            answer[0]=-1;
	            return answer;
	        }else{
	        int[] answer = new int [list.size()];
	        int size=0;
	        for(int now : list){
	            answer[size++] = now;
	        }
	        Arrays.sort(answer);
	        return answer;
	            }
	    }
	}

}
