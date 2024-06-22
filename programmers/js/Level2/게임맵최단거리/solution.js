function solution(maps) {
    let visited = [];
    let dirY= [-1,1,0,0]
    let dirX = [0,0,-1,1];
    
    for(let i = 0 ; i <maps.length;i++){
        let arr = [];
        for(const a of maps[i]){
            arr.push(false);
        }
        visited.push(arr);
    }
    
    let queue = [[0,0,1]];
    let n = maps.length;
    let m = maps[0].length;
    let answer = -1;
    while(queue.length!==0){
        let temp = queue[0];
        queue.splice(0,1);
        if(visited[temp[0]][temp[1]]) continue;
        visited[temp[0]][temp[1]] = true;
        if(temp[0]===n-1 && temp[1] ===m-1){
            answer = temp[2];
            break;
        } 
        for(let i = 0 ; i < 4;i++){
            let dy = temp[0]+dirY[i];
            let dx = temp[1]+dirX[i];
            if(0<=dy && dy < n && 0<= dx && dx < m && maps[dy][dx]!==0){
                queue.push([dy,dx,temp[2]+1]);
            }
        }
    }
    
    return answer;
}