function solution(n) {
    
    let str = n.toString(2);
    let cnt = 0;
    for(let i = 0 ; i < str.length;i++){
        if(str[i]==='1') cnt++;
    }
    let temp = n+1;
    while(convert(temp)!==cnt){
        temp++;
    }
    return temp;
}

function convert(n){
    let str = n.toString(2);
    let cnt = 0;
    for(let i = 0 ; i < str.length;i++){
        if(str[i]==='1') cnt++;
    }
    return cnt;
    
}