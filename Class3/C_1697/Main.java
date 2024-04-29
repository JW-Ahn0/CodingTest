package C_1697;


import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        q.offer(new int[]{n,0});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            visited[temp[0]]= true;
            if(temp[0]==k){
                System.out.println(temp[1]);
                break;
            }
            if(temp[0]-1>=0 && visited[temp[0]-1]==false){
                q.offer(new int[]{temp[0]-1,temp[1]+1});
            }
            if(temp[0]+1<=100000 && visited[temp[0]+1]==false){
                q.offer(new int[]{temp[0]+1,temp[1]+1});
            }
            if(temp[0]*2<=100000 && visited[temp[0]*2]==false){
                q.offer(new int[]{temp[0]*2,temp[1]+1});
            }
        }        
        sc.close();
    }
}  