function solution(num) {
    let answer = 0;
    while(num!==1){
        if(num%2==0){
            num = parseInt(num/2);
        }
        else{
            num = parseInt(num*3+1);
        }
        answer++;
        if(answer==500)
            return -1;
    }
    return answer;
}