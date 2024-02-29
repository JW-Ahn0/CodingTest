package Class4.C_1967;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.StringTokenizer;
public class Main {
    static class Node{
        int node;
        int val;
        public Node(int node,int val){
            this.node = node;
            this.val = val;
        }
    }
    static int answer;
    static List<Node>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        list = new ArrayList[t+1];
        for(int i = 1 ; i <=t;i++){
            list[i] = new ArrayList<>();
        }
        int n1,n2,val;
        for(int i = 0 ; i < t-1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            val = Integer.parseInt(st.nextToken());
            list[n1].add(new Node(n2,val));
            list[n2].add(new Node(n1,val));
        }
        visited = new boolean[t+1];
        for(int i = 1 ; i <=t;i++){
            Arrays.fill(visited,false);
            visited[i] = true ;
            dfs(i,0);
        }
        System.out.println(answer);
        br.close();
    }

    public static void dfs(int now,int dis){
        for(Node node : list[now]){
            if(!visited[node.node]){
                visited[node.node] =true; 
                dfs(node.node,dis+node.val);
            }
        }
        answer = Math.max(answer,dis);
    }

}