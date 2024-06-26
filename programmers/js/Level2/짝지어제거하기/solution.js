function solution(s)
{
    let arr = [];
    let top = '';
    for(let i = 0 ; i < s.length;i++){
        if(arr.length===0){
            arr.push(s[i]);
            top = s[i];
        }
        else{
            if(top===s[i]){
                arr.pop();
                if(arr.length!==0) top = arr[arr.length-1];
            }
            else{
                arr.push(s[i]);
                top = s[i];
            }
        }
    }
    let str =''
    for(let char of arr){
        str+=char;
    }
    
    const answer = str.length === 0 ? 1 : 0; 

    return answer;
}