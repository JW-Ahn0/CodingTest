package C_2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int A  = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int target = V-A;
        int answer = 0;
        if(target % (A-B)!=0){
            answer++;
        }
        answer += (target/(A-B) +1);
        System.out.println(answer);
        //V-A 곳이 목표 마지막에 +1해줌
        //(V-A) / (A-B) if((V-A)%(A-B) !=0)+1 더해 줌
        sc.close();
    }
}