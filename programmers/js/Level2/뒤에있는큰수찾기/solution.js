function solution(numbers) {
    let answer = new Array(numbers.length).fill(-1);
    let stack = [];
    for(let i = 0 ; i < numbers.length; i++){
        while(stack.length>0 && numbers[i] > numbers[stack.at(-1)]){
            let index = stack.pop();
            answer[index] = numbers[i];
        }
        stack.push(i);
    }
    return answer;
}