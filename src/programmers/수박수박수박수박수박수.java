package programmers;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public String solution(int n) {
	        String answer = "";
	        for(int i=0; i<n; i++){
	            if(i%2==0)answer+="수";
	            else answer+="박";
	        }
	        return answer;
	    }
	}

}
