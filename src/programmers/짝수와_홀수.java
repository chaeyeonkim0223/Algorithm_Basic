package programmers;

public class 짝수와_홀수 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public String solution(int num) {
	        String answer = "";
	        if(num%2==0){
	            answer ="Even";
	        }else{
	            answer ="Odd";
	        }
	        return answer;
	    }
	}

}
