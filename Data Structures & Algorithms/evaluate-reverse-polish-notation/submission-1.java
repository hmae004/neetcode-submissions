class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String t:tokens){
            if(t.equals("+")){
                int sum =0;
                sum += s.pop();
                sum += s.pop();
                s.push(sum);
            }else if(t.equals("-")){
                int sum =0;
                int x = s.pop();
                sum += s.pop();
                sum -= x;
                s.push(sum);
            }else if(t.equals("*")){
                int sum =1;
                sum *= s.pop();
                sum *= s.pop();
                s.push(sum);
            }else if(t.equals("/")){
                int sum =0;
                int x = s.pop();
                sum += s.pop();
                sum = sum/x;
                s.push(sum);
            }else{
                int x = Integer.parseInt(t);
                s.push(x);
            }
        }
        return s.pop();
    }
}
