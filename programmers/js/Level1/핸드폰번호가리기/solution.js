function solution(phone_number) {
    let l = phone_number.length-4;
    let answer = '';
    for(let i = 0 ; i < phone_number.length;i++){
        answer += i<l ? '*' : phone_number[i];
    }
    
    return answer;
}