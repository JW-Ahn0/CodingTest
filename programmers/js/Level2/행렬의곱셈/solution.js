function solution(arr1, arr2) {
    let m = arr1.length;
    let n = arr1[0].length;
    
    let o = arr2[0].length;
    var answer = [];
    for(let i = 0 ; i<m;i++){
        let arr = [];
        for(let j = 0; j<o;j++){
            let sum = 0 ;
            for(let k = 0 ; k<n;k++){
                sum+= arr1[i][k] * arr2[k][j];
            }
            arr.push(sum);
        }
        answer.push(arr);
    }
    return answer;
}