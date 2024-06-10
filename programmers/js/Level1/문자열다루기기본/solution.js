function solution(s) {
    let n = s.length;
    let check = n === 4 ? true : n === 6 ? true : false;
    if(check){
        for(let i = 0 ; i < n;i++){
            if( !('0' <= s.charAt(i) && s.charAt(i) <= '9' ) ){
                check = false;
                break;
            }
        }
    }
    let answer = check ? true : false;
    return answer;
}