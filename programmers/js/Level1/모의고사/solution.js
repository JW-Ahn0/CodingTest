function solution(answers) {
    let p1 = [1, 2, 3, 4, 5];
    let p2 = [2, 1, 2, 3, 2, 4, 2, 5];
    let p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let c1 =0,c2 =0,c3 =0;
    let s1 =0,s2 =0,s3 =0;
    for(let i= 0 ; i<answers.length;i++){
        let answer = answers[i];
        if(p1[c1]===answer) s1++;
        if(p2[c2]===answer) s2++;
        if(p3[c3]===answer) s3++;
        c1 = c1+1 > p1.length-1 ? 0 : c1+1;
        c2 = c2+1 > p2.length-1 ? 0 : c2+1;
        c3 = c3+1 > p3.length-1 ? 0 : c3+1;
    }
    let max = Math.max(s3,Math.max(s1,s2));
    let answer =[];
    if(max===s1) answer.push(1);
    if(max===s2) answer.push(2);
    if(max===s3) answer.push(3);
    return answer;
}