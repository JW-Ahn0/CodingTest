function solution(park, routes) {
    //E - 오른쪽 +
    //S - 밑으로 +
    //W - 왼쪽 - 
    //N - 위쪽 -
    let now = [0,0];
    let checkMap = new Map();
    for(let i = 0 ;  i< park.length;i++){
        for(let j = 0 ; j < park[i].length;j++){
            if(park[i][j]==='S'){
                now[0] = i;
                now[1] = j;
            }
            if(park[i][j]==='X'){
                checkMap.set(i+"-"+j,false);
            }
            else
                checkMap.set(i+"-"+j,true);
        }
    }
    for(let route of routes){
        let dir = route.split(" ")[0];
        let val = parseInt(route.split(" ")[1]);
        if(dir==='E'){
            now[1] = check(now,[now[0],now[1]+val],checkMap) ? now[1]+val : now[1]; 
        }
        else if(dir==='W'){
            now[1] = check(now,[now[0],now[1]-val],checkMap) ? now[1]-val : now[1]; 
        }
        else if(dir==='S'){
            now[0] = check(now,[now[0]+val,now[1]],checkMap) ? now[0]+val : now[0];
        }
        else if(dir==='N'){
            now[0] = check(now,[now[0]-val,now[1]],checkMap) ? now[0]-val : now[0];
        }
    }
    let answer = [now[0],now[1]];
    return answer;
}

function check(now,dest,checkMap){
    let x1 = now[0] < dest[0] ? now[0] : dest[0] ;
    let x2 = now[0] > dest[0] ? now[0] : dest[0];
    let y1 = now[1] < dest[1] ? now[1] : dest[1];
    let y2 = now[1] > dest[1] ? now[1] : dest[1];
    
    for(let i = x1 ; i<=x2;i++){
        for(let j = y1 ; j<=y2;j++){
            if(!checkMap.get(i+"-"+j))
                return false;
        }
    }    
    return true;
}