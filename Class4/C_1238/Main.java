package Class4.C_1238;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    static class Node{
        int num;
        int val;
        public Node(int num,int val){
            this.num = num;
            this.val = val;
        }
    }
    static List<Node>[] list;
    static boolean[] visited;
    static int[][] arr;
    static int n;
    static int m;
    static int x;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        list = new ArrayList[n+1];
        visited = new boolean[n+1];
        // 0 -> a에서 x로 가는 최단거리, 1 -> x에서 a로 가는 최단거리
        arr = new int[n+1][2];
        for(int i = 1 ; i <= n;i++){
            list[i] = new ArrayList<>();
        }
        //인접리스트 구성
        for(int i = 0 ; i< m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int val = sc.nextInt();
            list[a].add(new Node(b,val));
        }
        for(int i = 1; i <=n;i++){
            da(i);
        }
        int max = 0;
        for(int i = 1; i <=n;i++){
            max = Math.max(max,arr[i][0]+arr[i][1]);
        }
        System.out.println(max);
        sc.close();
        
    }
    public static void da(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Node o1,Node o2){
                return o1.val - o2.val;
            }
        });
        int[] temp = new int[n+1];
        
        Arrays.fill(temp,-1);
        Arrays.fill(visited,false);
        pq.offer(new Node(start,0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int idx = node.num;
            int val = node.val;
            if(visited[idx]) continue;
            visited[idx] = true;
            temp[idx] = temp[idx]==-1 ? val : Math.min(temp[idx],val);
            for(Node n : list[idx]){
                if(!visited[n.num]){
                    pq.offer(new Node(n.num,temp[idx]+n.val));
                }
            }
        }
        if(start==x){
            for(int i = 1 ; i <= n;i++){
                arr[i][1] = temp[i];
            }
        }
        else{
            arr[start][0] = temp[x];
        }
        
    }
}