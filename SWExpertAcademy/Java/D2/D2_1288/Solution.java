package SWExpertAcademy.Java.D2.D2_1288;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ; i<=T;i++) {
			int input = sc.nextInt();
			System.out.println("#"+i+" " + getAnswer(input));
		}
		sc.close();
	}
	private static int getAnswer(int num) {
		int answer = num;
		int mul = 1;
		Set<Integer> set = new HashSet<>();
		while(set.size()!=10) {
			answer = num * mul;
			int temp = num * mul ;
			while(temp!=0) {
				set.add(temp%10);
				temp /= 10;
			}
			mul++;
		}
		return answer;
		
	}
}
