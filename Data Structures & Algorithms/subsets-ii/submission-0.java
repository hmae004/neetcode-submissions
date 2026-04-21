class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        recurse(nums,res,0,l);
        return res;
    }
    public static void recurse(int[] nums,List<List<Integer>> res, int i,List<Integer> curr){
       if(i>=nums.length){
        res.add(new ArrayList<>(curr));
        return;
       }
       curr.add(nums[i]);
       recurse(nums,res,i+1,curr);
       curr.remove(curr.size()-1);
       while(i<nums.length-1 && nums[i+1]==nums[i]){
        i+=1;
       }
       recurse(nums,res,i+1,curr);
        
    }
}

