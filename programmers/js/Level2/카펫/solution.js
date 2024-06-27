function solution(brown, yellow) {
    let total = brown +yellow;
    let line = 1;
    let w = 0;
    while(true){
        let a = ((total - (yellow+ line*2)) /2);
        if(a*(line+2) ===total){
            w = a;
            break;
        }
        line++;
    }
    var answer = [w,total/w];
    return answer;
}