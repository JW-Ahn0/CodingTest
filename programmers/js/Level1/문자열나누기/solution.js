function solution(s) {
    var answer = re(s,0);   
    return answer;
}
function re(str,cnt){
    if(str==='') return cnt;
    let char = str.charAt(0);
    let cnt1 = 0;
    let cnt2 = 0;
    for(let i = 0 ; i < str.length;i++){
        if(str[i]===char) cnt1++;
        else cnt2++;
        if(cnt1===cnt2){
            return re(str.substring(i+1,str.length),cnt+1);
        }
    }
    return cnt+1;
}