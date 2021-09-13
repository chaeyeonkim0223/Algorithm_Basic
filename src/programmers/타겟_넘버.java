package programmers;

public class 타겟_넘버 {

	public static void main(String[] args) {
		
	}
	static class Solution {
	    static int answer;
	    public int solution(int[] numbers, int target) {
	        answer = 0;
	        
	        recursive(numbers,target, 0, new boolean[numbers.length], 0);
	        return answer;
	    }
	    static void recursive(int[] numbers, int target, int res, boolean[] v, int idx){
	        if(idx == numbers.length){
	            if(res == target) answer ++;
	            return;
	        }
	        v[idx]=true;
	        recursive(numbers,target,res + numbers[idx],v, idx + 1);
	        v[idx]=false;
	        recursive(numbers,target,res - numbers[idx],v, idx + 1);
	    }
	}

}
