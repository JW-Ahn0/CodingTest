package Class4.C_1991;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Map<String,Node> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            String alphabet =  String.valueOf( (char)('A'+i));
            map.put(alphabet,new Node(alphabet));
        }
        Node root = map.get("A");
        
        //트리 구성
        for(int i = 0 ; i < n;i++){
            String element = sc.next();
            String left = sc.next();
            String right = sc.next();
            if(!left.equals(".")){
                map.get(element).setLeft(map.get(left));
            }
            if(!right.equals(".")){
                map.get(element).setRight(map.get(right));
            }
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        sc.close();
    }
    static class Node{
        private String val;
        private Node left = null;
        private Node right = null;
        public Node(String val){
            this.val = val;
        }

        public void setLeft(Node node){
            this.left = node;
        }
        public Node getLeft(){
            return left;
        }        
        public void setRight(Node node){
            this.right = node;
        }  
        public Node getRight(){
            return right;
        }  
        public String getVal(){
            return val;
        }        
    }
    public static void preOrder(Node node){
        System.out.print(node.getVal());
        if(node.getLeft() !=null){
            preOrder(node.getLeft());
        } 
        if(node.getRight() !=null){
            preOrder(node.getRight());
        }         
    }
    public static void inOrder(Node node){
        if(node.getLeft() !=null){
            inOrder(node.getLeft());
        }
        System.out.print(node.getVal());
        if(node.getRight() !=null){
            inOrder(node.getRight());
        }            
    }
    public static void postOrder(Node node){
        if(node.getLeft() !=null){
            postOrder(node.getLeft());
        } 
        if(node.getRight() !=null){
            postOrder(node.getRight());
        }
        System.out.print(node.getVal());
    }
}