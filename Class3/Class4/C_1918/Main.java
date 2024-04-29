package Class4.C_1918;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Queue<Character> q = new LinkedList<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            //알파벳인 경우
            if('A'<=ch && ch <='Z'){
                q.offer(ch);
            }
            else if(ch=='('){
                st2.push(ch);
            }
            else if(ch==')'){
                char temp;
                while(st2.peek()!='('){
                    temp = st2.pop();
                    q.offer(temp);
                }
                st2.pop();
            }
            else{
                char temp;
                while(!st2.isEmpty() && rank(st2.peek())>= rank(ch)){
                    temp = st2.pop();
                    q.offer(temp);
                }
                st2.push(ch);
            }
        }
        while(!st2.isEmpty()){
            char temp = st2.pop();
            q.offer(temp);
        }
        
        while(!q.isEmpty()){
            System.out.print(q.poll());
        }
        sc.close();
    }
    public static int rank(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        if(ch=='*' || ch=='/'){
            return 2;
        }
        return 0;
    }
}