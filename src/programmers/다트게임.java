package programmers;

import java.util.Arrays;

public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		int answer = 0;
		int sum = 0; // 총합
		int scores[] = new int[3];
		int idx = 0;
		for (int i = 0; i < dartResult.length(); i += 2) {
			int nowScore = 0;
			int score = 0;
			char Bonus = 'a';
			if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
				score = 10;
				i++;
			} else
				score = dartResult.charAt(i) - '0';
			Bonus = dartResult.charAt(i + 1);
			nowScore = calc(score, Bonus);
			scores[idx++] = nowScore;
			if (i + 2 < dartResult.length()) {
				if (dartResult.charAt(i + 2) == '*') {
					// 첫번째일때
					if (i == 0) {
						scores[0] *= 2;
					}
					// 해당점수 & 바로 전 점수 2배
					else {
						if (idx - 1 < 0) {
							scores[0] *= 2;
						} else {
							scores[idx - 2] *= 2;
							scores[idx - 1] *= 2;
						}
					}
					i++;
				} else if (dartResult.charAt(i + 2) == '#') {
					scores[idx - 1] *= -1;
					i++;
				}
			}
		}
		for (int i = 0; i < scores.length; i++) {
			answer += scores[i];
		}
		System.out.println(answer);
	}

	static int calc(int nowScore, char a) {
		if (a == 'S') {
			return (int) Math.pow(nowScore, 1);
		}
		if (a == 'D') {
			return (int) Math.pow(nowScore, 2);
		}
		if (a == 'T') {
			return (int) Math.pow(nowScore, 3);
		}
		return 0;
	}

}
