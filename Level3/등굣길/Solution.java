package Level3.등굣길;

/*

https://school.programmers.co.kr/learn/courses/30/lessons/42898

*/

class Solution {
    // dir : 아래쪽,오른쪽으로만 이동 가능
    public static int[][] dir = {{1,0},{0,1}};
    public int solution(int m, int n, int[][] puddles) {
        // 0,0에서 시작해서 m-1,n-1까지 가는 경우의 수 
        int[][] arr = new int[n][m];
        // 물웅덩이가 있는 곳은 -1로 표시
        for(int i = 0 ; i < puddles.length;i++){
            int x = puddles[i][1]-1;
            int y = puddles[i][0]-1;
            arr[x][y] = -1;
        }
        // 해당 배열이 의미하는 바는 , (0,0) 에서 해당 위치까지 도달하는 경로의 수
        // ex) arr[1][1] = 1이라면 (0,0) 에서 (1,1)까지 도달하는 경로의 수는 1개
        int[][] dp = new int[n][m];
        // 시작점은 1로 초기화
        dp[0][0] = 1;

        // 물웅덩이가 있는 곳은 0으로 초기화, 아니면 왼쪽 값으로 초기화
        for(int i = 1 ; i < n ;i++){
            if(arr[i][0]!=-1){
                dp[i][0] = dp[i-1][0] ;
            }
            
        }
        // 물웅덩이가 있는 곳은 0으로 초기화, 아니면 위쪽 값으로 초기화
        for(int i = 1 ; i < m;i++){
            if(arr[0][i]!=-1){
                dp[0][i] = dp[0][i-1] ;
            }
        }
        // 왼쪽값과 위쪽값을 더해서 현재값으로 초기화

        // 1 1
        // 1 0  인 경우 0 인 부분의 값은 2가 된다. 왼쪽에서 오는 경로가 1, 위에서 오는 경로가 1이기 때문에 둘을 더한 2가 됌.
        
        // 1 2
        // 1 0  인 경우 0 인 부분의 값은 3이 된다. 왼쪽에서 오는 경로가 1, 위에서 오는 경로가 2이기 때문에 둘을 더한 3이 됌.
        for(int i = 1;i<n;i++){
            for(int j = 1; j<m;j++){
                if(arr[i][j]!=-1){
                    //나머지 연산을 통해 값이 커지는 것을 방지, 이거 없으면 효용성 테스트 실패
                    dp[i][j] = (dp[i][j-1] + dp[i-1][j])% 1000000007;
                }
                
            }
        }
        int answer = dp[n-1][m-1];
        return answer;
    }
}