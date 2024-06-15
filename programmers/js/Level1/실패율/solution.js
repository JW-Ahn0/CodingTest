function solution(N, stages) {
    let stage =[];
    let challenge =[];
    for(let i = 0 ; i <=N;i++){
        stage.push(0);
        challenge.push(0);
    }
    for(let i = 0 ; i<stages.length;i++){
        let clear = stages[i];
        for(let j = 1 ; j< clear ;j++){
            stage[j]++;
            challenge[j]++;
        }
        challenge[clear]++;
    }
    let temp =[];
    for(let i = 1;i<=N;i++){
        let obj = [i,stage[i]/challenge[i]];
        temp.push(obj);
    }
    temp.sort(function(a,b){
        if(a[1]===b[1]){
            return a[0]-b[0]; 
        }
        return a[1]-b[1];
    })
    let answer = [];
    for(let i = 0 ; i <temp.length;i++){
        answer.push(temp[i][0]);
    }
    return answer;
}