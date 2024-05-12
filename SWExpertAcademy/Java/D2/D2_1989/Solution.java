package SWExpertAcademy.Java.D2.D2_1989;


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1 ;i<=T;i++) {
			String str = sc.next();
			int result = isTrue(str) ? 1 : 0;
			System.out.println("#"+i+ " " + result);
		}
		sc.close();
	}
	private static boolean isTrue(String str) {
		int start = 0 ; 
		int end = str.length()-1;
		while(start < end) {
			if(str.charAt(start)!= str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
