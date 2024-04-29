package C_1874;

import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i < n+1; i++){
            arr[i] = sc.nextInt();
        }
        List<String> answerList = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int count =  1;
        int arrCount = 1;
        boolean No = false;
        for(int i = 1; i < 2*n+1;i++){
            if(st.isEmpty()){
                answerList.add("+");
                st.push(count);
                count++;
            }
            else{
                if(st.peek()==arr[arrCount]){
                    answerList.add("-");
                    st.pop();
                    arrCount++;
                }
                else if(count <= arr[arrCount]){
                    answerList.add("+");
                    st.push(count);
                    count++;
                }
                else{
                    No = true;
                    break;
                }
            }
        }
        if(No){
            System.out.println("NO");
        }
        else{
            for(int i = 0 ; i <answerList.size();i++ ){
                System.out.println(answerList.get(i));
            }
        }
        sc.close();
    }
}