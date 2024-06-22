function solution(msg) {
    let arr =['0'];
    let map = new Map();
    for(let i = 0 ; i < 26;i++){
        let code = 'A'.charCodeAt()+i;
        arr.push(String.fromCharCode(code));
        map.set(String.fromCharCode(code),i+1);
    }
    let i = 0 ;
    let answer = [];
    while(i<msg.length){
        if(i===msg.length-1){
            answer.push(map.get(msg.substring(i,i+1)));
            break;
        }
        let j = i+1;
        let str = msg.substring(i,j);
        let pre = str;
        let Exist = false;
        while(map.get(str)!==undefined){           
            pre = str;
            j++;
            if(j>msg.length){
                Exist = true;
                break; 
            }            
            str = msg.substring(i,j);
        }
        if(Exist) {
            answer.push(map.get(pre));
            break;
        }
        answer.push(map.get(pre));
        let n = arr.length;
        map.set(str,n);
        arr.push(str);
        
        i = j-1;
    }
    return answer;
}