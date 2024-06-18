function solution(n) {
    let mod = 0;
    let answer =[];
    while(n!=0){
        mod = n%10;
        answer.push(mod);
        n = parseInt(n/10);
    }
    answer.sort(function(a, b)  {
        return a - b;
    });
    let str = "";
    for(let i = answer.length-1 ; i >=0;i--){
        str+=answer[i];
    }
    return parseInt(str);
}