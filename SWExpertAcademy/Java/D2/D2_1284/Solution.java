package SWExpertAcademy.Java.D2.D2_1284;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i<=T;i++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int A = P*W;
			int B = W < R ? Q : Q + (W-R) * S;
			int chose = A < B ? A : B; 
			System.out.println("#" + i +" " + chose);
		}
		sc.close();
	}
}