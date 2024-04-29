package Class4.C_13549;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[100001];
        Arrays.fill(arr,Integer.MAX_VALUE);
        bfs(arr,n,k);
        System.out.println(arr[k]);
        sc.close();
    }
    public static void bfs(int[] arr, int n, int k){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(n,0));
        boolean[] visited = new boolean[100001];
        while(!q.isEmpty()){
            Node node = q.poll();
            arr[node.idx] =Math.min(arr[node.idx],node.val) ;
            visited[node.idx] = true;
            if(node.idx*2 <= 100000 && !visited[node.idx*2]){
                q.offer(new Node(node.idx*2,node.val));
            }
            if(node.idx+1 <=100000 && !visited[node.idx+1]){
                q.offer(new Node(node.idx+1,node.val+1));
            }
            if(node.idx-1>=0 && !visited[node.idx-1]){
                q.offer(new Node(node.idx-1,node.val+1));
            }
        }
    }
    static class Node{
        int idx;
        int val;
        public Node(int idx,int val){
            this.idx = idx;
            this.val = val;
        }
    }
}