class TrieNode {
        TrieNode[] link = new TrieNode[26];
        boolean flag;
    }
    
class Trie {
 
    TrieNode root = null;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode temp = root;
        
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(temp.link[ch-'a']==null){
                temp.link[ch-'a']=new TrieNode();
            }
            temp = temp.link[ch-'a'];
        }
        temp.flag= true  ;
    }
    
    public boolean search(String word) {
         TrieNode temp = root;
        
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(temp.link[ch-'a']==null){
                return false;
            }
            temp = temp.link[ch-'a'];
        }
        if(temp.flag==true)return true;
        return false;
    }
    
    public boolean startsWith(String word) {
         TrieNode temp = root;
        
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
          if(temp.link[ch-'a']==null){
                return false;
            }
            temp = temp.link[ch-'a'];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */