package SWExpertAcademy.Java.D3.D3_1244;

import java.util.*;

public class Other {
	private static int result = 0 ; 
	private static HashMap<String,Boolean> map = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i <=T;i++) {
			int num = sc.nextInt();
			int max = sc.nextInt();
			result = 0 ;
			map = new HashMap<>();
			switchLocation(num,0,max);
			System.out.println("#"+ i+" " + result);
		}
		sc.close();
	}
	private static void switchLocation(int num, int cnt,int max) {
		if(cnt == max) {
			result = Math.max(num, result);
			return ;		}
		String str = String.valueOf(num);
		for(int i = 0 ; i < str.length()-1;i++) {
			for(int j = i+1; j<str.length();j++) {
				String switched = inSwitch(str,i,j);
				if(!map.containsKey(switched+"-"+ cnt)) {
					map.put(switched+"-"+ cnt,true);
					switchLocation(Integer.valueOf(switched),cnt+1,max);
				}
			}
		}
	}
	private static String inSwitch(String str ,int l1,int l2) {
		StringBuilder sb= new StringBuilder();
		for(int i = 0 ; i < l1;i++) {
			sb.append(str.charAt(i));
		}
		sb.append(str.charAt(l2));
		for(int i = l1+1; i < l2;i++) {
			sb.append(str.charAt(i));
		}
		sb.append(str.charAt(l1));
		for(int i = l2+1;i<str.length();i++) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
