package SWExpertAcademy.Java.D2.D2_1945;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i <= T;i++) {
			int input = sc.nextInt();
			System.out.println("#"+i+" " + getStr(input));
		}
		
		sc.close();
	}
	private static String getStr(int num) {
		int[] temp = getMod(num,2);
		int two = temp[1];
		temp = getMod(temp[0],3);
		int three = temp[1];
		temp = getMod(temp[0],5);
		int five = temp[1];
		temp = getMod(temp[0],7);
		int seven = temp[1];
		temp = getMod(temp[0],11);
		int eleven = temp[1];
		String answer = "" + two + " " + three +" " + five +" " +seven +" "+ eleven; 
		return answer;
	}
	private static int[] getMod(int num,int modNumber) {
		int count = 0 ;
		while(num%modNumber==0) {
			count++;
			num /= modNumber;
		}
		int[] answer = {num,count};
		return answer;
	}
}