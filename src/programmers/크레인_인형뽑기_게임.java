package programmers;

import java.util.*;

class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
      
        
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0; i<moves.length; i++){
            int idx = moves[i]-1;
            for(int j=0; j<board.length; j++){
                if(board[j][idx]!=0){
                    int now = board[j][idx];
                    board[j][idx]=0;
                    if(!stk.isEmpty() && now == stk.peek()){
                        stk.pop();
                        answer+=2;
                    }else{
                        stk.push(now);
                    }
                    break;
                }
            }
        }
         return answer;
    }
}