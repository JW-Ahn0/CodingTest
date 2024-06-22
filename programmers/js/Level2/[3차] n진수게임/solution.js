function solution(n, t, m, p) {
    var answer = '';
    let cnt = 0;
    let num = 0;
    let numStr = num.toString(n);
    let now = 1;
    while(true){
        for(let i = 0 ; i < numStr.length;i++){
            if(now===p) answer+=numStr[i].toUpperCase();
            now++;
            if(now>m) {
                now =1;
                cnt++; 
                if(cnt===t) break;
            }
        }
        if(cnt === t) break;
        num++;
        numStr = num.toString(n);
    }
    
    return answer;
}