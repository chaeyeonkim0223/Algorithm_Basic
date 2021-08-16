	package programmers;
	
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	import java.util.List;
	
	public class 실패율 {
		static int N = 4;
		static int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//		static int[] stages = {4,4,4,4,4};
		public static void main(String[] args) {
			int answer[] = new int[N];
			answer = solution(N,stages);
		}
		private static int[] solution(int N, int[] stages) {
			// 실패율, state번호를 객체배열에 저장
			List<Point> list = new ArrayList<>();
			Point[] pp = new Point[N+1];
//			pp[0] = new Point(0, 0);
			for (int i = 1; i <= N; i++) {
				int fail = 0;//실패한사람
				int success =0;//성공한사람
				for (int j = 0; j < stages.length; j++) {
					if(i>=stages[j] && stages[j]>i-1) {
						//도달은 했으나 클리어하지 못한 플레이어의 수
						fail++;
					}	
					if(i<=stages[j]) {
						//도달한 플레이어의 수  
						success++;
					}
				}
				if(success==0) {
					Point p = new Point(i, 0);
					list.add(p);
//					pp[i] = p;
				}else {
					Point p = new Point(i, (double)fail/success);
					list.add(p);
//					pp[i] = p;
				}
				
			}
			Collections.sort(list);
//			Arrays.sort(pp);
			int[] answer = new int [N];
			System.out.println(Arrays.toString(pp));
			for (int i = 0; i < list.size(); i++) {
				answer[i]= list.get(i).stateNum;
			}
			return answer;
		}
		static class Point implements Comparable<Point>{
			int stateNum=0;
			double failRate=0;
			public Point(int stateNum, double failRate) {
				super();
				this.stateNum = stateNum;
				this.failRate = failRate;
			}
			@Override
			public String toString() {
				return "Point [stateNum=" + stateNum + ", failRate=" + failRate + "]";
			}

			@Override
			public int compareTo(Point o) {
				if(Double.compare(o.failRate, failRate) == 0) {				
					return stateNum - o.stateNum;
				}
				else {
					return Double.compare(o.failRate, failRate);
				}
			}
		}
	
	}
