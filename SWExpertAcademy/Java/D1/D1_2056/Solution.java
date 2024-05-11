package SWExpertAcademy.Java.D1.D1_2056;
/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
 class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();
        String input = "";
        String output = "";
        String year ="";
        String month ="";
        String day = "";
        String cal = "";
        for(int i = 1 ;  i <=T;i++){
        	output = "";
            input = sc.next();
            year = input.substring(0,4);
            month = input.substring(4,6);
            day =input.substring(6,8);
            cal = year +"/"+month+"/"+day;
            cal = isValidFunc(month,day) ? cal : "-1";
            output += "#" + i + " "+cal;
            System.out.println(output);
        }
        
        
        
        sc.close();
	}
    private static boolean isValidFunc(String month,String day){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        
    	int m = Integer.valueOf(month);
        int d = Integer.valueOf(day);
        if(m<1 || 12 < m)
        	return false;
        int lastDay = map.get(m);
        if(d < 1 || lastDay < d)
        	return false;
        return true;
    }		
}