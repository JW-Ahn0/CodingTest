package SWExpertAcademy.Java.D2.D2_1976;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i<=T;i++) {
			int T1 = sc.nextInt();
			int M1 = sc.nextInt();
			int T2 = sc.nextInt();
			int M2 = sc.nextInt();
			int carry = M1+M2>60 ? 1 : 0;
			int sumM= carry==1 ? M1+M2-60 : M1+M2;
			int sumT = T1+T2+carry > 12 ? T1+T2+carry-12 : T1+T2+carry;
			
			System.out.println("#" + i +" "+ sumT +" " + sumM);
		}
		sc.close();
	}
}
