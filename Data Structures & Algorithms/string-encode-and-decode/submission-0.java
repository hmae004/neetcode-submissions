class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String i:strs){
            s.append(i);
            s.append(";");
        }
        System.out.println(s);
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> l = new ArrayList<String>();
        StringBuilder s = new StringBuilder();
        for(char c:str.toCharArray()){
            if(c==';'){
                l.add(s.toString());
                s.delete(0,s.length());
                continue;
            }
            s.append(c);
        }
        return l;
    }
}
