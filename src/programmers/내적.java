package programmers;

public class 내적 {

	public static void main(String[] args) {

	}
	public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            int m = 0;
            m = a[i] * b[i];
            answer += m;
        }
        return answer;
    }

}
