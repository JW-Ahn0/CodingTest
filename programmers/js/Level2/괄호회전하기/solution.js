function solution(s) {
    var answer = 0;
    for(let i = 0 ; i <s.length;i++){
        if(isOk(s)) answer++;
        s = s.substring(1,s.length)+s.substring(0,1);
    }
    return answer;
}
function isOk(str){
    let arr = [];
    
    for(let char of str){
        if(char==='(' || char==='[' || char ==='{'){
            arr.push(char);
        } 
        else if(char===')'){
            if(arr.length > 0 && arr[arr.length-1] ==='('){
                arr.pop();
            }
            else{
                return false;
            }
        }
        else if(char===']'){
            if(arr.length > 0 && arr[arr.length-1] ==='['){
                arr.pop();
            }
            else{
                return false;
            }
        }
        else if(char==='}'){
            if(arr.length > 0 && arr[arr.length-1] ==='{'){
                arr.pop();
            }
            else{
                return false;
            }
        }        
    }
    if(arr.length > 0) return false;
    return true;
}