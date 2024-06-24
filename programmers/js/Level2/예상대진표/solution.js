function solution(n,a,b)
{
    var answer = 0;
    let cnt = 1;
    let A =  a;
    let B = b;
    while(true){
        if(parseInt((A-1)/2) === parseInt((B-1)/2) ){
            return cnt;
        }
        if(A%2===1){
            A = (A+1)/2;
        }
        else{
            A = A/2;
        }
        if(B%2===1){
            B = (B+1)/2;
        }
        else{
            B = B/2;
        }
        cnt++;
    }
    
    return answer;
}