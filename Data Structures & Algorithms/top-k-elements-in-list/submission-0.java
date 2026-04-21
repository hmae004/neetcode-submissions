class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums){
            if(!h.containsKey(i)){
                h.put(i,0);
            }
            int n = h.get(i);
            h.put(i,n+1);
        }
        System.out.println(h);
        int res[] = new int[k];
        int j=0;
        
        for(int n=0;n<k;n++){
            int max = 0;
            int index = 0;
            for(int i:h.keySet()){
                if(max<h.get(i)){
                    max = h.get(i);
                    index = i;
                }
            }
            System.out.println(index);
            res[j] = index;
            j++;
            h.remove(index);
        }
        
        
        return res;
    }
}
