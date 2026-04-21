class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int first = 0;
        int second = 1;
        int l = nums.length-1;
        while(first!=l){
            if(nums[first]+nums[second]==target){
                break;
            }
            if(second==l){
                first++;
                second = first+1;
                continue;
            }
            second++;
        }
        res[0] = first;
        res[1] = second;
        return res;
    }
}
