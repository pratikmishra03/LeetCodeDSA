class Solution {
    public int trap(int[] height) {
        int sum=0;
        int n=height.length;
        int left=0;
        int right=n-1;
        int MaxLeft=0;
        int MaxRight=0;
        while(left<=right){
        if(height[left]<=height[right]){
            if(height[left]>=MaxLeft){
                MaxLeft=height[left];
            }else{
                sum=sum+(MaxLeft-height[left]);
            }
            left++;
        }else{
            if(height[right]>=MaxRight){
                MaxRight=height[right];
            }else{
                sum=sum+(MaxRight-height[right]);
            }
            right--;
        }
        }   
        return sum;
    }
}