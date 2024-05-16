package SWExpertAcademy.Java.D3.D3_1289;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			String str = sc.next();
			System.out.println("#"+i +" " + getAnswer(str));
		}
		sc.close();
	}
	private static int getAnswer(String str) {
		String temp = convert(str);
		return temp.charAt(0)=='0' ? temp.length()-1 : temp.length();
	}
	private static String convert(String str) {
		StringBuilder sb = new StringBuilder();
		char nowCh = str.charAt(0);
		sb.append(nowCh);
		for(int i = 1 ; i <str.length();i++) {
			if(nowCh !=str.charAt(i)){
				nowCh = str.charAt(i);
				sb.append(nowCh);
			}
		}
		return sb.toString();
	}
}
