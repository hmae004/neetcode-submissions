class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        for(String s:strs){
            int[] arr = new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a'] +=1;
            }
            String x = Arrays.toString(arr);
            if(!h.containsKey(x)){
                h.put(x,new ArrayList<>());
            }
            h.get(x).add(s);
            
        }
        return new ArrayList<>(h.values());
    }
}
