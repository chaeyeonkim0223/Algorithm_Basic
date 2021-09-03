package programmers;

public class 일주차 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = 0;
	        
	        for(int i=1; i<=count; i++){
	            int mul=price * i;
	            answer += mul;
	        }
	        if(money - answer<0){
	            answer = Math.abs(money-answer);
	        }else{
	            answer =0;
	        }
	        return answer;
	    }
	}

}
