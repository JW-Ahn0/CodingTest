package C_10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st =new Stack<>();
        int t= sc.nextInt();
        int temp;
        int sum = 0;
        for(int i = 0 ; i < t;i++){
            temp = sc.nextInt();
            if(temp==0){
                st.pop();
            }
            else{
                st.push(temp);
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        System.out.println(sum);
        sc.close();
    }
}