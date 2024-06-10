function solution(array, commands) {
    var answer = [];
    for(let i = 0 ; i < commands.length;i++){
        let command = commands[i];
        answer.push(getNum(array,command));
    }
    return answer;
}
function getNum(array,command){
    let arr = [];
    let i =  command[0];
    let j = command[1];
    let k = command[2];
    for(let a = i-1; a< j ; a++){
        arr.push(array[a]);
    }
    arr.sort(function(a,b){
        return a-b;
    })
    
    return arr[k-1];
}