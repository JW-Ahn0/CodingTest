function solution(lottos, win_nums) {
    let min = 0;
    let max = 0;
    let zeroCnt = 0;
    let sameCnt=0;
    for(const number of lottos){
        if(number===0) zeroCnt++;
        if(win_nums.includes(number)) sameCnt++
    }
    
    var answer = [];
    answer.push(score(sameCnt+zeroCnt))
    answer.push(score(sameCnt))
    return answer;
}
function score(number){
    if(number===6) return 1;
    if(number===5) return 2;
    if(number===4) return 3;
    if(number===3) return 4;
    if(number===2) return 5;
    return 6; 
}