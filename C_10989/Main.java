<<<<<<< HEAD
package C_10989;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        int[] arr = new int[t];
        StringBuilder sb =new StringBuilder();

        for(int i = 0 ; i < t; i++){
            arr[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(arr);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i<t; i++) {
			bw.write(String.valueOf(arr[i]) + "\n");
		}
		bw.flush();
		bw.close();
        System.out.println(sb.toString());
    }
=======
package C_10989;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());
        int[] arr = new int[t];
        StringBuilder sb =new StringBuilder();

        for(int i = 0 ; i < t; i++){
            arr[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(arr);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i<t; i++) {
			bw.write(String.valueOf(arr[i]) + "\n");
		}
		bw.flush();
		bw.close();
        System.out.println(sb.toString());
    }
>>>>>>> 88b24dd4ae44780a230b97f2a45780faf3daad65
}