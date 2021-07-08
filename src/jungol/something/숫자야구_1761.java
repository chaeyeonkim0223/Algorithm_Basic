package jungol.something;

import java.util.Scanner;

public class 숫자야구_1761 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int filter[][] = new int[N][3];// 조건수,ST,B
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				filter[i][j] = sc.nextInt();
			}
		} // end input
		// 111~999까지 돌려서 조건에 맞는거만 남기기
		int total = 0;
		for (int i = 111; i <= 999; i++) {
			//0포함 & 서로다른숫자인경우 조건추가
			if(String.valueOf(i).contains("0")) continue;
			int first = (i/100);
			int second = (i%100)/10;
			int third = (i%10);
			if(first != second && second != third && first != third) {
			boolean[] checkFilter = new boolean[N];
			for (int f = 0; f < N; f++) {
				int ST = 0, B = 0;
				boolean isContain[] = new boolean[3];
				boolean isSameLocation[] = new boolean[3];
				// 값이 있는지 123 , 111
				String checkNum = String.valueOf(filter[f][0]);
				if (checkNum.contains(String.valueOf(first))) isContain[0] = true;
				if (checkNum.contains(String.valueOf(second))) isContain[1] = true;
				if (checkNum.contains(String.valueOf(third))) isContain[2] = true;
				// 해당값이 같은위치에 있는지
				if (checkNum.charAt(0) - '0' == first) isSameLocation[0] = true;
				if (checkNum.charAt(1) - '0' == second) isSameLocation[1] = true;
				if (checkNum.charAt(2) - '0' == third) isSameLocation[2] = true;
				//***값이 있고 해당값이 같은 위치라면 ST, 값이 있고 같은 위치가 아니라면 B
				for (int k = 0; k < 3; k++) {
					if (isContain[k] && isSameLocation[k]) ST++;
					if (isContain[k] && !isSameLocation[k]) B++;
				}
				if (ST != filter[f][1] || B != filter[f][2]) break;
				else checkFilter[f]= true;
			} // end filter
			boolean check = true;
			for (int j = 0; j < checkFilter.length; j++) {
				if(!checkFilter[j]) {
					check = false;
					break;
				}
			}
			//N개의 필터를 모두 통과해 다 true면
			if(check) total++;
			}
		}
		System.out.println(total);

	}

}
