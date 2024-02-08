<<<<<<< HEAD
package C_10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; i <t;i++){
            String temp = sc.nextLine();
            String[] str = temp.split(" ");
            if(str[0].equals("push")){
                st.push(Integer.valueOf(str[1]));
            }
            else if(str[0].equals("pop")){
                if(st.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(st.pop()+"\n");
                }
            }
            else if(str[0].equals("size")){
                sb.append(st.size()+"\n");      
            }
            else if(str[0].equals("empty")){
                if(st.isEmpty()){
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }                
            }
            else if(str[0].equals("top")){
                if(st.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(st.peek()+"\n");
                }                
            }                    
        }
        System.out.println(sb.toString());
        sc.close();
    }
=======
package C_10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; i <t;i++){
            String temp = sc.nextLine();
            String[] str = temp.split(" ");
            if(str[0].equals("push")){
                st.push(Integer.valueOf(str[1]));
            }
            else if(str[0].equals("pop")){
                if(st.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(st.pop()+"\n");
                }
            }
            else if(str[0].equals("size")){
                sb.append(st.size()+"\n");      
            }
            else if(str[0].equals("empty")){
                if(st.isEmpty()){
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }                
            }
            else if(str[0].equals("top")){
                if(st.isEmpty()){
                    sb.append("-1\n");
                }
                else{
                    sb.append(st.peek()+"\n");
                }                
            }                    
        }
        System.out.println(sb.toString());
        sc.close();
    }
>>>>>>> 88b24dd4ae44780a230b97f2a45780faf3daad65
}