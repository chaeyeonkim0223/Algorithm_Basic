package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_공주님을_구해라 {
	static int N, M, T;
	static int[][] map;
	static boolean visit[][][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		T = sc.nextInt();
		visit = new boolean[N][M][2];
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int cnt = bfs();
		if (cnt <= T) {
			if (visit[N - 1][M - 1][0] || visit[N - 1][M - 1][1]) {
				System.out.println(cnt);
			} else {
				System.out.println("Fail");
			}
		} else {
			System.out.println("Fail");
		}
	}

	static int dr[] = { -1, 1, 0, 0 };
	static int dc[] = { 0, 0, -1, 1 };

	private static int bfs() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(0, 0, 0));
		visit[0][0][0] = true; 
		int count = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int s = 0; s < size; s++) {
				Point now = q.poll();
				if (now.r == N - 1 && now.c == M - 1) {
					return count;
				}
				for (int d = 0; d < 4; d++) {
					int nr = now.r + dr[d];
					int nc = now.c + dc[d];
					if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visit[nr][nc][now.g]) {
						if (now.g == 1) {
							visit[nr][nc][now.g] = true;
							q.add(new Point(nr, nc, now.g));
						} else {
							if (map[nr][nc] == 1)
								continue;
							visit[nr][nc][now.g] = true;
							if (map[nr][nc] == 2) {
								q.add(new Point(nr, nc, 1));
							} else {
								q.add(new Point(nr, nc, 0));
							}
						}
					}
				}
			}
			count++;
		}
		return count;
	}

	static class Point {
		int r, c, g;

		public Point(int r, int c, int g) {
			super();
			this.r = r;
			this.c = c;
			this.g = g;
		}

		@Override
		public String toString() {
			return "Point [r=" + r + ", c=" + c + " " + g;
		}

	}

}
