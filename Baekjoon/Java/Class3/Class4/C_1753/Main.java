package Class4.C_1753;

import java.util.*;
public class Main {
    static class Node{
        int num;
        int val;
        public Node(int num,int val){
            this.num = num;
            this.val = val;

        }
    }
    static int n ;
    static int t ;
    static int start;
    static List<Node>[] list;
    static int[] answer;
    static boolean[] visited; 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        start = sc.nextInt();
        list = new ArrayList[n+1];
        answer = new int[n+1];
        visited = new boolean[n+1];
        for(int i = 1 ; i<=n;i++){
            list[i] = new ArrayList<>();
        }
        //인접 리스트 구성
        int a,b,val;
        for(int i =0 ; i <t;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            val = sc.nextInt();
            list[a].add(new Node(b,val));
        }
        da(start);
        StringBuilder sb = new StringBuilder();
        for(int i =1 ;i<=n;i++){
            if(answer[i]==-1){
                sb.append("INF\n");
            }
            else{
                sb.append(answer[i]+"\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
    public static void da(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
            @Override
            public int compare(Node o1,Node o2){
                return o1.val - o2.val;
            }
        });
        Arrays.fill(answer,-1);
        Arrays.fill(visited,false);
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            Node temp = pq.poll();
            int idx = temp.num;
            int val = temp.val;
            if(visited[idx]) continue;
            visited[idx] = true;
            answer[idx] = answer[idx]==-1 ? val :Math.min(val,answer[idx]);
            for(Node n : list[idx]){
                if(!visited[n.num]) {
                    pq.offer(new Node(n.num,answer[idx]+n.val));
                }
            }
        }
        
    }
}