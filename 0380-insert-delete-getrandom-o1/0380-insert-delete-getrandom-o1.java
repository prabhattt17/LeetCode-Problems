class RandomizedSet {

    List<Integer> list;
    HashMap<Integer,Integer> map;
    public RandomizedSet() {
        map = new HashMap<>();
        list  = new ArrayList<>();
    }
    
    public boolean insert(int val) {
     if(map.containsKey(val))return false;
        
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))return false;
        
        int idx = map.get(val);
        int lastIdxValue = list.get(list.size()-1);
        map.put(lastIdxValue,idx);
        
        list.set(idx,lastIdxValue);
        list.remove(list.size()-1);
        
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get((int)(Math.random()*list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */