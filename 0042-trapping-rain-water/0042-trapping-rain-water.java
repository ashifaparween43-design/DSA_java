class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int  left_max=height[left];
        int right_max=height[right];

        while(left<right){
            if(height[left]< height[right]){
                left++;
                left_max=Math.max(left_max,height[left]);
                water+=left_max-height[left];

            }
            else{
                right--;
                right_max=Math.max(right_max,height[right]);
                water+= right_max-height[right];
            }
        }
        return water;
    }
}