package Class4.C_9663;

import java.util.Scanner;

public class Main {
    static int cnt = 0 ;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        dfs(arr,n,0);
        System.out.println(cnt);
        sc.close();
    }
    public static void dfs(int[] arr, int n,int now){
        if(n==now){
            cnt++;
            return;
        }
        for(int i = 0 ; i < n;i++){
            arr[now] = i;
            if(vaild(arr,now)){
                dfs(arr,n,now+1);
            }
        }
    }
    public static boolean vaild(int[] arr,int now){
        for(int i = 0 ; i < now;i++){
            if(arr[now]==arr[i]) return false;
            if(Math.abs(now-i) == Math.abs(arr[now]-arr[i])) return false;
        }
        return true;
    }
}