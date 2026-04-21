class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen!=tlen){
            return false;
        }
        int arr[] = new int[26];
        for(int i=0;i<slen;i++){
            arr[s.charAt(i)-'a'] += 1;
            arr[t.charAt(i)-'a']-=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;

            }
        }
        return true;
    }
}
