function solution(numbers, hand) {
    let numberPad = [[1,2,3],[4,5,6],[7,8,9],[11,0,12]];
    //번호에 따른 L,R,M 리턴하는 맵
    let handMap = new Map();
    let answer = '' ;
    //초기 위치
    let leftHand = [3,0];
    let rightHand = [3,2];
    
    let map = new Map();
    for(let i = 0 ; i < numberPad.length;i++){
        for(let j = 0; j < numberPad[i].length;j++){
            let num = numberPad[i][j];
            map.set(num,[i,j]);
        }
    }
    let lArr = [1,4,7];
    let rArr = [3,6,9];
    let mArr = [2,5,8,0]
    for(let i = 0 ; i<10;i++){
        if(lArr.includes(i))
            handMap.set(i,"L");
        else if(rArr.includes(i))
            handMap.set(i,"R");
        else
            handMap.set(i,"M");
    }
    
    for(let number of numbers){
        if(handMap.get(number)==="L"){
            leftHand = map.get(number);
            answer+=handMap.get(number);
        }
        else if(handMap.get(number)==="R"){
            rightHand = map.get(number);
            answer+=handMap.get(number);
        }
        else{
            let obj = map.get(number);
            let disL = Math.abs(leftHand[0] - obj[0]) + Math.abs(leftHand[1]-obj[1]);
            let disR = Math.abs(rightHand[0]-obj[0])  + Math.abs(rightHand[1]-obj[1]);
            //거리가 똑같은 경우
            if(disL===disR){
                //오른손잡이인 경우
                if(hand==="right"){
                    answer+="R";
                    rightHand = map.get(number);
                }
                //왼손잡이인 경우 
                else{
                    answer+="L";
                    leftHand = map.get(number);
                }
            }
            //거리 작은 쪽을 이동
            else{
                
                if(disL<disR){
                    leftHand = map.get(number);
                }
                else{
                    rightHand = map.get(number);
                }
                answer += disL<disR ? "L" : "R";
            }
        }
    }
    return answer;
}