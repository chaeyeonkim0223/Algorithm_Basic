package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿠키의_신체_측정 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 머리: 심장바로위 1칸
		 * 왼쪽팔: 심장바로왼쪽
		 * 오른쪽팔: 심장바로오른쪽
		 * 허리: 심장바로아래
		 * 왼쪽다리: 허리왼쪽아래
		 * 오른쪽다리: 허리 오른쪽아래
		 * 허리,팔,다리의길이 1이상 너비1
		 * 구할것: 심장의위치, 팔,허리 길이,다리,(왼,오)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char cookie[][] = new char[n+2][n+2];
		
		for (int i = 1; i <= n; i++) {
			String s = br.readLine(); 
			for (int j = 1; j <= n; j++) {
				cookie[i][j] = s.charAt(j-1);
			}
		}
		int hr=0,hc=0;
		Loop: for (int i = 1; i < n; i++) {
			 for (int j = 1; j < n; j++) {
				//머리
				if(cookie[i][j] =='*') {
					//심장의위치
					hr=i+1;
					hc=j;
					System.out.println(hr+" "+hc+" ");
				
				//왼쪽 팔
				int cnt=0;
				while(cookie[hr][hc-1]=='*') {
					hc--;
					cnt++;
				}
				System.out.print(cnt+" ");
				//오른쪽 팔
				hr=i+1;
				hc=j;
				cnt=0;
				while(cookie[hr][hc+1]=='*') {
					hc++;
					cnt++;
				}
				System.out.print(cnt+" ");
				//허리
				hr=i+1;
				hc=j;
				cnt=0;
				while(cookie[hr+1][hc]=='*') {
					hr++;
					cnt++;
				}
				System.out.print(cnt+" ");
				//왼쪽다리
				cnt=0;
				int lr = hr;
				int lc = hc -1;
				int rr = hr;
				int rc = hc +1;
				while(cookie[lr+1][lc]=='*') {
					lr++;
					cnt++;
				}
				System.out.print(cnt+" ");
				//오른쪽다리
				cnt=0;
				while(cookie[rr+1][rc]=='*') {
					rr++;
					cnt++;
				}
				System.out.print(cnt);
				break Loop;
				}
			}
		}
	}

}
