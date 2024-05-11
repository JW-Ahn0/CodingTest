package SWExpertAcademy.Java.D1.D1_2068;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 10;
		int T = sc.nextInt();
		for(int i = 1 ; i <= T;i++) {
			int max = 0 ; 
			for(int j = 0 ; j < length;j++) {
				int input = sc.nextInt();
				max = max < input ? input : max;
			}
			System.out.println("#"+i+" " + max);
		}
		sc.close();
	}
}
