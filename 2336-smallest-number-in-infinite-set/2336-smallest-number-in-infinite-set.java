class SmallestInfiniteSet {

    HashSet<Integer>set;
    int min;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        min = 1;
    }
    
    public int popSmallest() {
        set.add(min);
        int val = min;
        min+=1;
        while(set.contains(min)){
            min+=1;
        }
        return val;
    }
    
    public void addBack(int num) {
     min = Math.min(min,num);
       if(set.contains(num))set.remove(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */