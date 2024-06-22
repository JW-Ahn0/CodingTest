function solution(n, left, right) {
    let share = parseInt(left/n);
    let mod = left % n ;
    let temp =[];
    let answer = [];
    let length = right-left+1;
    for(let i = 0 ; i < share+1;i++){
        temp.push(share+1);
    }
    for(let i = temp.length; i< n;i++){
        temp.push(temp[temp.length-1]+1);
    }
    for(let i = mod ; i < temp.length;i++){
        answer.push(temp[i]);
        length--;
        if(length===0) return answer;
    }
    let next = share+2;
    for(let i = next; i<=n;i++){
        //i가 i만큼 나옴
        let cnt = 0 ;
        for(let j = 0 ; j <i;j++){
            answer.push(i);
            length--;
            if(length===0) return answer;
            cnt++;
        }
        while(cnt!==n){
            answer.push(answer[answer.length-1]+1);
            length--;
            if(length===0) return answer;
            cnt++;
        }
    }
    return answer;
}