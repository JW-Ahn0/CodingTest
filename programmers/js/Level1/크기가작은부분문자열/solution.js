function solution(t, p) {
    let n = p.length;
    let answer = 0;
    for(let i = 0 ; i <= t.length-n;i++){
        let str = t.substring(i,i+n);
        if(parseInt(str)<=p){
            answer++;
        }
            
    }
    
    return answer;
}