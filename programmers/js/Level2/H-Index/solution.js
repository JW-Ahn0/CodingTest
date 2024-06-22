function solution(citations) {
    let n = citations.length;
    // 0 1 3 5 6
    let max = 0;
    for(let i = 1 ; i <=n;i++){
        let h = i;
        let cnt1 =0;
        let cnt2 =0;
        for(let j = 0 ; j < n;j++){
            if(citations[j]>=h) cnt1++;
            else cnt2++;
        }
        if(cnt1>=h && h>=cnt2){
            max = Math.max(max,h);
        }
    }
    
    return max;
}