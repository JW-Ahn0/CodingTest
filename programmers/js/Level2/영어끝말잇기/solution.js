function solution(n, words) {
    let answer = [];
    let map = new Map();
    let cnt = 1;
    let cntP = 1;
    let isBreak = false;
    let preWord =words[0];
    map.set(preWord,true);
    for(let i = 1 ; i <words.length;i++){
        cnt++;
        
        if(preWord[preWord.length-1]!==words[i][0]){
            isBreak = true;
            answer.push(cnt);
            answer.push(cntP);
            break;             
        }
        else if(map.get(words[i])===undefined){
            map.set(words[i],true);
        }
        else{
            isBreak = true;
            answer.push(cnt);
            answer.push(cntP);
            break;            
        }

        preWord = words[i];
        if(cnt>=n) {
            cnt=0;
            cntP++;
        }
    }
    if(!isBreak){
        answer.push(0);
        answer.push(0);
    }
    return answer;
}