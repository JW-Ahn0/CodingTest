function solution(board, moves) {
    let pointArr = [];
    let stack = [];
    let n = board.length;
    let answer = 0;
    for(let i = 0 ; i < n;i++){
        pointArr.push(n);
    }
    for(let i = 0 ; i <n;i++){
        for(let j = 0 ; j<n;j++){
            if(board[i][j]!==0){
                pointArr[j] = pointArr[j] > i ? i : pointArr[j];
            }
        }
    }
    for(let move of moves){
        if(pointArr[move-1] < n){
            let height = pointArr[move-1];
            
            let num = board[height][move-1];
            if(stack.length > 0 && stack[stack.length-1] === num) {
                stack.pop();
                answer+=2;
            }
            else
                stack.push(board[height][move-1]);

            board[height][move-1] = 0;
            pointArr[move-1]++;
            
        }
    }    
    return answer;
}