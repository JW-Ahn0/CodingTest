function solution(a, b) {
    let small,big;
    if(a < b){
        big = b;
        small = a;
    }
    else{
        big = a;
        small = b;
    }
    
    let Big = big*(big+1) / 2 ;
    let Small = (small-1)*small / 2; 
    
    let answer = Big - Small;
    return answer;
}