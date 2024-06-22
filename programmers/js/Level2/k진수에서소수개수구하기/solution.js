function solution(n, k) {
    const str = n.toString(k);
    const arr = str.split("0");
    let answer = 0;
    for(const s of arr){
        if(isSosu(Number(s))) {
            answer++;
        }
    }
    return answer;
}
function isSosu(num){
    if(num===1 || num===0) return false;
    for(let i = 2 ; i<=Math.sqrt(num);i++){
        if(num%i===0) return false;
    }
    return true;
}