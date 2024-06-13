function solution(left, right) {
    let answer = 0;
    for(let i = left ; i<=right;i++){
        answer += getCount(i)%2==0 ? i : -i;
    }
    return answer;
}
function getCount(num){
    let result = 0;
    for(let i =1;i<=num;i++){
       if(num%i==0)
           result++;
    }
    return result;
}