package jungol.make_figure2;

import java.util.Scanner;
/**
 * 
 * @author tomyb
 *
 */
public class 문자마름모_1331 {
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		char ch = 'A';
		char[][] arr = new char[n * 2 - 1][n * 2 - 1];
		// 우상 에서 시작하기위해 -1 +1 해줌.
		int r = -1, c = (n * 2 - 1) / 2 + 1;
		for (int i = 0; i < n * 2 - 1; i++) {
			for (int j = 0; j < n * 2 - 1; j++) {
				arr[i][j] = 'a';
			}
		}

		for (int i = 0; i < n ; i++) {
			// 좌하
			while (isA(r + 1, c - 1, i) && arr[r + 1][c - 1] == 'a') {
				if (ch > 'Z')
					ch = 'A';
				arr[++r][--c] = ch++;
			}
			// 우하
			while (isA(r + 1, c + 1, i) && arr[r + 1][c + 1] == 'a') {
				if (ch > 'Z')
					ch = 'A';
				arr[++r][++c] = ch++;
			}
			// 우상
			while (isA(r - 1, c + 1, i) && arr[r - 1][c + 1] == 'a') {
				if (ch > 'Z')
					ch = 'A';
				arr[--r][++c] = ch++;
			}
			// 좌상
			while (isA(r - 1, c - 1, i) && arr[r - 1][c - 1] == 'a') {
				if (ch > 'Z')
					ch = 'A';
				arr[--r][--c] = ch++;
			}
			// 한칸내리기
			--r;
		}

		for (int i = 0; i < n * 2 - 1; i++) {
			for (int j = 0; j < n * 2 - 1; j++) {
				if(arr[i][j]=='a') {
					System.out.print("  ");
				}else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	//r:행 c:열 range:i값을 받아서 마름모 바깥부터 채움
	static boolean isA(int r, int c, int range) {
		if (r < range || r >= n * 2 - 1 - range || c < range || c >= n * 2 - 1 - range)return false;
		else return true;
	}

}
