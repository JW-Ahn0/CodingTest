package C_1012;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m,n,tc;
        
        StringBuilder sb = new StringBuilder();
        for(int j = 0 ; j <t;j++){
            m = sc.nextInt();
            n = sc.nextInt();
            tc = sc.nextInt();
            int[][] arr = new int[m][n];
            boolean[][] check = new boolean[m][n];
            int count =0 ;
            int x,y;
            for(int i = 0 ; i < tc;i++){
                x = sc.nextInt();
                y = sc.nextInt();
                arr[x][y] = 1;
            }
            for(int i = 0 ; i<m;i++){
                for(int k = 0;k<n;k++){
                    if(arr[i][k]==1 && check[i][k]==false){
                        next(arr,check,i,k,m,n);
                        count++;
                    }
                }
            }
            sb.append(count+"\n");
            
            
        }
        System.out.println(sb.toString());
        sc.close();
    }
    public static void next(int[][] arr,boolean[][] check,int x,int y,int m, int n){
        if(x<0) return ;
        if(y<0) return ;
        if(m<=x) return ;
        if(n<=y) return ;
        if(check[x][y]) return;
        if(arr[x][y]!=1) return;
        
        check[x][y] = true;
        next(arr,check,x-1,y,m,n);
        next(arr,check,x+1,y,m,n);
        next(arr,check,x,y-1,m,n);
        next(arr,check,x,y+1,m,n);
    }
}