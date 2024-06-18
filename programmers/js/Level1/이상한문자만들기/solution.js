function solution(s) {
    let arr = s.split(' ');
    let answer = '';
    for(let i = 0 ;  i < arr.length;i++){
        answer += convertStr(arr[i]);
        if(i!=arr.length-1)
            answer+=' ';
    }
 
    return answer;
}
function convertStr(str){
    let result = '';
    for(let i =0;i<str.length;i++){
        if(i%2==0)
            result += str.charAt(i).toUpperCase();
        else
            result += str.charAt(i).toLowerCase();
    }
    return result;
}