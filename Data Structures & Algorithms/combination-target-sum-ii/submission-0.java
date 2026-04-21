class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        recurse(candidates,res,target,0,curr,0);
        return res;
    }
    public static void recurse(int[] candidates,List<List<Integer>> res,int target,int i,List<Integer> curr,int sum){
    
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target || i>=candidates.length){
            return;
        }
        curr.add(candidates[i]);
        recurse(candidates,res,target,i+1,curr,sum+candidates[i]);
        curr.remove(curr.size()-1);
        while(i+1<candidates.length && candidates[i+1]==candidates[i]){
            i+=1;
        }
        recurse(candidates,res,target,i+1,curr,sum);
    }
}
