function getSecondLargest(nums) {
    const count = nums.length;
    for(let i = 0; i < count; i++){
        for(let j = i+1; j < count; j++){
            if(nums[i]>nums[j]){
                let temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
   
    for(let c = count-1; c > 0; c--){
        if((nums[c-1] < nums[c]))
        {
            const secondL = nums[c-1];
            return secondL;
            break;
        }
    }
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
