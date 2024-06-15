function solution(n) {
    let check = [];
    let answer = 0;
    //0
    check.push(false);
    //1
    check.push(false);
    for(let i=2;i<=n;i++){
        check.push(true);
    }
    for(let i =2 ; i<=n;i++){
        if(check[i]){
            answer++;
            fillSosu(check,i,n);
        }
    }
    return answer;
}
function fillSosu(check,n,max){
    let temp = n;
    for(let i = 2 ; temp <=max ;i++){
        
        temp = n*i;
        check[temp] = false;
    }
}