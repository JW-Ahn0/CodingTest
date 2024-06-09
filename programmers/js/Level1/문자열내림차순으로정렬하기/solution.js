function solution(s) {
    let answer = '';
    let arr = [];
    for(let i = 0 ; i < s.length;i++){
        arr.push(s.charAt(i));
    }
    arr.sort(function (a,b){
      if (a > b) return -1;
      if (a < b) return 1;
      return 0;        
    });
    for(let i = 0 ; i < arr.length;i++){
        answer+=arr[i];
    }
    return answer;
}