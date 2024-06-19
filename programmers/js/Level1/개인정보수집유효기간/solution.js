function solution(today, terms, privacies) {
    let date =new Date(today);    
    let map = new Map();
    let answer = [];
    for(let term of terms){
        let arr = term.split(" ");
        map.set(arr[0],parseInt(arr[1]));
    }
    for(let i = 0 ; i < privacies.length;i++){
        let arr = privacies[i].split(" ");
        let val = map.get(arr[1]);
        let dDay = arr[0].split(".");
        
        let day = parseInt(dDay[2])-1 < 1 ? 28 : parseInt(dDay[2])-1;
        let dayCarry = parseInt(dDay[2])-1 < 1 ? -1 : 0 ;
        
        let monthSum = parseInt(dDay[1]) +val +dayCarry; 
        let month = 0;
        let monthCarry = 0;
        if(monthSum > 12){
            if(monthSum % 12 ===0){
                month = monthSum - 12*(parseInt(monthSum/12)-1)
                monthCarry = parseInt(monthSum/12)-1;
            } 
            else{
                month = monthSum - 12*parseInt(monthSum/12);
                monthCarry = parseInt(monthSum/12);
            }
        }
        else
            month = monthSum;
        
        let year = parseInt(dDay[0])+monthCarry;
        
        let untilDay = new Date(year+"."+month+"."+day);
        if(untilDay < date) answer.push(i+1);
    }
    
    return answer;
}