package programmers;

public class 키패드_누르기 {

	public static void main(String[] args) {

	}
	static class Solution {
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        int [][] keys = {{1,2,3},
	                       {4,5,6},
	                       {7,8,9},
	                       {-1,0,-2}};

	        int leftR=3,leftC=0;
	        int rightR=3,rightC=2;//처음에 *과 #에 둠
	        for(int n=0; n<numbers.length; n++){
	            if(numbers[n]==1 || numbers[n]==4 || numbers[n]==7){
	                for(int i=0; i<3; i++){
	                    if(keys[i][0]==numbers[n]){
	                        leftR = i;leftC=0;
	                        answer += "L";
	                    }
	                }
	            }else if (numbers[n]==3 || numbers[n]==6 || numbers[n]==9){
	                     for(int i=0; i<3; i++){
	                    if(keys[i][2]==numbers[n]){
	                        rightR = i; rightC=2;
	                        answer += "R";
	                    }
	                }
	            }else{
	                for(int i=0; i<4; i++){
	                        if(keys[i][1]==numbers[n]){
	                            int dl = Math.abs(i-leftR) + Math.abs(1 - leftC);
	                            int dr = Math.abs(i-rightR) + Math.abs(1 - rightC);
	                            if(dl > dr){
	                                rightC =1; rightR = i;
	                                answer += "R";
	                            }else if (dl < dr){
	                                leftC=1; leftR = i;
	                                answer += "L";
	                            }else if (dl == dr){
	                                if(hand.equals("right")){
	                                    rightC=1; rightR = i;
	                                    answer += "R";
	                                }else{
	                                    leftC=1; leftR = i;
	                                    answer += "L";
	                                }
	                            }
	                    }
	                }
	            }
	        }
	        return answer;
	    }
	}

}
