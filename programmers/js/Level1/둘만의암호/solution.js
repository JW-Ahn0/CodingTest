function solution(s, skip, index) {
    let arr =[];
    let skipMap = new Map();
    let orderMap = new Map();
    var answer = '';
    for(let i = 0 ; i <26;i++){
        arr.push(String.fromCharCode(97+i));
        skipMap.set(String.fromCharCode(97+i),false);
        orderMap.set(String.fromCharCode(97+i),i);
    }
    for(let i= 0 ; i < skip.length;i++){
        let char = skip[i];
        skipMap.set(char,true);
    }
    for(let i = 0 ; i <s.length;i++){
        let char = s[i];
        let order = orderMap.get(char);
        let cnt = index;
        while(cnt>0){
            order++;
            if(order > 25) order =0;
            if(skipMap.get(arr[order])) continue; 
            cnt--;
        }
        answer+=arr[order];
    }
    
    return answer;
}