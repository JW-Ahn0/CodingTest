function solution(n)
{
    let ans = 0;
    let temp = n;
    while(temp!==1){
        if(temp%2===0)
            temp = temp/2;
        else{
            ans++;
            temp = temp-1;
        }
    }
    ans++;
    return ans;
}