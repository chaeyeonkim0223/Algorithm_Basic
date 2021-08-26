package programmers;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static public class Solution {
	    public int[] solution(int []arr) {
	        
	        // int now = arr[0];
	        int now = 10; // 나올 수 없는 값으로 세팅하기
	        List<Integer> list = new ArrayList<>();
	        // list.add(now);
	        for(int i=0; i<arr.length; i++){
	            if(now != arr[i]){
	                list.add(arr[i]);
	                now = arr[i];
	            }else if (now == arr[i]){
	                continue;  
	            } 
	        }
	        int answer[] = new int [list.size()];
	        int idx=0;
	        for(int n : list){
	            answer[idx++] = n;
	        }
	        // hashmap을 사용한 풀이 : 숫자가 뒤죽박죽
	        // HashMap<Integer,Integer> hm = new HashMap<>();
	        // for(int now : arr){
	        //     if(hm.get(now)==null){
	        //         hm.put(now,1);
	        //     }else{
	        //         //아무것도하지않는다.
	        //     }
	        // }
	        // int[] answer = new int [hm.size()];
	        // int idx=0;
	        // for(int now : hm.keySet()){
	        //     answer[idx++] = now;
	        // }
	        /*
	                          입력값 〉	[1, 1, 3, 3, 0, 1, 1]
	                          기댓값 〉	[1, 3, 0, 1]
	                          실행 결과 〉	실행한 결괏값 [0,1,3]이(가) 기댓값 [1,3,0,1]와(과) 다릅니다.
	        */
	      
	        return answer;
	    }
	}

}
