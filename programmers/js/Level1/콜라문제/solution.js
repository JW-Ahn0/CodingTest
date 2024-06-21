function solution(a, b, n) {
    var answer = getCoke(a,b,n,0);
    return answer;
}
function getCoke(a,b,empty,total){
    if(empty<a)
        return total;
    let temp = empty%a;
    let full = parseInt(empty/a)*b;
    total +=full;
    return getCoke(a,b,full+temp,total);
}
