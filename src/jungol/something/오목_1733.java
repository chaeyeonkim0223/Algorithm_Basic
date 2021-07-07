package jungol.something;

import java.util.Scanner;

public class 오목_1733 {
    static int[] dr = {0,1,1,-1};
    static int[] dc = {1,0,1,1};
    static int map[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int [19+2][19+2];
        for (int i = 1; i <=19; i++) {
            for (int j = 1; j <=19; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int resR=0,resC=0,resColor=0;
        for (int i = 1; i <=19; i++) {
            for (int j = 1; j <=19; j++) {
                if(map[i][j]!=0) {
                    for (int d = 0; d < 4; d++) {
                        int nr = i;
                        int nc = j;
                        int cnt=1;
                        if(map[nr-dr[d]][nc-dc[d]]!=map[nr][nc]) {
                        for (int k = 0; k < 4; k++) {
                            nr = nr + dr[d];
                            nc = nc + dc[d];
                            if(nr>0 && nr<=19 && nc>0 && nc<=19 && map[nr][nc]==map[i][j]) {
                                cnt++;
                            }
                            else break;
                        }
                        }
                        //6개인경우 체크하기
                        if(cnt==5) {
                            nr = nr + dr[d];
                            nc = nc + dc[d];
                            if(nr>0 && nr<=19 && nc>0 && nc<=19 && map[nr][nc]==map[i][j]) {
                            }else {
                                resR=i;resC=j;resColor=map[i][j];
                            }
                        }
 
                    }
                }
            }
        }
        if(resColor!=0) {
            System.out.println(resColor);
            System.out.println(resR +" "+ resC);
        }else {
            System.out.println(resColor);
        }
    }
 
}