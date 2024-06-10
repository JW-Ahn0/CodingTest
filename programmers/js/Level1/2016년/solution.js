function solution(a, b) {
    let dayArr = ['THU','FRI','SAT','SUN','MON','TUE','WED'];
    let lastDayArr = [0,31,29,31,30,31,30,31,31,30,31,30,31];
    let daySum = 0;
    for(let i = 0 ; i < a;i++){
        daySum+= lastDayArr[i];
    }
    let answer = dayArr[(daySum+b)%7];
    
    return answer;
}