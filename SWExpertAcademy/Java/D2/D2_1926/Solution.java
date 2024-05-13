package SWExpertAcademy.Java.D2.D2_1926;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 1; i<=n;i++) {
			System.out.print(convert(i) +" ");
		}
		sc.close();
	}
	private static String convert(int num) {
		String str = "";
		int temp = num;
		boolean isClap = false;
		while(temp!=0) {
			if(is369(temp%10)){
				isClap = true;
				break;
			}
			temp/=10;			
		}
		temp = num;
		while(temp!=0) {
			if(isClap) {
				if(is369(temp%10)){
					str =  "-"+ str ;
				}
			}
			else {
				str =temp%10 + str;
			}
			temp/=10;
		}
		return str;
	}
	private static boolean is369(int num) {
		if(num==3 || num ==6 || num==9) {
			return true;
		}
		return false;
	}
}
