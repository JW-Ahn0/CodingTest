function solution(n, m, section) {
    let answer = 0;
    let max = 0 ;
    for(let i = 0; i<section.length;i++){
        if(section[i] > max){
            answer++;
            max = section[i] + m-1;
        }
    }
    
    return answer;
}