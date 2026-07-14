class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev=0;
        while(x!=0){
            rev = rev*10+x%10;
            x = x/10;
        }
        if(rev == n && n>=0){
            return true;
        }
        return false;
    }
}
