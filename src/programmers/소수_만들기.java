package programmers;

public class 소수_만들기 {

	public static void main(String[] args) {

	}
	static class Solution {
	    static int cnt;
	    public int solution(int[] nums) {
	        int answer = -1;
	        cnt=0;
	        combi(nums,0,0,0);
	        answer = cnt;
	        return answer;
	    }
	    static boolean isS(int num){
	        if(num ==1){
	            return false;
	        }
	        for(int i=2; i<num;i++){
	            if(num%i==0)return false;
	        }
	        return true;
	    }
	    static void combi(int []nums, int start, int idx, int sum){
	        if(idx == 3 ){
	            // 소수판별
	            if(isS(sum)) cnt++;  
	            return;
	        }
	        for(int i=start; i<nums.length;i++){
	            combi(nums,i+1,idx+1,sum + nums[i]);
	        }
	    }
	}

}
