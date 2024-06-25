function solution(clothes) {
    let map = new Map();
    for(let i = 0 ; i< clothes.length;i++){
        if(map.get(clothes[i][1])===undefined){
            map.set(clothes[i][1],1);
        }
        else{
            map.set(clothes[i][1],map.get(clothes[i][1])+1);
        }
    }
    let ans = 1;
    for(let key of map.keys()){
        ans *= map.get(key)+1;
    }
    
    return ans-1;
}