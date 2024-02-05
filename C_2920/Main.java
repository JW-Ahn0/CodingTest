package C_2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isAscending = true;
        boolean isDescending = true;
        int[] arr = new int[8];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1 ; i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isAscending = false;
                break;
            }
        }
        if(isAscending) {
            System.out.println("ascending");
            sc.close();
            return;
        }
        for(int i = 1 ; i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                isDescending = false;
                break;
            }
        }       
        if(isDescending) {
            System.out.println("descending");
            sc.close();
            return;
        }
        System.out.println("mixed");
        sc.close();
    }
}