class Solution {
    public int strStr(String haystack, String needle) {
        int ind = 0;
        while(haystack.length()!=0){
            if(haystack.startsWith(needle)){
                return ind;
            }
            haystack = haystack.substring(1);
            ind++;
        }
        return -1;
    }
}