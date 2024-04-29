package C_14940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tc = reader.readLine();
        String[] tcArr = tc.split(" ");
        int n  =  Integer.valueOf(tcArr[0]);
        int m =  Integer.valueOf(tcArr[1]);
        int[][] arr = new int[n][m];
        int[][] answer = new int[n][m];
        int x=0;
        int y=0;
       
        for(int i = 0 ; i <  n ; i++){
            String str = reader.readLine();
            String[] strArr = str.split(" ");
            for(int j = 0 ; j<m;j++){
                arr[i][j] = Integer.valueOf(strArr[j]);
                if(arr[i][j]==2){
                    x=i;
                    y=j;
                }
            }
        }
        move(arr,answer,x,y,n,m);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j<m;j++){
                sb.append(answer[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static void move(int[][] arr,int[][] answer,int x,int y,int n,int m){
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        q.offer(new int[]{x,y});
        answer[x][y] = 0;
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int a = temp[0];
            int b = temp[1];
           
            for(int i = 0 ; i <4;i++){
                int nx = a + dir[i][0];
                int ny = b + dir[i][1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1 && answer[nx][ny] == 0) {
                    q.offer(new int[]{nx, ny});
                    answer[nx][ny] = answer[a][b] + 1;
                }
            }
        }
        // 도달할 수 없는 부분은 -1로 처리
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (answer[i][j] == 0 && arr[i][j] == 1) {
                    answer[i][j] = -1;
                }
            }
        }
    }
}