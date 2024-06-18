function solution(arr) {
    let answer = [];
    let index = 0 ;
    let min = arr[0];
    for(let i = 1 ; i < arr.length;i++){
        if(min > arr[i]){
            min = arr[i];
            index = i;
        }
        
    }
    
    for(let i = 0 ; i < arr.length;i++){
        if(i!==index)
            answer.push(arr[i]);
    }
    if(answer.length===0)
        answer.push(-1);
    return answer;
}