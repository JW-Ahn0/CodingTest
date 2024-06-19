function solution(bandage, health, attacks) {
    let nowHP = health;
    let atkIndex = 0;
    let maxTime = attacks[attacks.length-1][0];
    let nextatackTime = attacks[atkIndex][0];
    let successAgain = 0;
    for(let i = 0 ; i <=maxTime;i++){
        if(i===nextatackTime){
            nowHP-= attacks[atkIndex][1];
            successAgain = 1;
            atkIndex++;
            if(atkIndex < attacks.length){
                nextatackTime = attacks[atkIndex][0];
            }
            if(nowHP<=0) return -1;
        }
        else{
            if(successAgain===bandage[0]){
                nowHP+= bandage[2];
                successAgain = 0;
            }
            nowHP+= bandage[1];
            if(nowHP >=health) nowHP = health;
            successAgain++;
                 
        }

        
    }
    return nowHP;
}