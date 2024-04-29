import java.util.*;


public class Main {
    static int m;
    static int n;
    static int[][] arr;
    static int[][] temp;
    static int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
    static int count = 0 ;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];
        temp = new int[n][m];
        List<int[]> startList = new ArrayList<>();
        for(int i = 0 ; i< n;i++){
            Arrays.fill(temp[i],-1);
            for(int j= 0;j<m;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    startList.add(new int[]{i,j});
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i < startList.size();i++){
            int[] t = startList.get(i);
            q.offer(new int[]{t[0],t[1],0});
        }
        while(!q.isEmpty()){
            int[] tomato = q.poll();
            int x = tomato[0];
            int y = tomato[1];
            int d = tomato[2];
            if(temp[x][y]!=-1) continue;
            temp[x][y] = d;
            count = Math.max(count,d);
            for(int i = 0 ; i < 4;i++){
                int x1 = x+dir[i][0];
                int y1 = y+dir[i][1];
                if(0<=x1 && x1 < n && 0<=y1 && y1<m && temp[x1][y1]==-1 && arr[x1][y1]!=-1){
                    q.offer(new int[]{x1,y1,d+1});
                }
            }
        }
        boolean check = false;
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j<m;j++){
                if(arr[i][j]==0 && temp[i][j]==-1){
                    check = true;
                    break;
                }
            }
            if(check){
                break;
            }
        }
        if(check){
            System.out.println(-1);
        }
        else{
            System.out.println(count);
        }
        sc.close();
    }
}