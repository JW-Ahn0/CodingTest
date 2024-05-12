package SWExpertAcademy.Java.D2.D2_1928;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int i = 1 ; i <=T;i++) {
			String str = sc.next();
			StringBuilder sb = new StringBuilder();
			for(int j = 0 ; j < str.length();j+=4) {
				String temp = str.substring(j,j+4);
				sb.append(splitByFour(temp));
			}
			System.out.println("#"+i+" "+sb.toString());
		}
		sc.close();

	}
	private static String splitByFour(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < str.length();i++) {
			char ch = str.charAt(i);
			int num = charBase64Decode(ch);
			sb.append(toBinaryString(num));
		}
		String temp = sb.toString();
		return Base64Decoding(temp);
	}
	private static String Base64Decoding(String binaryString) {
		int char1 = Integer.valueOf(binaryString.substring(0,8), 2);
		int char2 = Integer.valueOf(binaryString.substring(8,16), 2);
		int char3 = Integer.valueOf(binaryString.substring(16,24), 2);
		return (""+(char)char1+(char)char2+(char)char3);
	}
	private static int charBase64Decode(char ch) {
		if('A' <= ch && ch <= 'Z') {
			return ch-'A';
		}
		if('a' <= ch && ch <= 'z') {
			return ch-'a'+26;
		}
		if('0'<=ch && ch <='9') {
			return ch-'0' +52;
		}
		if(ch =='+') return 62;
		if(ch =='/') return 63;
		return -1;
	}
	private static String toBinaryString(int num) {
		String str = Integer.toBinaryString(num);
		int count = 6 - str.length();
		while(count>0) {
			str = "0"+str;
			count--;
		}
		return str;
	}
}