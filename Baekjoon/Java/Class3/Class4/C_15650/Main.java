package Class4.C_15650;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        dfs(0,m,arr,n,1);
        sc.close();
    }
    //int[] arr 정답 배열이 들어가는 자리
    public static void dfs(int depth,int m,int[] arr,int n,int now){
        if(depth==m){
            for(int i = 0 ; i < arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = now; i<=n;i++){
            // 1 -> 2

            // 2 -> 2
            
            // 3 -> 2
            arr[depth] = i;
            dfs(depth+1,m,arr,n,i+1);
        }
    }
}