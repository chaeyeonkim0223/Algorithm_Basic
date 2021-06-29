package jungol.math2;

import java.util.Scanner;

public class 이진수 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int res = 0;
        int two = 1;
        for (int i = binary.length()-1; i >=0 ; i--) {
            res += (binary.charAt(i)-'0') * two;
            two *= 2;
        }
        System.out.println(res);
    }
 
}