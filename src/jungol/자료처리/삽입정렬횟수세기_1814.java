package jungol.자료처리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 삽입정렬횟수세기_1814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int sum=0;
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 1; i < list.size(); i++) {
			//1~끝까지 계속 수행 어차피 index=0일때는 아무변화도 안일어나니까 1부터 시작
			int start=i;
			//처음부터~현재까지 비교. 현재보다 큰 수를 만난다면 break
			for (int j = 0; j <= start; j++) {
				//자기보다 더 큰수가 있다면 바꿔주기, 없으면 안바꿈.
				if(list.get(start)<list.get(j)) {
					//start-j 가 이동횟수 
					int temp = list.get(start);
					list.remove(start);
					list.add(j, temp);//(index, element): index의 위치에 element를 넣어라
					sum += (start - j);
					break;
				}
			}
		}
		System.out.println(sum);
	}

}
