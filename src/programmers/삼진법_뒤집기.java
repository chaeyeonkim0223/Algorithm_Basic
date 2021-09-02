package programmers;

public class 삼진법_뒤집기 {

	public static void main(String[] args) {

	}
	

	class Solution {
		    public int solution(int n) {
		        int answer = 0;
		        StringBuilder sb = new StringBuilder();
		        while(n>0){
		            int temp = n%3;
		            sb.append(temp);
		            n/=3;
		        }
		        String ten = sb.toString();
   
		        answer = Integer.parseInt(ten,3);//3진법 String 문자열을 10진법 수로 바꿔줌.
//		        int three=1;
//		        for(int i=ten.length()-1; i>=0; i--){
//		            answer += (ten.charAt(i)-'0') * three;
//		            three *=3;
//		        }
		        return answer;
		    }
		}

}
