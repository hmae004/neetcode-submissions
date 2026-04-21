class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
            if(min.peek()>=val){
                min.push(val);
            }
        }
    }
    
    public void pop() {
    
        if(min.peek().equals(s.peek())){
            min.pop();
            s.pop();
        }else{
            s.pop();
        }
    
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
