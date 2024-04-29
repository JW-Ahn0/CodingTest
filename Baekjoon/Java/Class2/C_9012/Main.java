package C_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n;i++){
            String str = sc.nextLine();
            if(isOk(str)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
        sc.close();
    }
    public static boolean isOk(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            // str.get(i) ==')'
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}