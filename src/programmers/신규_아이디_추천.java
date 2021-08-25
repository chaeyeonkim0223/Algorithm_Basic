package programmers;

public class 신규_아이디_추천 {

	public static void main(String[] args) {

	}

	static class Solution {
		public String solution(String new_id) {
			// 1 level new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
			new_id = new_id.toLowerCase();
			String ni = "";
			// 2 level new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
			for (int i = 0; i < new_id.length(); i++) {
				char n = new_id.charAt(i);
				if (n >= 'a' && n <= 'z') {
					ni += String.valueOf(n);
				} else if (n >= 'A' && n <= 'Z') {
					ni += String.valueOf(n);
				} else if (n >= '0' && n <= '9') {
					ni += String.valueOf(n);
				} else if (n == '-' || n == '_' || n == '.') {
					ni += String.valueOf(n);
				}
			}
			// level 3 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			while (ni.contains("..")) {
				ni = ni.replace("..", ".");
			}

			// level 4 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
			if (ni.charAt(0) == '.') {
				ni = ni.substring(1, ni.length());
			}
			int len = ni.length();
			for (int i = 0; i < ni.length(); i++) {
				if (ni.charAt(i) == '.' && i == ni.length() - 1) {
					ni = ni.substring(0, i);
				}
			}
			String answer = "";
			// level 5,6,7 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
			if (ni.equals("")) {
				ni = "a";
			}
			// new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
			// 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다 .
			if (ni.length() >= 16) {
				ni = ni.substring(0, 15);
				if (ni.charAt(14) == '.') {
					ni = ni.substring(0, 14);
				}
			}
			// new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.  
			if (ni.length() <= 2) {
				String last = ni.substring(ni.length() - 1, ni.length());
				while (ni.length() <= 2) {
					ni += last;
				}
			}
			answer = ni;
			return answer;
		}

	}

}
