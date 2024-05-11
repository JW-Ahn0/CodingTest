package SWExpertAcademy.Java.D1.D1_2029;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a=0;
		int b=0;
		for(int i = 1 ; i <=T;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			int share = a/b;
			int mod = a%b;
			System.out.println("#"+i+" "+share+" " +mod);
			
		}
		sc.close();
	}
}
