function solution(X, Y) {
    let x = getArr(X);
    let y = getArr(Y);
    let arr = [];
    let isAnswerExist = false; 
    let answer = '';
    for(let i = 0 ; i < 10;i++){
        let num = Math.min(x[i],y[i]);
        if(num!==0) isAnswerExist= true;
        arr.push(num);
    }
    if(isAnswerExist){
        for(let i = 9 ; i>=0;i--){
            answer += getStr(i,arr[i]);
        }
    }
    else{
        answer ='-1';
    }
    let isZeroOnly = true;
    for(let i = 0 ; i <answer.length;i++){
        if(answer[i]!=='0') {
            isZeroOnly = false;
            break;
        }
    }
    if(isZeroOnly)
        answer = '0';
    return answer;
}
function getArr(num){
    let arr =[];
    for(let i = 0 ; i < 10;i++){
        arr.push(0);
    }
    let temp = num;
    for(let i = 0 ; i < temp.length ;i++){
        arr[parseInt(temp[i])]++;
    }
    return arr;
}
function getStr(num, count){
    let result ='';
    for(let i = 0 ; i < count;i++){
        result +=num;
    }
    return result;
}
