package jungol.여러가지;

import java.util.Scanner;

public class 빙고_1031 {
	static int map[][];
	static int[] dr= {-1,0,1,1};
	static int[] dc= {1,1,1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int [5][5];
		int ans=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = sc.nextInt();
			} //
		}
		L : for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int num = sc.nextInt();
				change(num);
				int temp = bingoCheck();
				//total이 3개이상있다면 탈출
				if(temp==1) {
					ans = 5*i + (1+j);
					break L;
				}
			} 
		}
//		System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(map[i][j]+" ");
//			} System.out.println();
//		}
		System.out.println(ans);
		
	}
	static void change(int num) {
		for (int t = 0; t < 5; t++) {
			for (int k = 0; k < 5; k++) {
				if( map[t][k] == num) {
//					System.out.print(num+" ");
					map[t][k] =-1;
					return;
				}
			}
		}//end point
	}
	static int bingoCheck() {
		int total=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(map[i][j]==-1) {
					for (int d = 0; d < 4; d++) {
						int cnt=1;
						int nr=i,nc=j;
						for (int k = 0; k < 4; k++) {
						nr += dr[d];
						nc += dc[d];
							if(nr>=0 && nr<5 && nc>=0 && nc<5 && map[nr][nc]==-1) {
								cnt++;
							}
						}
						if(cnt==5) total++;
					}
					
				}
			} 
		}
		//total은 2중for문이 다 끝나고 나서 카운트 해주기.
		if(total>=3) return 1;
		else return 0;
	}

}
