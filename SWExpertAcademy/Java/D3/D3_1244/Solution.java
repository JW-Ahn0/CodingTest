package SWExpertAcademy.Java.D3.D3_1244;

import java.util.*;

public class Solution {
	
	static int max = 0;
	static Map<String,Boolean> checkMap = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ;i<=T;i++) {
			String str = sc.next();
			int count = sc.nextInt();
			max = 0;
			checkMap = new HashMap<>();
			System.out.println("#" + i+ " " + change(str,count,0));
		}
		sc.close();
	}
	private static int change(String str,int count,int n) {
		if(n==count) {
			max = max < Integer.valueOf(str) ? Integer.valueOf(str):max;
			return max;
		}
		char[] charArr = str.toCharArray();
		
		for(int i = 0 ; i < charArr.length;i++) {
			for(int j = i+1; j <charArr.length ;j++) {
				char temp = charArr[i];
				charArr[i] = charArr[j];
				charArr[j] = temp;
				String s = String.copyValueOf(charArr);
				if(!checkMap.getOrDefault(s+"-"+n+1,false)) {
					change(String.copyValueOf(charArr),count,n+1);
					checkMap.put(s+"-"+n+1, true);				}
				temp = charArr[i];
				charArr[i] = charArr[j];
				charArr[j] = temp;
			}
		}
		return max;
	}
}