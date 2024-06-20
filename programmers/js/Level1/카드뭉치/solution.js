function solution(cards1, cards2, goal) {
    let p1 = 0;
    let p2 = 0;
    for(let i = 0 ; i < goal.length;i++){
        let str = goal[i];
        if(str===cards1[p1]){
            p1++;
        }
        else if(str===cards2[p2]){
            p2++;
        }
        else{
            return "No";
        }
    }
    return "Yes";
}