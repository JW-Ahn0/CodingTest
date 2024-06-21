function solution(food) {
    let answer = '';
    for(let i = 1 ;i < food.length;i++){
        let n = parseInt(food[i]/2);
        let arr ='';
        for(let j = 0 ; j < n;j++){
            arr+= i;
        }
        answer+=arr;
    }
    let reverse = '';
    for(let i = answer.length-1; i>=0;i--){
        reverse += answer.charAt(i);
    }
    answer+=0;
    answer+=reverse;
    return answer;
}