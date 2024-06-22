function solution(str1, str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    let arr1 = [];
    let answer = 0;
    //합집합 
    let sum = [];
    //교집합
    let same =[];
    for(let i = 0 ; i < str1.length-1;i++){
        let temp = str1.substring(i,i+2);
        if(isValid(temp)){
           arr1.push(temp);
        }
    }
    
    let map = new Map();
    for(let i = 0 ; i< str2.length-1;i++){
        let temp = str2.substring(i,i+2);
        if(isValid(temp)){
            if(map.get(temp) ===undefined){
                map.set(temp,1);
            }
            else{
                map.set(temp,map.get(temp)+1);
            }
        }
    }
    for(let str of arr1){
        if(map.get(str)===undefined){
            sum.push(str);
        }
        else if(map.get(str)>0){
            map.set(str,map.get(str)-1);
            sum.push(str);
            same.push(str);
        }
        else{
            sum.push(str);
        }
    }
    for(let key of map.keys()){
        if(map.get(key)>0){
            let n = map.get(key);
            for(let i= 0; i <n;i++){
                sum.push(key);
            }
        }
    }
    if(sum.length ===0 && same.length===0){
        answer= 1;
    }
    else{
        answer = same.length / sum.length;
    }
    return parseInt(answer*65536);
}

function isValid(str){
    for(let ch of str){
       if( !('a'<= ch && ch <='z'))
           return false;
    }
    return true;
}