package C_1931;

import java.util.*;


public class Main {
	public static void main(String args[]) throws Exception
	{
		Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        int start,end;
        for(int i = 0 ; i < t;i++){
            start = sc.nextInt();
            end = sc.nextInt();
            Pair p = new Pair(start,end);
            list.add(p);
        }
        Collections.sort(list,new Comparator<>(){
            @Override
            public int compare(Pair a,Pair b){
                if(a.getEnd()==b.getEnd()){
                    return a.getStart() - b.getStart();
                }
                return a.getEnd() - b.getEnd();
            }
        });
        int answer = 0;
        int time = 0;
        for(int i = 0 ; i < list.size();i++){
            if(time <= list.get(i).getStart()){
                answer++;
                time = list.get(i).getEnd();
            }
        }
        System.out.println(answer);
        sc.close();
	}
    static class Pair{
        private int start;
        private int end;
        public Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
        public int getStart(){
            return this.start;
        }
        public int getEnd(){
            return this.end;
        }        
    }
}