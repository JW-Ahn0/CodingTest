function solution(s) {
    let answer = [];
    let map = new Map();
    for(let i = 0 ; i <s.length;i++){
        const char = s.charAt(i);
        if(map.get(char)===undefined){
            map.set(char,i);
            answer.push(-1);
        }
        else{
            answer.push(i - map.get(char));
            map.set(char,i);
        }
    }
    return answer;
}