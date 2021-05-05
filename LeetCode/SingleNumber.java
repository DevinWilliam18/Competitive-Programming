class Solution {
    public int singleNumber(int[] nums){
        
        int hasil = 0;
        int params;
        
            if(nums.length == 1){
                hasil = nums[0];
            }
            else if(nums.length <= 30000 && nums.length >= 1)
            {
                label:
                for (int i = 0; i < nums.length; i++) {
                    params = 0;
                    if (nums[i] >= -30000 && nums[i] <= 30000) {
                        for (int j = i+1; j < nums.length; j++) {
                            if (i == 0) {
                                if (nums[i] != nums[j]) {
                                    params++;
                                    if (params == nums.length - 1) {
                                        hasil = nums[i];
                                        break label;
                                    }
                                }
                            }else{
                                if (nums[i] != nums[j]) {
                                    params++;
                                    if (params == nums.length -1) {
                                        hasil = nums[i];
                                        break label;
                                    }
                                }
                            }
                        }
                        for (int z = i - 1; z>=0; z--) {
                                if (nums[i] != nums[z]) {
                                    params++;
                                    if (params == nums.length - 1) {
                                        hasil = nums[i];
                                        break label;
                                    }
                                }
                        }
                    }
                }
            }
        return hasil;
        
    }
}
