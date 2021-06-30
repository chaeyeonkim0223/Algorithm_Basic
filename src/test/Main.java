//package test;
//
//import java.util.Arrays;
//
//public class Main {
//
//	public static void main(String[] args) {
//		String[] inputs = {"/a/a_v2.x", "/b/a.x","/c/t.z", "/d/a/t.x",
//				"/e/z/t_v1.z","/k/k/k/a_v9.x"};
//		//정제1 디렉토리제거
//		for (int i = 0; i < inputs.length; i++) {
//			String temp = inputs[i];
//			String newString = "";
//			for (int j = temp.length()-1; j>=0  ; j--) {
//				if(temp.charAt(j)=='/') {
//					newString = temp.substring(j+1,temp.length());
//					break;
//				}
//			}
//			inputs[i] = newString;
//		}
//		System.out.println(Arrays.toString(inputs));
//		//정제2 버전제거
//		for (int i = 0; i < inputs.length; i++) {
//			String temp = inputs[i];
//			int idx=0, idx2=0;
//			String first="",second="";
//			for (int j = temp.length()-1; j>=0  ; j--) {
//				if(temp.charAt(j)=='.') idx=j;
//				if(temp.charAt(j)=='_') idx2=j;
//			}
//			if(idx2!=0) {
//				first=temp.substring(0,idx2);
//				second=temp.substring(idx,temp.length());
//				inputs[i] =first.concat(second);
//			}
//		}
//		Arrays.sort(inputs);
//		System.out.println(Arrays.toString(inputs));
//		
//		//출력배열넣기
//		int count=0;
//		for (int i = 0; i < inputs.length; i++) {
//			int Bigle = 3*8 = 24 + 3살
//		}
//	}
//
//}
