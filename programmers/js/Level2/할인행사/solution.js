function solution(want, number, discount) {
    var answer = 0;
    let max = discount.length-10;
    for(let i = 0 ; i <=max;i++){
        if(isOk(want,number,discount,i)) {
            answer++;
        }
    }
    return answer;
}
function isOk(want,number,discount,index){
    let map = new Map();
    let cnt = 10;
    for(let i = 0 ; i < want.length;i++){
        map.set(want[i],number[i]);
    }
    for(let i = index ; i < index+10;i++){
        if(map.get(discount[i])===undefined) return false;
        else if(map.get(discount[i]) >0){
                map.set(discount[i],map.get(discount[i]) -1);
                cnt--;
        }
        else return false;
    }
    if(cnt===0) return true;
    return false;
}