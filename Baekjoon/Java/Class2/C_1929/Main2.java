package C_1929;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] notSosuArr = new boolean[n+1];
        notSosuArr[1] = true;
        // 1 2 3 4 5 6 7 8 9 10
        // t f f t f t f t t t
        for(int i = 2; i<=n;i++){
            if(notSosuArr[i]==true){
                continue;
            }
            for(int j = i ; j <= n;j+=i){
                if(j==i)
                   continue;
                notSosuArr[j] = true;
            }
        }
        for(int i = m ; i <= n ;i++){
            if(notSosuArr[i]==false)
                System.out.println(i);
        }
        sc.close();
    }
}