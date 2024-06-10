function solution(number, limit, power) {
    let answer = 0;
    for(let i =1 ; i <=number;i++){
        let nowPower = getCount(i,limit,power);
        answer +=nowPower;
    }
    return answer;
}
function getCount(number,limit,power){
    let set = new Set();
    let max = Math.sqrt(number);
    for(let i = 1; i <=max;i++){
        if(number%i==0){
            set.add(i);
            set.add(parseInt(number/i));
        }
        if(set.size > limit)
            return power;
    }
    return set.size;
}