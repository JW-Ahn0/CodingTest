function solution(new_id) {
    let step1 = new_id.toLowerCase();
    let step2 = '';
    for(let i = 0 ; i <step1.length;i++){
        let char = step1[i];
        if('a' <= char && char <= 'z') step2+=char;
        if('0'<=char && char <='9') step2 +=char;
        if(char==='-' || char==='_' || char==='.') step2 +=char;
    }
    let step3 = step2.replace(/\.+/g,'.');
    let step4 = '';
    for(let i = 0 ; i < step3.length;i++){
        if( (i===0 || i===step3.length-1) && step3[i]==='.')
            ;
        else
            step4 +=step3[i];
    }
    
    let step5 ='';
    if(step4==='') step5+='a';
    else step5 = step4;
    
    let step6Temp ='';
    let step6 ='';
    if(step5.length>=16) step6Temp = step5.substring(0,15);
    else step6Temp = step5;
    
    for(let i = 0 ; i < step6Temp.length;i++){
        if( (i===0 || i===step6Temp.length-1) && step6Temp[i]==='.')
            ;
        else
            step6 +=step6Temp[i];        
    }
    let step7 = step6;
    if(step7.length<=2){
        while(step7.length!==3)
            step7 += step6[step6.length-1];
    }
    var answer = step7;
    return answer;
}