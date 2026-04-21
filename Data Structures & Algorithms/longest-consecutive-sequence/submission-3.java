class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        System.out.println(arr);
        int max = 1;
        int count = 1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)+1==arr.get(i+1)){
                count++;
            }else{
                count=1;
            }
            if(max<count){
                max= count;
            }
        }
        return max;
    }
}
