package Class4.C_1167;

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
    static List<Node>[] list;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new ArrayList[n+1];
        for(int i = 1; i <=n;i++){
            list[i] = new ArrayList<>();
        }
        int start, end, val;
        //인접 리스트 구성
        for(int i = 1; i<=n;i++){
            start = sc.nextInt();
            while(true){
                end = sc.nextInt();
                if(end==-1)
                    break;
                val = sc.nextInt();
                list[start].add(new Node(end,val));               
            }
        }
        Node temp = da(1);
        temp = da(temp.num);
        System.out.println(temp.val);
        sc.close();
    }
    public static Node da(int start){
        Node max = new Node(start,0);
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        boolean[] visited = new boolean[n+1];
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
           @Override
           public int compare(Node o1,Node o2){
               return o1.val -o2.val;
           }
        });
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int idx = node.num;
            int val = node.val;
            if(visited[idx]) continue;
            visited[idx] = true;
            arr[idx] = arr[idx] == -1 ? val : Math.min(arr[idx],val);
            max = max.val < arr[idx] ? new Node(idx,arr[idx]) : max;
            for(Node n : list[idx]){
                if(!visited[n.num]){
                    pq.offer(new Node(n.num,arr[idx]+n.val));
                }
            }
        }
        return max;
    }
}