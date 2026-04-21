class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combination(nums,target,l,0,curr,0);
        return l;
    }
    public static void combination(int[] nums,int target, List<List<Integer>> l,int i,List<Integer> curr,int total){
        if(total==target){
            l.add(new ArrayList(curr));
            return;
        }else if(target<total || i>=nums.length){
            return;
        }
        curr.add(nums[i]);
        combination(nums,target,l,i,curr,total+nums[i]);
        curr.remove(curr.get(curr.size()-1));
        combination(nums,target,l,i+1,curr,total);
    }
    
}
