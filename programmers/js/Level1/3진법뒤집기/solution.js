function solution(n) {
    let str = '';
    let Three = n.toString(3);
    for(let i = Three.length-1 ; i>=0;i--){
        str+= Three.charAt(i);
    }
    let answer = parseInt(str,3);
    return answer;
}