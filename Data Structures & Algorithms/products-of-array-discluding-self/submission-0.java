class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p = 1;
        int res[] = new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            p*=nums[i-1];
            res[i] = p;
        }
        
        int pr = 1;
        for(int i=nums.length-2;i>-1;i--){
            pr*=nums[i+1];
            res[i] *=pr;
        }
        
        return res;
    }
}  
