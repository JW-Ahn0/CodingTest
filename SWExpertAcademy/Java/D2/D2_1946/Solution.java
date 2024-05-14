package SWExpertAcademy.Java.D2.D2_1946;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i =1 ; i<=T;i++) {
			StringBuilder sb  =new StringBuilder();
			int n = sc.nextInt();
			int now = 0;
			for(int j = 0 ; j < n ;j++) {
				String alpha = sc.next();
				int count = sc.nextInt();
				for(int k = 0 ; k <count;k++) {
					if(now==10) {
						sb.append("\n");
						now = 0;
					}
					sb.append(alpha);
					now++;
				}
			}
			System.out.println("#"+i);
			System.out.println(sb.toString());
		}
		sc.close();
	}
}
