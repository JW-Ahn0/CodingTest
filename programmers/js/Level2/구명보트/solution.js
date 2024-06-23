function solution(people, limit) {
    people.sort(function(a,b){
        return a-b;
    })
    let p1 =0;
    let p2 =people.length-1;
    let boatCnt = 0 ;
    while(p1<=p2){
        if(people[p1]+people[p2]<=limit){
            boatCnt++;
            p1++;
            p2--;
        }
        else{
            p2--;
            boatCnt++;
        }
    }
    return boatCnt;
}