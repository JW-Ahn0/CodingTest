package Level3.숫자게임;

/*

https://school.programmers.co.kr/learn/courses/30/lessons/12987

*/
import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        // A,B를 오름차순으로 정렬
        // 최대 승점의 개수를 구하는 것이기 때문에 A,B의 순서를 마음대로 변경해도 상관 X
        Arrays.sort(A);
        Arrays.sort(B);
        // Two Pointer 알고리즘을 사용
        int a =0;
        int b =0;
        int n = A.length;
        int answer = 0;
        //b는 항상 움직이기 때문에 b가 n보다 작을때까지 반복
        while(b<n){
            if(A[a] < B[b]){
                answer++;
                a++;

            }
            b++;
        }
        //위는 아래에 있는 논리를 최적화한 형태
        /*
        while(b<n){
            //답이 카운트 되는 경우, a,b둘 다 움직임 
            if(A[a] < B[b]){
                answer++;
                a++;
                b++;
            }
            //같을 때는 b만 움직임(같은 경우는 점수가 안나오기 떄문)
            //A = 1 2 3 4 5
            //B = 1 2 3 3 3
            //위와 같은 케이스의 답은 2인데, 이걸 처리 위해 같은 경우 b만 움직임
            else if(A[a]==B[b]){
                b++;
            }
            //A가 더 클 때는 b만 움직임
            else{
                b++;
            }
        }
         */
        return answer;
    }
}