class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        int tmp;
        for (int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int k=0;k<nums.length-1;k++){
            if(k[i]==k[i+1]){
                return true;
            }
        }
        return false;
    }
}