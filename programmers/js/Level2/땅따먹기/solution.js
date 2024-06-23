function solution(land) {
    var answer = 0;
    let arr = [];
    let pre = [];
    for(let i = 0 ; i < land.length;i++){
        // j : 기준 시작점.
        let temp = [];
        if(i===0){
            for(let j = 0 ; j < 4;j++){
                temp.push(land[i][j]);
            }
            arr.push(temp);
        }
        else{
            for(let j = 0 ; j < 4;j++){
                let t = 0;
                for(let k = 0; k< 4;k++){
                    if(j!==k){
                        t = Math.max(t,arr[i-1][k] + land[i][j]);
                    }
                }
                temp.push(t);
            }
            arr.push(temp);
        }
    }
    
    for(const n of arr[land.length-1]){
        answer = Math.max(n,answer);
    }
    return answer;
}