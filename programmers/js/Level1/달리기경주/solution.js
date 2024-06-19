function solution(players, callings) {
    let playerMap = new Map();
    let scoreMap = new Map();
    for(let i =0; i< players.length;i++){
        playerMap.set(players[i],i+1);
        scoreMap.set(i+1,players[i]);
    }
    for(let i= 0;i<callings.length;i++){
        let score = playerMap.get(callings[i]);
        let p1 = scoreMap.get(score-1);
        let p2 = callings[i]; 
        scoreMap.set(score-1, p2);
        scoreMap.set(score,p1);
        playerMap.set(p1,score);
        playerMap.set(p2,score-1);
    }
    let answer = [];
    for(let i=0 ; i < players.length;i++){
        answer.push(scoreMap.get(i+1));
    }
    
    return answer;
}