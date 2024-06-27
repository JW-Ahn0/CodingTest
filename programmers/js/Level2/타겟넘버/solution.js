function solution(numbers, target) {
    var answer = 0;
    let check =[];
    for(let a of numbers) check.push(false);
    
    
    function re(number,cnt,now){
        if(cnt ===number.length){
            if(now === target)
                answer++;
            return
        }
        re(number,cnt+1, now+number[cnt]);
        re(number,cnt+1, now-number[cnt]);
    }    
    
    re(numbers,0,0,check);
    
    return answer;
}
