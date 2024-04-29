package C_18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);
        int b = Integer.valueOf(str[2]);
        int[][] arr = new int[n][m];
        int min = 256;
        int max = 0;
        for(int i = 0 ; i < n;i++){
            String[] temp = br.readLine().split(" ");
            for(int j = 0 ; j <m;j++){
                arr[i][j] = Integer.valueOf(temp[j]);
                min = Math.min(arr[i][j],min);
                max = Math.max(arr[i][j],max);
            }
        }
        int answerT = -1;
        int answerH = 0;
        for(int i = min ; i<=max;i++){
            
            int time = getTime(arr,b,i);
            //System.out.println("i :" +i +" time :"+time);
            if(time!=-1){
                if(answerT==-1){
                    answerT = time;
                }
                else{
                    answerT = Math.min(time,answerT);
                }
                
                if(time == answerT){
                    answerH = i;
                }               
            }
        }
        System.out.println(answerT+" "+answerH);
        //최소 값 부터 최대값까지 1나씩 한다
        //
    }
    public static int getTime(int[][] arr, int inventory,int height){
        int plus = 0;
        int minus = 0;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j <arr[i].length;j++){
                if(height - arr[i][j]>0){
                    plus+=height - arr[i][j];
                }
                else{
                    minus += arr[i][j] - height;
                }
            }
        }
        //System.out.println("plus :"+plus+" minus :"+minus+" inventory :"+inventory);
        if( (plus-minus) > inventory ){
            return -1;
        }
        return plus+minus*2;
    }
}
