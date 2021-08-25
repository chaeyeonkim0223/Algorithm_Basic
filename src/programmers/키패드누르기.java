package programmers;

public class 키패드누르기 {
/*
 * 1,4,7이면 L
 * 3,6,9이면 R
 * 	2,5,8,0이면 거리를계산
 *   거리가 같다면 오른손,왼손잡이 판단해서
 */
	static int[]numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
	static String hand="rignt";
	public static void main(String[] args) {
		String result[] = new String [numbers.length];
		result = solution(numbers, hand);
	}
	private static String[] solution(int[] numbers, String hand) {
		
		return null;
	}

}
