class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>=0;j--){
             if(nums[i]==-nums[j]){
                return nums[j];
            }
            } 
        }
        return -1;
    }
}