class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
        
        for (int a = 0; a < nums.length - 2; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue; // Skip duplicate values for `a`
            int b = a + 1;
            int c = nums.length - 1;
            while (b < c) {
                int sum = nums[a] + nums[b] + nums[c];
                if (sum < 0) {
                    b++;
                } else if (sum > 0) {
                    c--;
                } else {
                    res.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    b++;
                    c--;
                    while (b < c && nums[b] == nums[b - 1]) b++; // Skip duplicate values for `b`
                    while (b < c && nums[c] == nums[c + 1]) c--; // Skip duplicate values for `c`
                }
            }
        }
        return res;
    }
}
