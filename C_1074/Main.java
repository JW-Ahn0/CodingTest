package C_1074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n= 1;
        for(int i = 0 ; i < t ;i++){
            n *=2;
        }
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(z(0,r,c,n));
        sc.close();
    }
    public static int z(int count,int x, int y, int n){
        int temp = (n/2)*(n/2);
        if(n==2){
            if(x==0 && y==0){
                return count;
            }
            else if(x==0 && y==1){
                return count+1;
            }
            else if(x==1 && y==0){
                return count+2;
            }
            else if(x==1 && y==1){
                return count+3;
            }
        }
        else{
            if(x >= n/2){
                //4사분면
                if(y>=n/2){
                    return z(count+temp*3,x-n/2  ,y-n/2 ,n/2);
                }
                //3사분면
                else{
                    return z(count+temp*2,x-n/2  ,y ,n/2);
                }
            }
            else{
                //2사분면
                if(y>=n/2){
                    return z(count+temp,x,y-n/2 ,n/2);
                }
                //1사분면
                else{
                    return z(count,x,y ,n/2);
                }
            }
        }
        return count;
    }
}