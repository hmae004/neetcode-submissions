class Solution {
    public int trap(int[] height) {
        int sum = 0;
        for(int i=1;i<height.length-1;i++){
            int l = i-1;
            int r = i+1;
            int maxl = 0;
            int maxr = 0;
            while(l>=0){
                if(height[l]>maxl){
                    maxl = height[l];
                }
                l--;
            }
            while(r<height.length){
                if(height[r]>maxr){
                    maxr = height[r];
                }
                r++;
            }
            int amount = Math.min(maxl,maxr) - height[i];
            if(amount>0){
                sum += amount;
            }
        }
        return sum;
    }
}
