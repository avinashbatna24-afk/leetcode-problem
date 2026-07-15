class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max_ones = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            if(nums[i]!=1){
               
                c = 0;
            }
            max_ones = Math.max(c,max_ones);
        }
        return max_ones;
    }
}
