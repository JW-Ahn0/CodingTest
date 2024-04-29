package C_18110;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        double f = Double.valueOf(br.readLine());
        List<Integer> list = new ArrayList<>();
        int num = (int) Math.round(f * 0.15);
        int temp;
        double sum=0;
        for(int i = 0;  i<f;i++){
            temp = Integer.valueOf(br.readLine());
            list.add(temp);
        }
        Collections.sort(list);
        for(int i=num; i< list.size()-num;i++){
               sum += list.get(i);
        }
        sum/=(list.size()-num*2);
        bw.write(String.valueOf(Math.round(sum)));
        bw.flush();
        bw.close();
    }
}
