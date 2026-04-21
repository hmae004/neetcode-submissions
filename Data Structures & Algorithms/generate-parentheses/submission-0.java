class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> res = new ArrayList<>();
        backtrack(0,0,n,stack,res);
        return res;
    }
    public void backtrack(int open,int closed,int n,Stack<Character> stack,List<String> res){
        if(open==n && open==closed){
            StringBuilder sb = new StringBuilder();
            for(char c:stack){
                sb.append(c);
            }
            res.add(sb.toString());
            return;
        }
        if(open>closed){
            stack.push(')');
            backtrack(open,closed+1,n,stack,res);
            stack.pop();
        }
        if(open<n){
            stack.push('(');
            backtrack(open+1,closed,n,stack,res);
            stack.pop();
        }
    }
}
