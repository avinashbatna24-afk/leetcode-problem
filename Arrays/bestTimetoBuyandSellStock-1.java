class Solution {
    public int maxProfit(int[] a) {
        int maxP = 0;
        int mini = a[0];
        for(int j = 1;j<a.length;j++){
            int cost = a[j] - mini;
            maxP = Math.max(maxP,cost);
            mini = Math.min(mini,a[j]);
        }
        return maxP;
    }
}
