package Class4.C_2206;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int answer = - 1;
    static boolean[][][] visited;
    static int[][] arr;
    static int[][] dir = { {-1,0},{1,0},{0,-1},{0,1}};
    static int n ;
    static int m ;

    static class Node {
        int x;
        int y;
        int distance;
        //true -> 벽 부숨, false -> 안부숨
        boolean crash;

        public Node(int x, int y, int distance, boolean crash) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.crash = crash;
        }
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        arr = new int[n][m];
        // 0 -> 벽 안부순 상태로 진행, 1 - >벽 부순 상태로 진행
        visited = new boolean[n][m][2];
        for(int i = 0 ; i < n;i++){
            String str = sc.nextLine();
            for(int j = 0 ; j < m;j++){
                arr[i][j] = Integer.valueOf(str.charAt(j)-48);
            }
        }
        bfs(0,0,1);
        System.out.println(answer);
        sc.close();
    }
    public static void bfs(int x,int y,int d){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0,0,1,false));
        visited[0][0][0] = true;
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == n-1 && node.y ==m-1){
                answer = node.distance;
                return;
            }
            for(int i = 0 ; i< 4;i++){
                int x1 = node.x + dir[i][0];
                int y1 = node.y + dir[i][1];
                if(0<=x1 && x1 < n && 0<= y1 && y1 <m){
                    if(arr[x1][y1]==0) {
                        if(!node.crash && !visited[x1][y1][0]){
                            visited[x1][y1][0] = true;
                            q.offer(new Node(x1,y1,node.distance+1,node.crash));                           
                        }
                        else if(node.crash && !visited[x1][y1][1]){
                            visited[x1][y1][1] = true;
                            q.offer(new Node(x1,y1,node.distance+1,node.crash));
                        }
                    }
                    else if(arr[x1][y1]==1){
                        if(!node.crash && !visited[x1][y1][1]){
                            visited[x1][y1][1] = true;
                            q.offer(new Node(x1,y1,node.distance+1,true));
                        }
                    } 
                }
            }
        }
    }
}
