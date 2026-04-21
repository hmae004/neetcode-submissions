class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f = 0;
        int s = 1;
        while(f<numbers.length){
            if(numbers[f]+numbers[s]==target){
                return new int[]{f+1,s+1};
            }
            if(s==numbers.length-1){
                f++;
                s=f+1;
            }else{
                s++;
            }
        }
        return null;
    }
}
