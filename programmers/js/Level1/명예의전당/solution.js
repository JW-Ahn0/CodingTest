function solution(k, score) {
    var answer = [];
    let arr =[];
    for(let i =0; i < score.length;i++){
        let index = 0 ;
        if(i<k){
            arr.push(score[i]);
            index = min(arr);            
        }

        else{
            index = min(arr);
            if(score[i]>arr[index]){
                arr[index] = score[i];
                index = min(arr);
            }
        }
        answer.push(arr[index]);
    }
    return answer;
}
function min(arr){
    let num = arr[0];
    let index = 0 ;
    for(let i =1 ; i <arr.length;i++){
        if(num > arr[i]){
            num  =arr[i];
            index = i;
        }
    }
    return index;
}