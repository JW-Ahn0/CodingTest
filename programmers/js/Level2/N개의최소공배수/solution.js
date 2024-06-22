function solution(arr) {
    arr.sort(function(a,b){
        return a-b;
    })
    let a = arr[0];
    
    for(let i = 1; i<arr.length;i++){
        let temp = max(arr[i],a);
        a = a*arr[i]/temp;
    }
    return a;
}
function max(a,b){
    if(a%b===0) return b;
    return max(b,a%b);
}