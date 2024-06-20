function solution(sizes) {
    let bigList = [];
    let smallList =[];
    for(let i = 0 ; i < sizes.length;i++){
        let a = sizes[i][0];
        let b = sizes[i][1];
        if(a<b){
            bigList.push(b);
            smallList.push(a);
        }
        else{
            bigList.push(a);
            smallList.push(b);            
        }
    }
    bigList.sort(function(a,b){
        return b-a;
    })
    smallList.sort(function(a,b){
        return b-a;
    })
    let answer = bigList[0]*smallList[0];
    return answer;
}