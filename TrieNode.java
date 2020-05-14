class TrieNode{
    HashMap<Character,TrieNode> result=new HashMap();
    boolean isEnd=false;
    public void putChild(char ch){
        result.putIfAbsent(ch,new TrieNode());
    } 
    public TrieNode getChild(char ch){
        return result.get(ch);
    }
}
class Trie {

    /** Initialize your data structure here. */
        TrieNode node=new TrieNode();
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current=node;
        for(char ch:word.toCharArray()){
            current.putChild(ch);
            current=current.getChild(ch);
        }
        current.isEnd=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current=node;
        for(char ch:word.toCharArray()){
            current=current.getChild(ch);
            if(current==null){
                return false;
            }
        }
        return current.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current=node;
        for(char ch:prefix.toCharArray()){
            current=current.getChild(ch);
            if(current==null){
                return false;
            }
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