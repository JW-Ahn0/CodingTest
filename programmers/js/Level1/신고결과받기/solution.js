function solution(id_list, report, k) {
    
    let map = new Map();
    let cntMap = new Map();
    let answer = [];
    for(let id of id_list){
        let set = new Set();
        map.set(id,set);
        cntMap.set(id,0);
    }
    for(let i = 0 ; i < report.length;i++){
        let s = report[i].split(" ")[0];
        let p = report[i].split(" ")[1];
        let set = map.get(p);
        set.add(s);
    }
    for(let id of id_list){
        let set = map.get(id);
        if(set.size>=k){
            for(let r of set){
                cntMap.set(r,cntMap.get(r)+1);
            }
        }
    }
    for(let id of id_list){
        answer.push(cntMap.get(id));
    }
    
    return answer;
}