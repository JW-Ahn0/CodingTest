package Class4.C_15654;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[m];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        back(arr,answer,visited,0,m);
        sc.close();
    }
    public static void back(int[] arr, int[] answer,boolean[] visited, int depth, int m){
        if(depth == m){
            for(int i = 0 ; i < answer.length;i++){
                System.out.print(answer[i]+" ");
            }
            System.out.println();
            return; 
        }
        for(int i = 0 ; i < arr.length;i++){
            if(!visited[i]){
                visited[i]=true;
                answer[depth] = arr[i];
                back(arr,answer,visited,depth+1,m);
                visited[i]= false;                     
            }
        }
    }
}