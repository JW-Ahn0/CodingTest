function solution(s) {
    var answer = '';
    const arr = s.split(' ');
    
    var min = Math.min(...arr);
    var max = Math.max(...arr);
    answer =min +' ' + max;
    return answer;
}