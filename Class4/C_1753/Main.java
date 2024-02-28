package Class4.C_1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] temp = str.split(" ");
        int n = Integer.valueOf(temp[0]);
        int t = Integer.valueOf(temp[1]);
        str = reader.readLine();
        int start = Integer.valueOf(str);
        int[][] arr  = new int[n+1][n+1];
        int i,j,val;
        for(int k = 0 ; k <  t;k++){
            str = reader.readLine();
            temp = str.split(" ");
            i = Integer.valueOf(temp[0]);
            j = Integer.valueOf(temp[1]);
            val = Integer.valueOf(temp[2]);
            if(arr[i][j]!=0){
                arr[i][j] = Math.min(arr[i][j],val);
            }
            else{
                arr[i][j] = val;
            }
        }
        int[] answer = new int[n+1];
        Arrays.fill(answer,-1);
        answer = da(answer,start,arr,n);
        StringBuilder sb = new StringBuilder();
        for(int k = 1 ; k <= n;k++){
            if(answer[k]==-1){
                sb.append("INF\n");
            }
            else{
                sb.append(String.valueOf(answer[k])+"\n");
            }
        }
        System.out.println(sb.toString());
        reader.close();
    }
    public static int[] da(int[] answer,int start,int[][] arr,int n){
        //1 2 3 4 5 
        int startTemp = start;
        //초기 값 세팅
        answer[startTemp] = arr[start][startTemp];
        for(int i = 0 ; i < n ; i++){
            int temp = answer[startTemp];
            for(int j = 1; j<=n;j++){
                if(arr[startTemp][j]!=0){
                    if(answer[j]==-1){
                        answer[j] = temp+arr[startTemp][j];
                    }
                    else{
                        answer[j] = Math.min(answer[j],temp+arr[startTemp][j]);
                    }
                }
            }
            startTemp++;
            if(startTemp>n){
                startTemp = 1;
            }
        }
        return answer;
    }
}
