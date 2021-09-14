package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_DFS와_BFS {
	static int N,M,V;
	static ArrayList<Integer> [] list;
	static boolean [] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 M = sc.nextInt();
		 V = sc.nextInt(); 
		list = new ArrayList [N+1];
		visit = new boolean[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		dfs(V);
		System.out.println();
		visit = new boolean[N+1];
		bfs(V);
		
	}
	static void dfs(int n) {
		visit[n]=true;
		System.out.print(n + " ");
		Collections.sort(list[n]);
		for(int i=0; i<list[n].size(); i++) {
			if(!visit[list[n].get(i)]) {
				dfs(list[n].get(i));
			}
		}
	}
	static void bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		visit[n] = true;
		q.add(n);
		System.out.print(n + " ");
		while(!q.isEmpty()) {
			int now = q.poll();
			Collections.sort(list[now]);
			for(int i=0; i<list[now].size(); i++) {
				if(!visit[list[now].get(i)]) {
					System.out.print(list[now].get(i)+" ");
					q.add(list[now].get(i));
					visit[list[now].get(i)]=true;
				}
			}
		}
	}
	
}
