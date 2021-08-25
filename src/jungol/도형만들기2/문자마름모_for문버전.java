package jungol.도형만들기2;

import java.util.Scanner;

public class 문자마름모_for문버전 {
	final static int MAX_N = 100 + 5;
	static int N,r,c,val;
//	static int[][] map = new int [MAX_N*2][MAX_N*2];
	static int[][] map;
	static int[] dr = {0,1,1,-1,-1};
	static int[] dc = {0,-1,1,1,-1};
	static void printMap() {
	    int left = N, right = N;
	    for (int i = 1; i <= 2 * N - 1; ++i) {
	        // 알파벳 앞에 공백 처리
	        for (int j = 1; j < left; ++j) {
	            System.out.print("  ");
	        }
	        for (int j = left; j <= right; ++j) {
	           System.out.print((char)(map[i][j])+" ");
	        }
	        if (i < N) {
	        	left--; right++;
	        }
	        else {
	        	left++; right--;
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int [N*2][N*2];
	   
		int sideSize = N;
	    int val = 65;
	    for (int i = 1; i <= N; ++i) {
	        r = i; c = N;
	        for (int j = 1; j <= 4; ++j) {
	            for (int k = 1; k < sideSize; ++k) {
	                map[r][c] = val++;
	                if (val > 90) val = 65;
	                r = r + dr[j];
	                c = c + dc[j];
	            }
	        }
	        sideSize--;
	    }
	    map[N][N] = val;
//	    for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				   System.out.print((char)(map[i][j])+" ");
//			}System.out.println();
//		}
	    printMap();
	}

}
