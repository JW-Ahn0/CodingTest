function solution(progresses, speeds) {
    let answer = [];
    let temp = [];
    for(let i = 0; i<progresses.length; i++){
        let remain = 100-progresses[i];
        temp.push(Math.ceil(remain/speeds[i]));
    }
    let pre = temp[0];
    for(let i = 1 ; i < temp.length;i++){
        if(pre >temp[i]){
            temp[i] = pre;
        }
        pre = temp[i];
    }
    pre = temp[0];
    let cnt = 1;
    for(let i = 1 ; i <temp.length;i++){
        if(pre===temp[i]){
            cnt++;
        }
        else{
            pre = temp[i];
            answer.push(cnt);
            cnt = 1;
        }
    }
    answer.push(cnt);
    return answer;
}