function solution(nums) {
    let max = nums.length/2;
    let set = new Set();
    for(let i= 0; i<nums.length;i++){
        set.add(nums[i]);
    }
    return max <=set.size ?max : set.size;
}