function solution(arr1, arr2) {
    let n = arr1.length;
    let answer = [];
    for(let i = 0 ; i < n;i++){
        let l = arr1[i].length;
        let temp = [];
        for(let j = 0 ; j < l ;j++){
            temp.push(arr1[i][j] + arr2[i][j]);
        }
        answer.push(temp);
    }
    
    return answer;
}