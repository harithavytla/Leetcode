class DinnerPlates {
    List<Stack<Integer>> stacks;
    int i=0,capacity=0;
    public DinnerPlates(int capacity) {
        this.capacity=capacity;
        stacks=new ArrayList();
    }
    
    public void push(int val) {
        if(stacks.size()==i){stacks.add(new Stack<>());}
        stacks.get(i).push(val);
        while(i<stacks.size()&&stacks.get(i).size()==capacity){i++;}
    }
    
    public int pop() {
        int size=stacks.size();
        while(stacks.size()>0&&stacks.get(size-1).size()==0){
            stacks.remove(size-1);
            size--;
        }
        if(stacks.size()==0){return -1;}
        int result=stacks.get(size-1).pop();
        return result;
    }
    
    public int popAtStack(int index) {
        if(index<0||index>stacks.size()){return -1;}
        if(stacks.get(index).size()==0){return -1;}
        int result=stacks.get(index).pop();
        if(i>index){i=index;}
        return result;
    }
}

/**
 * Your DinnerPlates object will be instantiated and called as such:
 * DinnerPlates obj = new DinnerPlates(capacity);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAtStack(index);
 */