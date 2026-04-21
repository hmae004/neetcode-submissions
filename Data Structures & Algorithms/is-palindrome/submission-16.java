class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int f=s.length()-1;
        while(i<f){
            while(i<f && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<f && !Character.isLetterOrDigit(s.charAt(f))){
                f--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(f))){
                return false;
            }
            i++;
            f--;
         }
    
        return true;
    }
}
