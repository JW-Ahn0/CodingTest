import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int answer = m*n;
        char[][] charArr = new char[m][n];
        
        for(int i = 0 ; i < m;i++){
            String str = sc.nextLine();
            for(int j = 0 ; j < str.length();j++){
                charArr[i][j] = str.charAt(j);
            }
        }
        for(int i = 0 ; i <= m-8;i++){
            for(int j = 0 ;j<=n-8;j++){
                answer = Math.min(getMin(i,j,charArr),answer);
            }
        }
        System.out.println(answer);
        sc.close();
    }
    public static int getMin(int a ,int b,char[][] arr){
        int case1 = 0;
        int case2 = 0;
        boolean isCase1 = true;
        
        for(int i = a ; i < a+8;i++){
            if(i%2==0){
                isCase1 = true;
            }
            else{
                isCase1 = false;
            }
            for(int j = b ; j<b+8;j++){
                if(j%2==0){
                    //WBWBWBWB
                    if(isCase1){
                        if(arr[i][j]!='W'){
                            case1++;
                        }
                        if(arr[i][j]!='B'){
                            case2++;
                        }                       
                    }
                    //BWBWBWBW
                    else{
                         if(arr[i][j]!='B'){
                            case1++;
                         }      
                         if(arr[i][j]!='W'){
                            case2++;
                         }                            
                    }
                }
                else{
                    if(isCase1){
                        if(arr[i][j]!='B'){
                            case1++;
                        }
                         if(arr[i][j]!='W'){
                            case2++;
                         }                           
                    }
                    else{
                        if(arr[i][j]!='W'){
                            case1++;
                        }
                        if(arr[i][j]!='B'){
                            case2++;
                        }                          
                    }
                }
            }            
        }
        return Math.min(case1,case2);
    }
}