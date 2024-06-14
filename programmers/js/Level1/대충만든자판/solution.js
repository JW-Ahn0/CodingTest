function solution(keymap, targets) {
    let map = new Map();
    let answer = [];
    for(const str of keymap){
        for(let i = 0 ; i < str.length;i++){
            if(map.get(str[i])===undefined || i+1<map.get(str[i])){
                map.set(str[i],i+1);
            }
        }
    }
    for(const str of targets){
        let cnt = 0 ;
        let isExist = true ;
        for(let i = 0 ; i < str.length;i++){
            if(map.get(str[i])===undefined){
                isExist = false;
                break;
            }
            else{
                cnt += map.get(str[i]);
            }
        }
        if(isExist)
            answer.push(cnt);
        else
            answer.push(-1);
        
    }
    return answer;
}