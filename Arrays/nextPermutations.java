class Solution {
    static void swap(int[] nums,int s,int j){
       int temp = nums[s];
       nums[s] = nums[j];
       nums[j] = temp;
    }
    static void reverse(int[]a,int s,int l){
        while(s<l){
            int temp = a[s];
            a[s] = a[l];
            a[l] = temp;
            s++;
            l--;
        }
    }
    public void nextPermutation(int[] nums) {
       int ind = -1;
       int n = nums.length;
       for(int i = n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            ind = i;
            break;
        }
       }
        if(ind == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i = n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
       } 
}
