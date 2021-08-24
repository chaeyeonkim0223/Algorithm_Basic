package programmers;

public class 약수의합 {

	public static void main(String[] args) {

	}

	static class Solution {
		public int solution(int n) {
			int answer = 0;
			// 1. n까지 다 돌기
			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					answer += i;
			}
			// 2. 어차피 약수니까 제곱근 까지만 돌기
			for (int i = 1; i <= (int) Math.sqrt(n); i++) {
				if (n % i == 0) {
					answer += i;
					if (i != n / i) {
						answer += n / i;
					}

				}
			}
			return answer;
		}
	}

}
