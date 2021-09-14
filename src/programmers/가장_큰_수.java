package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

	public static void main(String[] args) {

	}
	class Solution {
	    public String solution(int[] numbers) {
	        String answer = "";
	        String [] string = new String[numbers.length];
	        for(int i=0; i<numbers.length; i++){
	            string[i] = String.valueOf(numbers[i]);
	        }
	        Arrays.sort(string, new Comparator<String>(){
	            public int compare(String o1, String o2){
	                return (o2+o1).compareTo(o1+o2);
	            }
	        });
	        if(string[0].equals("0")) return "0";
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i<string.length; i++){
	            sb.append(string[i]);
	        }
	        
	        answer = sb.toString();
	        
	        return answer;
	    }
	}

}
