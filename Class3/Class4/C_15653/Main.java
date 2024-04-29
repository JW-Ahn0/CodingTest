package Class4.C_15653;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        
        int[] answer = new int[m];
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        back(arr,0,m,answer,visited);
        sc.close();
    }
    public static void back(int[] arr,int depth,int m,int[] answer,boolean[] visited){
        if(depth == m ){
            for(int i = 0 ; i < m;i++){
                System.out.print(answer[i]+" ");
            }
            System.out.println();
            return;
        }
        int before = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(!visited[i] && before!=arr[i]){
                before = arr[i];
                visited[i]=true;
                answer[depth] = arr[i];
                back(arr,depth+1,m,answer,visited);
                visited[i]=false;
            }
        }
    }
}