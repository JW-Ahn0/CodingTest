function solution(n, arr1, arr2) {
    var answer = [];
    for(let i = 0 ; i < n;i++){
        let str = getStr(arr1[i]|arr2[i],n);
        answer.push(str);
    }
    return answer;
}
function getStr(num,n){
    let str = num.toString(2);
    let result = '';
    for(let char of str.padStart(n,'0')){
        if(char==='1')
            result+='#';
        else
            result+=' ';
    }
    return result;
}