class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int f = 0;
        int l=heights.length-1;
        while(f<l){
            int val = (l-f)*Math.min(heights[f],heights[l]);
            if(max<val){
                max = val;
            }
            if(heights[f]>heights[l]){
                l--;
            }else{
                f++;
            }
        }
        return max;
    }
}
