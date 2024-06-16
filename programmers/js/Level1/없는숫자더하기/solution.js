function solution(numbers) {
    let arr = [];
    let answer = 0 ;
    for(let i = 0 ; i < 10;i++){
        arr.push(false);
    }
    for(let i = 0 ; i < numbers.length;i++){
        let number = numbers[i];
        arr[number] = true;
    }
    for(let i = 0 ; i < 10;i++){
        if(!arr[i])
            answer+=i;
    }
    
    return answer;
}