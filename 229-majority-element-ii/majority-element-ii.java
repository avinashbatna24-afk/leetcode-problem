class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0,c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(c1 == 0 && el2!=nums[i]){
                c1 = 1;
                el1= nums[i];
            }
            else if(c2 == 0 && el1!=nums[i]){
                c2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) c1++;
            else if(el2 == nums[i]) c2++;
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> li = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(el1 == nums[i]) c1++;
            if(el2 == nums[i]) c2++;

        }
        int min = (int)(nums.length/3);
        if(c1>min) li.add(el1);
        if(el1 != el2 && c2>min) li.add(el2);
        Collections.sort(li);
        return li;

    }
}