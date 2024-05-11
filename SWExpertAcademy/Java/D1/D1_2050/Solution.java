package SWExpertAcademy.Java.D1.D1_2050;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0 ; i < str.length();i++) {
			int c = (int)str.charAt(i);
			if(c>=97) c -=96;
			else c -=64;
			System.out.print(c+" ");
		}
		sc.close();
	}
}
