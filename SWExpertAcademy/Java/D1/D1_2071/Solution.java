package SWExpertAcademy.Java.D1.D1_2071;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		int l  =10;
		for(int i =1 ; i <= T;i++) {
			int sum = 0;
			for(int j = 0 ; j <l;j++ ) {
				int input = sc.nextInt();
				sum+=input;
			}
			System.out.println("#"+i+" "+Math.round(sum/10.0));
		}
		sc.close();
	}
}