function solution(priorities, location) {
    let arr =[];
    let cnt=0
    for( let i = 0 ; i<priorities.length; i++){
        arr.push(i);

    }
    let temp = priorities;
    while(temp.length!==0){
        let t= temp[0]
        let num = arr[0]
        temp.splice(0,1);
        arr.splice(0,1);
        if(check(temp,t)){
           if(num===location)
               return cnt+1;
            cnt++;
        }
        else{
            temp.push(t)
            arr.push(num)
        }
    }

    var answer = 0;
    return answer;
}
function check(temp,t){
    for(let order of temp){
        if( order > t) return false
    }
    return true;
}    
    