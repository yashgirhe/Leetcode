class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
        
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        //swap
        Queue<Integer> tempQ = new LinkedList<>();
        tempQ = q1;
        q1 = q2;
        q2 = tempQ;
    }
    
    public int pop() {
        if (q1.isEmpty()) return -1;
        return q1.remove();
    }
    
    public int top() {
      return q1.peek();  
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */