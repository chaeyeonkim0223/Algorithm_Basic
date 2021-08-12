package programmers;

public class 서울에서_김서방_찾기 {

	public static void main(String[] args) {
	}
	    public static String solution(String[] seoul) {
	        String answer = "";
	        int idx=0;
	        for(int i=0; i<seoul.length; i++){
	            if(seoul[i].equals("Kim")){
	                idx=i;
	            }
	        }
	        String newIdx = String.valueOf(idx);
	        answer = "김서방은 "+ newIdx + "에 있다";
	        return answer;
	    }

}
