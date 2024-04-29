package C_4153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int temp;
        int sum;
        StringBuilder sb =new StringBuilder();
        while(true){
            sum = 0;
            temp = 0;
            for(int i = 0 ; i < 3;i++){
                arr[i] = sc.nextInt();
                temp = Math.max(temp,arr[i]);
            }                
            if(arr[0]==0 && arr[1] == 0 && arr[2] ==0){
                break;
            }
            for(int i = 0 ; i < 3;i++){
                if(arr[i]!=temp){
                    sum+=arr[i]*arr[i];    
                }
            }
            if(temp*temp == sum){
                sb.append("right\n");
            }
            else{
                sb.append("wrong\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}