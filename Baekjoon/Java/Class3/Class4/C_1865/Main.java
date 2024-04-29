package Class4.C_1865;

import java.util.*;

public class Main {
    static class Edge{
        int start;
        int end;
        int val;
        public Edge(int start,int end,int val){
            this.start = start;
            this.end = end;
            this.val = val;
        }
    }
    static int n,m,w;
    static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for(int k = 0 ; k < t ;k++){
            n = sc.nextInt();
            m = sc.nextInt();
            w = sc.nextInt();
            if(bel()){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
    public static boolean bel(){
        List<Edge> list = new ArrayList<>();
        int start,end,val;
        for(int i = 0 ; i < m;i++){
            start = sc.nextInt();
            end = sc.nextInt();
            val = sc.nextInt();
            list.add(new Edge(start,end,val));
            list.add(new Edge(end,start,val));
        }
        for(int i = 0 ; i < w ; i++){
            start = sc.nextInt();
            end = sc.nextInt();
            val = -sc.nextInt();
            list.add(new Edge(start,end,val));
        }
        //모든 지점들에 대해 체크
        for(int i = 1; i <= n;i++){
            int[] arr = new int[n+1];
            int INF = Integer.MAX_VALUE;
            Arrays.fill(arr,INF);
            arr[i] = 0;
            boolean check; 
            for(int j = 1; j<=n;j++){
                check = false;
                for(Edge edge : list){
                    int s = edge.start;
                    int e = edge.end;
                    int v = edge.val;
                    if(arr[s]!=INF && arr[e] > arr[s] + v ){
                        arr[e] = arr[s] +v;
                        check = true;
                        if(j == n){
                            return true;
                        }
                    }
                }
                if(!check){
                    break;
                }
            }
        }
        return false;
    }
}
