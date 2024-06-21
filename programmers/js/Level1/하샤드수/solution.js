function solution(x) {
    let sum = 0;
    let temp = x;
    while(temp!=0){
        let mod = temp%10;
        sum += mod;
        temp = parseInt(temp/10);
    }
    let answer = true;
    if(x % sum !=0)
        answer = false;
    return answer;
}