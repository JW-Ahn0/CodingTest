function solution(dartResult) { 
    //1S*2T*3S
    // 현재 가리키는 포인터 있음
    // S,D,T 이면 그 전 것 들 substring으로 뽑아서 숫자로 만들어서 배열에 넣는다.
    // 그러고 S,D,T에 따라 값 곱해준다. 그리고 그 다음 *,#이 있으면 그거에 따라 핸들링 해준다.
    
    let index = 0;
    let arr = [];
    let p = 0;
    let e = 0;
    let sum = 0;
    let isNumber = true;
    for(let i = 0 ; i <dartResult.length;i++){
        let char = dartResult[i];
        if('0' <= char && char <='9'){
            if(!isNumber) {
                isNumber = true ;
                index++;
                p = i;
                e = i;
            }
            e++;
        }
        else{
            if(isNumber) isNumber = false;
            if(char ==='S' || char ==='D' || char ==='T'){
                let num = parseInt(dartResult.substring(p,e));
                if(char ==='S') arr.push(num);
                if(char ==='D') arr.push(num*num);
                if(char ==='T') arr.push(num*num*num);
            }
            else if(char ==='#'){
                arr[index] = -arr[index];
            }
            else if(char ==='*'){
                if(index ===0){
                    arr[index] = arr[index] *2;
                }
                else{
                    arr[index-1] = arr[index-1] *2;
                    arr[index] = arr[index] *2;
                }
            }
        }

    }
    var answer = arr[0] + arr[1] + arr[2];
    return answer;
}