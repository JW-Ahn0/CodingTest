function solution(n, lost, reserve) {
    let lp = 0;
    let rp = 0;
    let cnt = 0 ;
    lost.sort(function(a,b){
        return a-b;
    })
    reserve.sort(function(a,b){
        return a-b;
    })
    while(lp!== lost.length && rp!== reserve.length){
        if(lost[lp]===reserve[rp]){
            lost.splice(lp,1);
            reserve.splice(rp,1);
        }
        else{
            if(lost[lp] < reserve[rp]) lp++;
            if(lost[lp] > reserve[rp]) rp++;
        }
    }
    lp = 0;
    rp = 0;
    while(lp!== lost.length && rp!== reserve.length){
        if(lost[lp]=== reserve[rp]+1 || lost[lp] === reserve[rp] | lost[lp] ===reserve[rp]-1){
            cnt++;
            lp++;
            rp++;
        }
        else{
            if(lost[lp] < reserve[rp]) lp++;
            else rp++;
        }
    }
    
    let answer = n - lost.length + cnt;
    return answer;
}