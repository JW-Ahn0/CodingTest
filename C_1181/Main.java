package C_1181;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < t;i++){
            String str = br.readLine();
            set.add(str);
        }
        list.addAll(set);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
