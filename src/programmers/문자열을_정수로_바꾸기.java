package programmers;

public class 문자열을_정수로_바꾸기 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public int solution(String s) {
	        int answer = 0;
	       
	        // if(s.charAt(0)=='-'){
	        //     answer = -Integer.parseInt(s.substring(1,s.length()));
	        // }else{
	        //   answer = Integer.parseInt(s);    
	        // }
	        // 함수로 다 해결된다 -> 숫자와 부호(-,+)로만 이루어져 있을 경우
	        
	        answer = Integer.parseInt(s);    
	        return answer;
	    }
	}

}
