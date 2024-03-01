package Class4.C_11444;

import java.util.*;

public class Main {
    static long[][] origin = { {1,1},{1,0}};
    static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[][] matrix = {{1,1},{1,0}};
        String input = sc.nextLine();
        long num = Long.valueOf(input);
        
        System.out.println(pow(matrix,num-1)[0][0]);
        sc.close();
    }
    public static long[][] pow(long[][] m, long exp){
        if(exp==0 || exp ==1){
            return m;
        }
        long[][] next = pow(m,exp/2);
        next = mul(next,next);
        if(exp % 2 == 1){
            next = mul(next,origin);
        }
        return next;
    }
    public static long[][] mul(long[][] a,long[][] b){
        long[][] result = new long[2][2];
        result[0][0] = ((a[0][0]*b[0][0])+(a[0][1]*b[1][0])) % mod;
        result[0][1] = ((a[0][0]*b[0][1])+(a[0][1]*b[1][1])) % mod;
        
        result[1][0] = ((a[1][0]*b[0][0])+(a[1][1]*b[1][0])) % mod;
        result[1][1] = ((a[1][0]*b[0][1])+(a[1][1]*b[1][1])) % mod;
        return result;
    }
}
