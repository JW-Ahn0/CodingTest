package Class4.C_1932;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1 ; i <= n;i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j=1;j<=i;j++){
                tempList.add(sc.nextInt());
            }
            list.add(tempList);
        }
        for(int i = 1 ;i<n;i++){
            List<Integer> preList = list.get(i-1);
            List<Integer> tempList = list.get(i);
            for(int j = 0 ; j<tempList.size();j++){
                int temp = tempList.get(j);
                if(j==0){
                    tempList.set(j,temp+preList.get(j));
                }
                else if(j==tempList.size()-1){
                    tempList.set(j,temp+preList.get(j-1));
                }
                else{
                    tempList.set(j,temp + Math.max(preList.get(j-1),preList.get(j)));
                }
            }
        }
        List<Integer> answerList =  list.get(n-1);
        int max = 0;
        for(int i = 0 ; i < answerList.size() ;i++){
            max = Math.max(max,answerList.get(i));
        }
        System.out.println(max);
        sc.close();
    }
}

