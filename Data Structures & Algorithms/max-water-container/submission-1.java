class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int l = heights.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int val = (j-i)*Math.min(heights[i],heights[j]);
                System.out.println(val);
                if(val>max){
                    max = val;
                }
            }
        }
        return max;
    }
}
