package programmers;

import java.util.Arrays;

public class 실패율 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public int[] solution(int N, int[] stages) {
	        Node[] arr = new Node[N];
	        for(int i=1; i<=N; i++){
	            int fail=0;
	            int success=0;
	            double failRate=0.0;
	            for(int j=0; j<stages.length; j++){
	                if(stages[j]==i) fail++;
	                if(stages[j]>=i) success++;
	            }
	            System.out.println(fail +" " + success);
	            if(fail == 0){
	                failRate=0;
	            }else{
	                failRate = (double)fail/success;    
	            }
	            arr[i-1] = new Node(i, failRate);
	        }
	        Arrays.sort(arr);
	        int[] answer = new int [N];
	        int idx=0;
	        for(Node now: arr){
	            answer[idx++] = now.num;
	        }
	        return answer;
	    }
	    static class Node implements Comparable<Node>{
	        int num;
	        double failRate;
	        public Node(int num, double failRate){
	            this.num = num;
	            this.failRate = failRate;
	        }
	        @Override
	        public int compareTo(Node o){
	            if(Double.compare(o.failRate,failRate)==0){
	                // 번호 오름차순
	                return this.num - o.num;
	            }else{
	                // 실패율 내림차순
	                return Double.compare(o.failRate,failRate);
	            }
	        }
	        @Override
	        public String toString(){
	            return "num  "+ this.num + "  failRate  " + this.failRate;
	        }
	    }
	}

}
