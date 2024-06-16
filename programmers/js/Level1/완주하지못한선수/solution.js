function solution(participant, completion) {
    const map = new Map();
    let answer = '';
    for(const complete of completion){
        if(map.get(complete)===undefined){
            map.set(complete,1);
        }
        else{
            const cnt = map.get(complete);
            map.set(complete,cnt+1);
        }
        
    }
    for(const player of participant){
        if(map.get(player)===undefined){
            answer = player;
            break;
        }
        else{
            map.set(player,map.get(player)-1);
        }
    }
    if(answer===""){
        for(const player of participant){
            if(map.get(player)<0){
                answer =player;
                break;
            }
        }
    }
    
    return answer;
}