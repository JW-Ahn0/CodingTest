function solution(n) {
    var answer = [];
    while(n!=0){
        var mod =n%10;
        answer.push(mod);
        n = parseInt(n/10);   
    }

    return answer;
}