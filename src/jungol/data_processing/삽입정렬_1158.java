package jungol.data_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 삽입정렬_1158 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
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
					//get, remove, add
					//순서를 자꾸 바꿔야하는데 array로 하면 복잡해짐. list로 바꿈
					int temp = list.get(start);
					list.remove(start);
					list.add(j, temp);//(index, element): index의 위치에 element를 넣어라
					break;
				}
			}
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j)+" ");
			}System.out.println();
		}
	}
}
