package programmers;

public class 가운데_글자_가져오기 {

	public static void main(String[] args) {
		   

	}
	 public static String solution(String s) {
	        if(s.length()==1){
	            return s;
	        }else if(s.length()==2){
	            return s;
	        }else if(s.length()%2==1){
	            int idx = s.length()/2;
	            String str = s.substring(idx,idx+1);
	            return str;
	        }else if(s.length()%2==0){
	            int idx = s.length()/2;
	            String str = s.substring(idx-1,idx+1);
	            return str;
	        }
	        String answer ="";
	        return answer;
	    }

}
