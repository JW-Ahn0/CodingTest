package SWExpertAcademy.Java.D1.D1_2025;

import java.util.Scanner;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
        //1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = n ; i>=1;i--){
        	sum+=i; 
        }
        System.out.println(sum);
        //2
        /*
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isEven = n%2==0? true : false;
        
        int sum = (1+n) * n/2;
        if(!isEven)
            sum += (n+1)/2;
        System.out.println(sum);
        */
        sc.close();
	}
}