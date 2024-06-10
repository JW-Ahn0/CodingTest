function solution(numbers) {
    let set = new Set();
    for(let i = 0 ; i <numbers.length-1;i++){
        for(let j = i+1;j<numbers.length;j++){
            set.add(numbers[i]+numbers[j]);
        }
    }
    let arr = [...set];
    arr.sort(function(a,b){
       return a-b; 
    });
    return arr;
}