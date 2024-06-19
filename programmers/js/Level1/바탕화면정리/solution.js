function solution(wallpaper) {
    let maxY = wallpaper.length; //(0~3)
    let maxX = wallpaper[0].length; //0~5
    let lux = maxY; let luy = maxX;
    let rdx = 0; let rdy = 0;
   
    for(let i = 0 ; i < wallpaper.length;i++){
        
        for(let j = 0 ; j<wallpaper[i].length;j++){
            if(wallpaper[i][j]==='#'){
                luy = luy > j ? j : luy ;
                lux = lux > i ? i : lux ;
                
                rdx = rdx < i ? i : rdx ;
                rdy = rdy < j ? j : rdy ;
            }
        }
    }
    var answer = [lux,luy,rdx+1,rdy+1];
    return answer;
}