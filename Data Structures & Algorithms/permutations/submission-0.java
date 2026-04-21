class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        perm(nums,res,subset);
        return res;
    }
    public static void perm(int[] nums,List<List<Integer>> res,List<Integer> subset){
        if(subset.size()==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(subset.contains(nums[i]))continue;
            subset.add(nums[i]);
            perm(nums,res,subset);
            subset.remove(subset.size()-1);
        }
    }
}
