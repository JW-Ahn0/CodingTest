package Class4.C_11404;

import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
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
    static int[] answer;
    static List<Node>[] list;
    static boolean[] visited; 
    static StringBuilder sb = new StringBuilder();
    static int n;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        answer = new int[n+1];
        list = new ArrayList[n+1];
        visited = new boolean[n+1];
        //입력 O(n) ,max = 100;
        for(int i = 1 ; i < n+1;i++){
            list[i] = new ArrayList<>();
        }
        int a,b,val;
        //인접리스트 구성 O(m) , max= 100,000;
        for(int i = 0 ; i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            val = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b,val));
        }
        
        //
        for(int i =1 ; i<= n;i++){
            //O(n^2) = 100*100 
            Arrays.fill(answer,-1);
            //O(n^2) = 100*100 
            visited = new boolean[n+1];
            da(i);
        }
        System.out.println(sb.toString());
        br.close();
    }
    // 간선 = E, 노드 수 = N, O(E log N) 
    public static void da(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
           @Override
           public int compare(Node o1,Node o2){
               return o1.val - o2.val;
           }
        });
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int idx = node.num;
            int val = node.val;
            if (visited[idx]) continue; 
            answer[idx] = answer[idx]==-1 ? val : Math.min(answer[idx],val);
            visited[idx] = true;
            List<Node> tempList = list[idx];
            for(Node temp : tempList){
                if(!visited[temp.num]){
                    pq.offer(new Node(temp.num,val+temp.val));
                }
            }
        }
        
        for(int i = 1 ; i <= n;i++){
            if(answer[i]==-1){
                sb.append("0 ");
            }
            else{
                sb.append(answer[i]+" ");
            }
            
        }
        sb.append("\n");
    }
}