package programmers;

public class 삼진법_뒤집기 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        StringBuilder sb = new StringBuilder();
	        while(n>0){
	            int temp = n%3;
	            sb.append(temp);
	            n/=3;
	        }
	        String ten = sb.toString();
	             
	        while(ten.charAt(0)=='0'){
	            ten = ten.replaceFirst("0","");
	        }   
	        answer = Integer.parseInt(ten,3);//String 문자열을 3진법 수로 바꿔줌.
	        System.out.println(answer);
	        // int three=1;
	        // for(int i=ten.length()-1; i>=0; i--){
	        //     answer += (ten.charAt(i)-'0') * three;
	        //     three *=3;
	        // }
	        return answer;
	    }
	}

}
