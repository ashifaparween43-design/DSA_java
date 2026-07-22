class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
         int left=0, right=0;
         long sum=0, max=0;
         Map<Integer,Integer>map=new HashMap<>();
         while(right<n){
            sum=sum+nums[right];
            int idx= map.getOrDefault(nums[right],-1);

            while(left<=idx || (right-left+1>k)){
                sum=sum-nums[left];
                left=left+1;
            }
            if(right-left+1==k){
                max=Math.max(max,sum);

            }
            map.put(nums[right],right);
            right=right+1;

         }
         return max;
    }
}