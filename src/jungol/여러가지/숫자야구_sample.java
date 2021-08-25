package jungol.여러가지;
//package jungol.something;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//
//   public static void main(String[] args) throws NumberFormatException, IOException {
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringTokenizer st = null;
//      
//      int N = Integer.parseInt(br.readLine());
//      int[][] check = new int[N][3];
//      int ans = 0;
//      for (int i = 0; i < N; i++) {
//         st = new StringTokenizer(br.readLine());
//         
//         check[i][0] = Integer.parseInt(st.nextToken());
//         check[i][1] = Integer.parseInt(st.nextToken());
//         check[i][2] = Integer.parseInt(st.nextToken());
//         
//      }
//      
//      for (int i = 123; i <= 999; i++) {
//         boolean[] isNum = new boolean[10];
//         boolean chk = true;
//         String str = Integer.toString(i);
//         if (str.charAt(1) == '0' || str.charAt(2) == '0') continue;
//         if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(0) == str.charAt(2)) continue;
//         //숫자개수만큼 boolean배열
//         isNum[Character.getNumericValue(str.charAt(0))] = true;
//         isNum[Character.getNumericValue(str.charAt(1))] = true;
//         isNum[Character.getNumericValue(str.charAt(2))] = true;
//         
//         for (int j = 0; j < N; j++) {
//            int strike = 0;
//            int ball = 0;
//            String str2 = Integer.toString(check[j][0]);
//            for (int k = 0; k < 3; k++) {
//            	//나온 숫자고, 같은인덱스에 있으면 strike.
//               if (isNum[Character.getNumericValue(str2.charAt(k))]) {
//                  if (str.charAt(k) == str2.charAt(k)) {
//                     strike++;
//                  } else {
//                     ball++;
//                  }
//               }
//            }
//            //strike수와 ball수가 같으면 
//            if (check[j][1] == strike && check[j][2] == ball) {
//               continue;
//            } else {
//               chk = false;
//            }
//         }
//         //total증가!
//         if (chk) {
//            ans++;
//         }
//      }
//      System.out.println(ans);
//
//   }
//
//}