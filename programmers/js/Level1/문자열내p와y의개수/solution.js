function solution(s){
    let answer = true;
    let pCnt = 0;
    let yCnt = 0;
    for(let i = 0 ; i < s.length;i++){
        const c = s.charAt(i);
        if(c==='p' || c==='P')
            pCnt++;
        if(c==='y' || c ==='Y')
            yCnt++;
    }
    if(pCnt != yCnt)
        answer = false;
    
    return answer;
}