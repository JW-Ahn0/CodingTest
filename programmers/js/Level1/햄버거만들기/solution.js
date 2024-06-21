function solution(ingredient) {
    var answer = 0;
    let stack =[];
    let breadCnt = 0;
    for(let i = 0 ; i < ingredient.length;i++){
        let num = ingredient[i];
        let isAnswerExist = false;
        //빵인 경우
        if(num===1) breadCnt++;
        if(breadCnt>=2 && num===1){
            //stack 크기가 3이상인 경우 3개 순차적으로 뽑아서 고기 - 야채 - 빵인지 확인
            if(stack.length > 2 ){
                let s1 = stack.pop();
                let s2 = stack.pop();
                let s3 = stack.pop();
                if(s1===3 && s2 === 2 && s3 ===1){
                    answer++;
                    breadCnt -=2;
                    isAnswerExist = true;
                }
                else{
                    stack.push(s3);
                    stack.push(s2);
                    stack.push(s1);
                }
            }
        }
        if(!isAnswerExist){
            stack.push(num);
        }
        
    }
    return answer;
}