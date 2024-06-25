function solution(s){
    var answer = true;
    let stack = [];
    for(let i=0; i<s.length; i++){
        let char = s[i];
        if(char==='('){
            stack.push(char);
        }
        else{
            if(stack.length>=1){
                let ch = stack.pop();
                if(ch!=='('){
                    answer = false;
                    break;
                }
            }
            else{
                answer = false;
                break;
            }
        }
    }
    if(stack.length>=1)
        answer = false;
    return answer;
}