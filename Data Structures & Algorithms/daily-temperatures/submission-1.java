class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> s = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int t = temperatures[i];
            while(!s.isEmpty() && t>s.peek()[0]){
                res[s.peek()[1]] = i-s.peek()[1];
                s.pop();
            }
            s.push(new int[]{t,i});
        }
        return res;
    }
}
