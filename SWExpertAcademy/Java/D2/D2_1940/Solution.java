package SWExpertAcademy.Java.D2.D2_1940;


import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i<=T;i++) {
			int n = sc.nextInt();
			int move = 0;
			int nowSpeed = 0;
			for(int j = 0 ; j <n ;j++) {
				int command = sc.nextInt();
				if(command==1 || command ==2) {
					int speed = sc.nextInt();
					nowSpeed += command==2? -speed : speed;
					nowSpeed = nowSpeed<0 ? 0 :nowSpeed;
				}	
				move+=nowSpeed;
			}
			System.out.println("#"+i +" " + move);
		}
		sc.close();
	}
}
