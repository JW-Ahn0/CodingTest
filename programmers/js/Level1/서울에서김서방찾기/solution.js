function solution(seoul) {
    
    let index = 0 ;
    for(let i = 0 ; i < seoul.length;i++){
        if(seoul[i]==='Kim'){
            index = i;
            break;
        }
            
    }
    let answer = "김서방은 " + index+"에 있다"
    return answer;
}