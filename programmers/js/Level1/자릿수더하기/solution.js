function solution(n)
{
    var answer = 0;
    var mod = 0;
    while(n!=0){
        mod = parseInt(n%10);
        answer+=mod;
        n = parseInt(n/10);
    }
    
    return answer;
}