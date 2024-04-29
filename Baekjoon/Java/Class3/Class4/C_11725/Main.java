package Class4.C_11725;

import java.util.Scanner;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] arr = new Node[n+1];
        boolean[] visited = new boolean[n+1];
        Queue<Node> q = new LinkedList<>();
        for(int i = 1 ; i <=n;i++){
            arr[i] = new Node(i);
        }
        int a,b;
        for(int i = 1 ; i<n;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arr[a].getList().add(b);
            arr[b].getList().add(a);
        }
        List<Integer> temp = arr[1].getList();
        visited[1] = true;
        for(int i = 0 ;i< temp.size();i++){
            q.offer(arr[temp.get(i)]);
            arr[temp.get(i)].setParent(1);
            visited[temp.get(i)]= true;
        }
        while(!q.isEmpty()){
            Node node = q.poll();
            List<Integer> tempList = node.getList();
            for(int i = 0 ; i<tempList.size();i++){
                Node tempNode = arr[tempList.get(i)];
                if(!visited[tempNode.getVal()]){
                    visited[tempNode.getVal()]=true;
                    tempNode.setParent(node.getVal());
                    q.offer(tempNode);
                }
            }
        }
        for(int i = 2 ; i <=n;i++){
            System.out.println(arr[i].getParent());
        }
        sc.close();
    }
    static class Node {
        private int val;
        private int parent;
        private List<Integer> connectList;
        public Node(int val){
            this.val = val;
            this.connectList = new ArrayList<>();
        }
        public int getVal(){
            return this.val;
        }      
        public List<Integer> getList(){
            return this.connectList;
        }
        public void setParent(int parent){
            this.parent = parent;
        }
        public int getParent(){
            return this.parent;
        }        
    }
}