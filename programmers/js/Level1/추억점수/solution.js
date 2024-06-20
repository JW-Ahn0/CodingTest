function solution(name, yearning, photo) {
    let answer = [];
    for(let  i = 0 ; i < photo.length;i++){
        let sum = 0;
        for(let j = 0 ; j < photo[i].length;j++){
            sum += getScore(name,yearning,photo[i][j]);
        }
        answer.push(sum);
    }
    return answer;
}
function getScore(names,yearning,name){
    for(let i = 0 ; i < names.length;i++){
        if(names[i]===name)
            return yearning[i];
    }
    return 0;
}