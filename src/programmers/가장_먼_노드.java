package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 가장_먼_노드 {

	public static void main(String[] args) {

	}
	static class Solution_1 { // 인접행렬
	    static boolean []v;
	    static int [][]m;
	    static int res;
	    static class Node {
	        int num;
	        int count;
	        public Node(int num, int count){
	            this.num = num;
	            this.count=count;
	        }
	    }
	    public int solution(int n, int[][] edge) {
	        int answer = 0;
	        m = new int [n+1][n+1];
	        v = new boolean[n+1];
	        res=0;
	        for(int i=0; i<edge.length; i++){
	            m [edge[i][0]][edge[i][1]]=1;
	            m [edge[i][1]][edge[i][0]]=1;
	        }
	        bfs(1,edge);//max 찾을라고
	        System.out.println(res);
	        answer = res;
	        return answer;
	    }
	    static void bfs(int point, int [][]edge){
	        Queue<Node> q = new LinkedList<>();
	        List<Node> list = new ArrayList<Node>(); //max 찾으려고
	        q.add(new Node(point, 0));
	        v[point]=true;
	        System.out.print(1+" ");
	        int idx=1;//떨어진 거리

	        while(!q.isEmpty()){
	            int size = q.size();
	            list.add(new Node(idx++,size));
	            
	            for(int s=0; s<size; s++){
	                Node nowNode = q.poll();
	                int num = nowNode.num;
	                int count = nowNode.count;
	                for (int i = 1; i < m.length; i++) {
	                    if(m[num][i]==1 && v[i]==false) {
	                        q.offer(new Node(i, count + 1));
	                        v[i]=true;
	                        System.out.print(i+" ");
	                    }
	                }
	            }
	        }
	        res = list.get(list.size()-1).count;
	    
	    }
	}
	static class Solution_2 { //인접 리스트
	    static boolean []visited;
	    static int [][]m;
	    static int res;
	    static class Node {
	        int num;
	        int count;
	        public Node(int num, int count){
	            this.num = num;
	            this.count=count;
	        }
	    }
	    static ArrayList<ArrayList<Integer>> adjList;
	    public int solution(int n, int[][] edge) {
	        int answer = 0;
	        adjList=new ArrayList<ArrayList<Integer>>();
	        for(int i=0;i<edge.length;i++){
	            adjList.add(new ArrayList<Integer>());
	        }
	        int a, b;
	        for(int[] node:edge){
	            a=node[0];
	            b=node[1];
	            adjList.get(a).add(b);
	            adjList.get(b).add(a);
	        }
	        visited = new boolean[n+1];
	        res=0;

	        bfs(1,edge);//max 찾을라고
	        System.out.println(res);
	        answer = res;
	        return answer;
	    }
	    static void bfs(int point, int [][]edge){
	        Queue<Integer> q = new LinkedList<>();
	        List<Node> ll = new ArrayList<Node>(); // 해당 사이즈에 노드가 몇개 있는지 저장하는 list
	        q.add(1);
	        visited[point]=true;
	        System.out.print(1+" ");
	        int idx=0;//떨어진 거리
	        
	        while(!q.isEmpty()){
	            int size = q.size();
	            ll.add(new Node(idx++,size)); 
	            
	            for(int s=0; s<size; s++){
	                int now = q.poll();
	                for(int v:adjList.get(now)){
	                if(!visited[v]){
	                    visited[v]=true;
	                    q.add(v);
	                }
	            }
	            }
	        }
	        res = ll.get(ll.size()-1).count;
	    
	    }
	}

}
