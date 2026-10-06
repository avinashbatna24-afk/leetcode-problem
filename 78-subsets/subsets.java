class Solution {
    public static int checkKB(int n,int k){
        return (n&(1<<k))!=0?1:0;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();

        for(int i = 0;i<(1<<nums.length);i++){
            List<Integer> l = new ArrayList<>();
            // for(int j = 0;j<nums.length;j++){
            //     if(checkKB(i,j) == 1){
            //         l.add(nums[j]);
            //     }
            // }
            int k = i;
            int b = 0;
            while(k>0){
                if((k&1) == 1){
                    l.add(nums[b]);
                }
                k>>=1;
                b++;
            }
            li.add(l);
        }
        return li;
    }
}