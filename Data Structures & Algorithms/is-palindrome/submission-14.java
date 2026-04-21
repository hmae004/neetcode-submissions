class Solution {
    public boolean isPalindrome(String s) {
        int first=0;
        int last = s.length()-1;
        s = s.toLowerCase();
       
        while(first<last){
            char f = s.charAt(first);
            char l = s.charAt(last);
            if(!Character.isLetterOrDigit(f)){
                first++;
            }else if(!Character.isLetterOrDigit(l)){
                last--;
            }else{
                if(f!=l){
                    return false;
                }
                first++;
                last--;
            }


        }


        return true;
    }
}
