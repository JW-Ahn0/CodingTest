package SWExpertAcademy.Java.D2.D2_1948;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dayArr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int[] daySumArr = new int[13];
		for(int i = 1 ; i < dayArr.length;i++) {
			daySumArr[i] = daySumArr[i-1]+dayArr[i];
		}
		for(int i = 1; i <=T;i++) {
			int firstMonth = sc.nextInt();
			int firstDay = sc.nextInt();
			int secondMonth = sc.nextInt();
			int secondDay = sc.nextInt();
			int answer = (daySumArr[secondMonth-1] + secondDay) - (daySumArr[firstMonth-1]+firstDay)+1;
			System.out.println("#"+i +" " + answer );
		}
		sc.close();
		
	}
}