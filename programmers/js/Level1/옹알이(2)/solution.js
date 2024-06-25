function solution(babbling) {
    let answer = 0;
    let pre = '';
    let arr = ["aya", "ye", "woo", "ma"];
    for(let i = 0 ; i < babbling.length;i++){
        let str = babbling[i];
        let temp = '';
        let pre = '';
        let isSameWithPre = false;
        for(let j = 0 ; j <str.length;j++){
            temp+=str[j];
            if(arr.includes(temp)){
                if(pre===temp) {
                    isSameWithPre = true;
                    break;
                }
                pre = temp;
                temp = '';
            }
            else{
                
            }
        }
        if(!isSameWithPre && temp===''){
            answer++;
        }        
    }
    
    return answer;
}