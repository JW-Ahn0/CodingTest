function solution(friends, gifts) {
    let board = [];
    let answer = [];
    let n = friends.length;
    let indexMap = new Map();
    let nameMap = new Map();
    let scoreArr = [];
    for(let i = 0 ; i < n;i++){
        indexMap.set(i,friends[i]);
        nameMap.set(friends[i],i);
        answer.push(0);
    }
    //표 초기화
    for(let i = 0 ; i < n;i++){
        let arr =[];
        let arr2 =[];
        for(let j = 0 ; j<n;j++){
            arr.push(0);
        }
        board.push(arr);
    }
    
    //주고받은 선물 표로 구하기
    for(let gift of gifts){
        let give = gift.split(" ")[0];
        let get = gift.split(" ")[1];
        board[nameMap.get(give)][nameMap.get(get)]++;
    }
    //선물지수 구하기
    for(let i = 0 ; i < n;i++){
        let giveScore = 0;
        let getScore = 0;
        for(let j = 0 ; j < n;j++){
            giveScore += board[i][j];
            getScore += board[j][i];
        }
        scoreArr.push(giveScore-getScore);
    }
    for(let i = 0 ; i < n;i++){
        for(let j = i ; j <n;j++){
            if(i!==j){
                if(board[i][j] > board[j][i]){
                    answer[i]++;
                }
                else if(board[i][j]===board[j][i]){
                    if(scoreArr[i] <scoreArr[j])
                        answer[j]++;
                    else if(scoreArr[i] > scoreArr[j]){
                        answer[i]++;
                    }
                }
                else{
                    answer[j]++;
                }
            }
        }
    }
    let max = 0 ;
    for(let i = 0 ; i < n;i++){
        max = Math.max(max,answer[i]);
    }
    return max;
}