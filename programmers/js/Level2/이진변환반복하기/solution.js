function solution(s) {
    let cnt = 0;
    let zeroCnt = 0 ;
    while(parseInt(s,2)!==1){
        let temp = convert(s);
        zeroCnt+=temp[0];
        s = temp[1];
        cnt++;
    }
    var answer = [cnt,zeroCnt];
    return answer;
}

function convert(s){
    let result =[];
    let zeroCnt = 0;
    let temp ='';
    for(let i= 0; i<s.length;i++){
        if(s[i]==='0'){
            zeroCnt++;
        }
        else
            temp+=s[i];
    }
    let n = temp.length;
    result.push(zeroCnt);
    result.push(n.toString(2));
    return result;
}