class StockSpanner {
   class Stock{
       int price;
       int idx;
       
       Stock(int price, int idx){
           this.price = price;
           this.idx = idx;
       }
   }
    
    Stack<Stock> st;
    int i;
    public StockSpanner() {
        st = new Stack<>();
        i = 0;
    }
    
    public int next(int price) {
       while(st.size()>0 && st.peek().price<=price){
           st.pop();
       }
     
        int ans = 0;
        i++;
        
        if(st.size()==0){
            ans = i;
        }else{
         ans = (i-st.peek().idx);
        }
        
        st.push(new Stock(price,i));
 
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */