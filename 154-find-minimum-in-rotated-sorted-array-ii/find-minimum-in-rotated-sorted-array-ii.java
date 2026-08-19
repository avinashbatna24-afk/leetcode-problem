class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = 5001;
        while(low<=high){
            int mid = (low+high)/2;
            ans = Math.min(ans,nums[mid]);
            if(low!=high && nums[low] == nums[mid] && nums[mid] == nums[high]){
                ans = Math.min(ans,nums[low]);
                low = low+1;
                high = high -1;
                continue;
            }
            // if(nums[low]<=nums[high]){
            //     ans = Math.min(ans,nums[low]);
            //     break;
            // } 
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high =mid -1;
            }
        }
        return ans;
    }
}