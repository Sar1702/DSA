class MinStack {
    Stack<Integer> s, st ;

    public MinStack() {
        s = new Stack<>();
        st = new Stack<>();
    }

    public void push(int value) {
        s.push(value);
        if (st.isEmpty() || value <= st.peek()) {
            st.push(value);
        }

    }

    public void pop() {
           if (s.isEmpty()) return;

    if (s.peek().equals(st.peek())) {
        st.pop();
    }

    s.pop();
    }

    public int top() {
        if (s.isEmpty()) {
            return -1;
        }
        return s.peek();
    }

    public int getMin() {
        if (st.empty()) {
            return -1;
        }
        return st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */