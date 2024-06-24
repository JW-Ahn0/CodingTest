function solution(elements) {
    let n = elements.length;
    let set = new Set();
    //길이가 i 인 수열
    for(let i = 1 ; i <=n ;i++){
        
        //시작지점이 j인 수열
        for(let j = 0; j <n;j++){
            let sum = 0 ;
            for(let k = 0 ; k < i; k++){
                let index = j+k >=n ? j+k-n : j+k;
                sum += elements[index];
            }
            set.add(sum);
        }
    }
    var answer = set.size;
    return answer;
}