package programmers;

import java.util.HashMap;
/**
 * 
 * @author chaeyeonkim0223
       테스트 1 〉	통과 (0.17ms, 72.2MB)
// 테스트 2 〉	통과 (0.18ms, 58.5MB)
// 테스트 3 〉	통과 (0.18ms, 71.5MB)
// 테스트 4 〉	통과 (0.25ms, 72.8MB)
// 테스트 5 〉	통과 (0.19ms, 74.8MB)
// 테스트 6 〉	통과 (0.19ms, 72.8MB)
// 테스트 7 〉	통과 (0.30ms, 75.1MB)
// 테스트 8 〉	통과 (0.19ms, 73.1MB)
// 테스트 9 〉	통과 (0.28ms, 58.4MB)
// 테스트 10 〉	통과 (0.22ms, 72.7MB)
 */
public class 숫자_문자열과_영단어 {

	public static void main(String[] args) {

	}
	static class Solution {
		public int solution(String s) {
			int answer = 0;
			String[] temp = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
			HashMap<String, String> hm = new HashMap<>();
			hm.put("zero", "0");
			hm.put("one", "1");
			hm.put("two", "2");
			hm.put("three", "3");
			hm.put("four", "4");
			hm.put("five", "5");
			hm.put("six", "6");
			hm.put("seven", "7");
			hm.put("eight", "8");
			hm.put("nine", "9");
			for (String now : temp) {
				if (s.contains(now)) {
					s = s.replace(now, hm.get(now));
				}
			}
			answer = Integer.parseInt(s);
			return answer;
		}
	}
}
