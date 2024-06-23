function solution(k, tangerine) {
    let map = new Map();
    let set = new Set();
    for(let num of tangerine){
        if(map.get(num)===undefined){
            map.set(num,1);
        }
        else{
            map.set(num,map.get(num)+1);
        }
        set.add(num);
    }
    let arr = [];
    for(let num of set){
        arr.push(num);
    }
    arr.sort(function(a,b){
        return map.get(b) - map.get(a);
    })
    let now =0;
    let cnt = 0;
    let answer = 0;
    for(let num of arr){
        if(now+map.get(num)>=k){
            answer = cnt+1
            break;
        }
        else{
            now += map.get(num);
            cnt++;
        }
    }
    
    return answer;
}