package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class 최단경로_2차원배열_인접리스트 {
	static int V,E,K;
	static class Node{
		int e,w;
		public Node(int e, int w) {
			this.e =e;
			this.w =w;
		}
	}
	static ArrayList<Node>[] list;
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input/최단경로.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine()) -1;
		
		list = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			list[i] = new ArrayList<Node>();
		}
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int u = Integer.parseInt(st.nextToken())-1;
			int v = Integer.parseInt(st.nextToken())-1; 
			int w = Integer.parseInt(st.nextToken());
			list[u].add(new Node(v, w));
		}
		int[] distance = new int [V];
		boolean visit[] = new boolean[V];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[K]=0;
		//다익스트라 시작
		for (int cnt = 0; cnt < V; cnt++) {
			int min = Integer.MAX_VALUE;
			int current =0;
			for (int i = 0; i < V; i++) {
				if(!visit[i] & min > distance[i]) {
					min = distance[i];
					current = i;
				}
			}
			visit[current] = true;
			for (Node  node : list[current]) {
				if(!visit[node.e] && distance[node.e] > min + node.w	) {
					distance[node.e] = min + node.w;
				}
			}
		}
		for (int i = 0; i < distance.length; i++) {
			if(distance[i]==Integer.MAX_VALUE) {
				System.out.println("INF");
			}
			else{
				System.out.println(distance[i]);
			}
		}
	}
	

}
