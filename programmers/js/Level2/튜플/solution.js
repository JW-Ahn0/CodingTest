function solution(s) {
    let set = new Set();
    let step1 = s.split("{{")[1];
    let step2 = step1.split("}}")[0];
    let step3 = step2.split("},{");
    let answer = [];
    step3.sort(function(a,b){
        return a.length - b.length;
    })
    for(let i =0 ; i < step3.length;i++){
        let str = step3[i].split(",");
        for(let j =0; j<str.length;j++){
            set.add(parseInt(str[j]));
        }
    }
    for(let num of set){
        answer.push(num);
    }
    
    return answer;
}