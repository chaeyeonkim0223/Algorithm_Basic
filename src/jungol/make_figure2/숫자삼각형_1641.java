package jungol.make_figure2;
import java.util.Scanner;
 
public class 숫자삼각형_1641 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int idx=1;
        if(n>100 || n%2==0 || m<1 || m>3) {
            System.out.println("INPUT ERROR!");
        }else {
            int[][] nums = new int [n][n]; 
            switch(m) {
            case 1:
                for (int i = 0; i < n; i++) {
                    if(i%2==0) {
                        for (int j = 0; j < i+1; j++) {
                            nums[i][j] = idx++;
                        }
                    }else {
                        for (int j = i; j >=0; j--) {
                            nums[i][j] = idx++;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <n; j++) {
                        if(nums[i][j] != 0) {
                            System.out.print(nums[i][j]+" ");
                        }
                    }System.out.println();
                }
                break;
            case 2: 
            	for(int i=n; i>0; i--) {
            		//공백
            		for(int j=(n-i)*2; j>0; j--) {
            			System.out.print(" ");
            		}
            		//숫자
            		for(int j=i*2-1; j>0; j--) {
            			System.out.print(n-i+" ");
            		}System.out.println();
            	}
            	break;
            case 3:
            	idx=n/2+1;
            	for (int i = n / 2; i >= 0; i--) {
					for (int j = i; j < n - i; j++) {
						nums[j][i] = idx;
					}idx--;
				}
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= n / 2; j++) {
						if(nums[i][j]!=0)System.out.print(nums[i][j]+" ");
					}
					System.out.println();
				}
				break;
            }
        }
    }
 
}