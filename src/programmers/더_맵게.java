package programmers;

import java.util.PriorityQueue;

public class 더_맵게 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public int solution(int[] scoville, int K) {
	        int answer = 0;
	        PriorityQueue<Integer>pq = new PriorityQueue<>();
	        for(int now : scoville){
	            pq.add(now);
	        }
	        int cnt=0;
	        while(true){
	            if(pq.size()==1){
	                int check = pq.peek();
	                if(check<K) {
	                    answer =-1;
	                    break;
	                }else{
	                    answer = cnt;
	                    break;
	                }
	            }
	            int first = pq.poll();
	            int second = pq.poll();
	            if(first>=K && second >=K) {
	                answer = cnt;
	                break;      
	            }
	            int temp = first + second*2;
	            pq.add(temp);
	            cnt++;
	        }
	        return answer;
	    }
	}

}
