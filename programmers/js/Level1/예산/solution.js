function solution(d, budget) {
    d.sort(function(a,b){
       return a-b; 
    });
    let answer = 0;
    for(let i = 0 ; i < d.length;i++){
        if(budget-d[i]>=0){
            budget -= d[i];
            answer++;            
        }

    }
    
    return answer;
}