function solution(s) {
    let arr = s.split(" ");
    let answer = '';
    for(let word of arr){
        answer+= word.substring(0,1).toUpperCase() + word.substring(1,word.length).toLowerCase();
        answer+= ' ';
    }
    return answer.substring(0,answer.length-1);
}