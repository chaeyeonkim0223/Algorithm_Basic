package jungol.something;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Card[] cards = new Card[5];
		for (int i = 0; i < 5; i++) {
			cards[i] = new Card(sc.next(), sc.nextInt());
		}
		int ans=0, res=0;//ans가 최종
		//① 카드 5장이 모두 같은 색이면서 숫자가 연속적일 때, 점수는 가장 높은 숫자에 900을 더한다.
		Arrays.sort(cards);
		boolean flag = true;
		for (int i = 0; i < 4; i++) {
			if(!(cards[i].color.equals(cards[i+1].color)) && cards[i].num+1!=cards[i+1].num) flag = false;
		}
		if(flag) {
			res = cards[4].num + 900;
			ans = Math.max(ans, res);
		}
	}
	static class Card implements Comparable<Card>{
		String color;
		int num;
		
		public Card(String color, int num) {
			super();
			this.color = color;
			this.num = num;
		}

		@Override
		public String toString() {
			return "Card [color=" + color + ", num=" + num + "]";
		}
		@Override
		public int compareTo(Card o) {
			return this.num - o.num;
			//숫자오름차순
		}
	}

}
