function solution(n) {
    var a = Math.sqrt(n);
    var b = parseInt(Math.sqrt(n));
    if(a===b)
        return (b+1)*(b+1);
    else return -1;
}