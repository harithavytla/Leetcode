class StockSpanner {
    Stack<Integer> prices=new Stack<>();
    Stack<Integer> span=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int temp=1;
        while(!prices.isEmpty()&&prices.peek()<=price){
            prices.pop();
            temp+=span.pop();
        }
        prices.push(price);
        span.push(temp);
        return temp;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */