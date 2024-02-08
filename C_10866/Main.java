<<<<<<< HEAD
package C_10866;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        String temp;
        LinkedList<Integer> list = new LinkedList<>();
        int size = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t; i++){
            temp = br.readLine();
            String[] str = temp.split(" ");
            if(str[0].equals("push_back")){
                list.addLast(Integer.valueOf(str[1]));
                size++;
            }
            else if(str[0].equals("push_front")){
                list.addFirst(Integer.valueOf(str[1]));
                size++;
            }
            else if(str[0].equals("pop_front")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.removeFirst() + "\n");
                    size--;
                }
            }
            else if(str[0].equals("pop_back")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.removeLast() + "\n");
                    size--;
                }
            }
            else if(str[0].equals("size")){
                sb.append(size+"\n");
            }
            else if(str[0].equals("empty")){
                if(size==0){
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }
            }
            else if(str[0].equals("front")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.getFirst()+"\n");
                }
            }
            else if(str[0].equals("back")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.getLast()+"\n");
                }                
            }            
        }
        System.out.println(sb.toString());
    }
=======
package C_10866;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        String temp;
        LinkedList<Integer> list = new LinkedList<>();
        int size = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t; i++){
            temp = br.readLine();
            String[] str = temp.split(" ");
            if(str[0].equals("push_back")){
                list.addLast(Integer.valueOf(str[1]));
                size++;
            }
            else if(str[0].equals("push_front")){
                list.addFirst(Integer.valueOf(str[1]));
                size++;
            }
            else if(str[0].equals("pop_front")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.removeFirst() + "\n");
                    size--;
                }
            }
            else if(str[0].equals("pop_back")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.removeLast() + "\n");
                    size--;
                }
            }
            else if(str[0].equals("size")){
                sb.append(size+"\n");
            }
            else if(str[0].equals("empty")){
                if(size==0){
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }
            }
            else if(str[0].equals("front")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.getFirst()+"\n");
                }
            }
            else if(str[0].equals("back")){
                if(size==0){
                    sb.append("-1\n");
                }
                else{
                    sb.append(list.getLast()+"\n");
                }                
            }            
        }
        System.out.println(sb.toString());
    }
>>>>>>> 88b24dd4ae44780a230b97f2a45780faf3daad65
}