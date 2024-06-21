function solution(arr) {
    let n = arr.length;
    let sum = 0;
    let answer = 0 ;
    for(let i = 0 ; i < n;i++){
        sum +=arr[i];
    }
    answer = sum/n;
    return answer;
}