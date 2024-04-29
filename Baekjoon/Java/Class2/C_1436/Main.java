package C_1436;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int count = 1;
        int now = 667;
        arr[1] = 666;
        while(count<n){
            if(String.valueOf(now).contains("666")==true){
                count++;
                arr[count] = now;
            }
            now++;
        }
        System.out.println(arr[n]);
        sc.close();
    }
}