package Level3.숫자게임;

/*

https://school.programmers.co.kr/learn/courses/30/lessons/12987

*/
import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int a =0;
        int b =0;
        int n = A.length;
        int answer = 0;
        while(b<n){
            if(A[a] < B[b]){
                answer++;
                a++;

            }
            b++;
        }
        
        return answer;
    }
}