package baekjoon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ_택배_배송 {
	static class Node implements Comparable<Node>{
		int e,w;
		public Node(int e, int w) {
			this.e = e;
			this.w = w;
		}
		@Override
		public String toString() {
			return "Node [e=" + e + ", w=" + w + "]";
		}
		@Override
		public int compareTo(Node o) {
			return this.w - o.w;
		}
	}
	static ArrayList<Node>[] list;
	static int N,M;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/택배배송.txt"));
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		list = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<Node>();
		}
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt()-1;
			int e = sc.nextInt()-1;
			int w = sc.nextInt();
			list[s].add(new Node(e, w));
			list[e].add(new Node(s, w));
		}
		int distance[] = new int [N];
		boolean visit[] = new boolean[N];
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, 0));
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0]=0;
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			if(now.e == N-1) continue;
			visit[now.e] = true;
			for (Node node : list[now.e]) {
				if(!visit[node.e] && distance[node.e] > distance[now.e] + node.w) {
					distance[node.e] = distance[now.e]+node.w;
					pq.add(new Node(node.e, distance[node.e]));
				}
			}
		}
		System.out.println(distance[N-1]);
	}

}
