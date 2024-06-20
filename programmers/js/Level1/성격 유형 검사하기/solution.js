function solution(survey, choices) {
    let test = [[0,0],[0,0],[0,0],[0,0]];
    let map = new Map();
    map.set('R',[0,0]); map.set('T',[0,1]);
    map.set('C',[1,0]); map.set('F',[1,1]);
    map.set('J',[2,0]); map.set('M',[2,1]);
    map.set('A',[3,0]); map.set('N',[3,1]);
    
    let scoreMap = new Map();
    scoreMap.set(1,[0,3]); scoreMap.set(2,[0,2]); scoreMap.set(3,[0,1]); scoreMap.set(4,[0,0]);
    scoreMap.set(5,[1,1]); scoreMap.set(6,[1,2]); scoreMap.set(7,[1,3]);
    
    for(let i  = 0 ; i < survey.length ; i++){
        let char = '';
        let score = scoreMap.get(choices[i]);
        if(score[0]===0) char = survey[i][0];
        else char = survey[i][1];
        let location = map.get(char);
        test[location[0]][location[1]] += score[1];
    }
    let answer = '';
    answer += getAlphabet('RT',test[0][0],test[0][1]);
    answer += getAlphabet('CF',test[1][0],test[1][1]);
    answer += getAlphabet('JM',test[2][0],test[2][1]);
    answer += getAlphabet('AN',test[3][0],test[3][1]);
    return answer;
}
function getAlphabet(alpha, score1, score2){
    if(score1>score2) return alpha[0];
    else if( score1===score2){
        return alpha[0];
    }
    else return alpha[1];
}