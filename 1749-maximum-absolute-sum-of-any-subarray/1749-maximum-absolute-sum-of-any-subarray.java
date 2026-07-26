class Solution {
    public int maxAbsoluteSum(int[] nums) {
         return Math.max(
            Math.abs(minss(nums)),
            Math.abs(maxss(nums))
        );
     }
    private int minss(int[]nums){
        int t=0,min=Integer.MAX_VALUE;
        for(int num:nums){
            t+=num;
            if(min>t)
            min=t;
            if(t>0)
            t=0;
        }
        return min;
    }
     private int maxss(int[]nums){
        int t=0,max=Integer.MIN_VALUE;
        for(int num:nums){
            t+=num;
            if(max<t)
            max=t;
            if(t<0)
            t=0;
        }
        return max;
}
}
