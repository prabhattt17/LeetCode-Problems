class MyStack {
    Queue<Integer>q;
    ArrayList<Integer>list;
    public MyStack() {
         q=new ArrayDeque<>();
         list=new ArrayList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int val=0;
        while(q.size()!=0){
             val=q.peek();
            list.add(q.remove());
           
        }
        // System.out.println(peek());
        for(int i=0;i<list.size()-1;i++){
            q.add(list.get(i));
        }
        list=new ArrayList<>();
        return val;
    }
    
    public int top() {
        int val=0;
        while(q.size()!=0){
             val=q.peek();
            list.add(q.remove());
           
        }
        // System.out.println(peek());
        for(int i=0;i<list.size();i++){
            q.add(list.get(i));
        }
        list=new ArrayList<>();
        return val;
    }
    
    public boolean empty() {
        if(q.size()>0)return false;
        return true;
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