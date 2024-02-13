package C_4949;

import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        StringBuilder sb =new StringBuilder();
        while(true){
            String str = sc.nextLine();
            if(str.equals("."))
                break;
            if(isOk(str)){
                sb.append("yes\n");
            }
            else{
                sb.append("no\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
    public static boolean isOk(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i <str.length();i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }
            else if(str.charAt(i)==')'){
                if(stack.isEmpty() || stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }
            else if(str.charAt(i)=='['){
                stack.push('[');
            }
            else if(str.charAt(i)==']'){
                if(stack.isEmpty() || stack.peek()!='['){
                    return false;
                }
                stack.pop();            
            }            
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true; 
    }
}