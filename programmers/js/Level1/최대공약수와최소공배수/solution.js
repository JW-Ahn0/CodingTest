function solution(n, m) {
    var answer = [];
    let a = n<m? func(m,n) : func(n,m);
    answer.push(a);
    answer.push(parseInt(n*m/a));
        
    return answer;
}
function func(a,b){
    if(a%b==0)
        return b;
    else
        return func(b,a%b);
}

