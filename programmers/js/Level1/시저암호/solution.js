function solution(str, n) {
    let result ='';
    for(let i = 0 ; i < str.length;i++){
        const char = str.charAt(i);
        let num = char.charCodeAt();
        //소문자
        if(97<= num && num<=122){
            num = 122 < num+n ? num+n-26 : num+n; 
            result += String.fromCharCode(num);
        }
        //대문자
        else if(65<=num && num<=90 ){
            num = 90 < num+n ? num+n-26 : num+n; 
            result += String.fromCharCode(num);
        }
        else{
            result += char;
        }
    }
    return result;
}