package C_7576;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        int[][] arr = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        boolean[][] check = new boolean[n][m];;
        for(int i =0; i<n;i++){
            for(int j = 0 ; j < m;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    check[i][j] = true;
                    q.offer(new int[]{i,j});
                }
            }
        }
        //입력
        int[][] dir = { {-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];

            for(int i = 0 ; i < 4; i++){
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                
                if(0<=nx && nx < n && 0<= ny && ny < m && check[nx][ny] ==false && arr[nx][ny]==0){
                    arr[nx][ny]=arr[x][y]+1;
                    check[nx][ny] = true;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        
        //
    
        //다 하고나서 검사했는데 0 이 1하나라도 있으면 -1 출력
        boolean isFail = false;
        for(int i =0; i<n;i++){
            for(int j = 0 ; j < m;j++){
                if(arr[i][j]==0){
                    isFail = true;
                }
                answer = Math.max(answer,arr[i][j]);
            }

        }
        if(isFail){
            System.out.println("-1");
        }
        else{
            System.out.println(answer-1);
        }
        sc.close();
    }
}