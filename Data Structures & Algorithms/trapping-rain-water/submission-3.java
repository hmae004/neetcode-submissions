class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int l =1;
        int r = height.length-2;
        int maxl = height[0];
        int maxr = height[height.length-1];
        while(l<=r){
            if(maxl<maxr){
                int water = maxl-height[l];
                if(water>0){
                    sum+=water;
                }
                if(height[l]>maxl){
                    maxl = height[l];
                }
                l++;
            }else{
                int water = maxr-height[r];
                if(water>0){
                    sum+=water;
                }
                if(height[r]>maxr){
                    maxr = height[r];
                }
                r--;
            }
        }
        return sum;
    }
}
