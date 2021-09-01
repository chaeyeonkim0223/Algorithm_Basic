package programmers;

public class 문자열_다루기_기본 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public boolean solution(String s) {
	        boolean answer = false;
	        //4,6이고
	        //숫자로만 구성되어있다면?
	        if(s.length()== 4 || s.length()== 6){
	            if(s.replaceAll("[0-9]","").length()==0) answer = true;
	        }
	        return answer;
	    }
	}

}
