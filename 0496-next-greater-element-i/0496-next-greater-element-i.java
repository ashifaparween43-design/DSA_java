class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n=nums1.length;

       ArrayList <Integer> ans =new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
        ans.add(-1);
       }
       Stack <Integer> stack=new Stack<>();
       for(int i=nums2.length-1;i>=0;i--){

        while(!stack.isEmpty() && stack.peek()<=nums2[i]){
            stack.pop();
        }
        for (int j = 0; j < nums1.length; j++) {

                if (nums1[j] == nums2[i]) {

                    if (!stack.isEmpty()) {
                        ans.set(j, stack.peek());
                    }

                    break;
                }
            }

            stack.push(nums2[i]);
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}