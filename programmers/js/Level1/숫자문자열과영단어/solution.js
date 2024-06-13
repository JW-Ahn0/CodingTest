function solution(s) {
    const arr = ["zero","one","two","three","four","five","six","seven","eight","nine"];
    for(let i = 0 ; i < arr.length;i++){
        let n = i;
        let index = s.indexOf(arr[i]);
        if(index!=-1){
            s = s.substring(0,index) + n + s.substring(index+arr[i].length,s.length);
        }
    }
    
    return parseInt(s);
}