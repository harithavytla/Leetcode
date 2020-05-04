class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()==0){return true;}
        if(magazine.length()==0){return false;}
        int len=ransomNote.length();
        int[] result=new int[200];
        for(char ch:magazine.toCharArray()){
            result[ch]++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(result[ch]>0){
                result[ch]--;
                if(--len==0){return true;}   
                }
            }
        return false;
         }
    }

//HashMap
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap();
        for(char ch:magazine.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{map.put(ch,1);}
        }
        for(char c:ransomNote.toCharArray()){
            if(!map.containsKey(c)||map.get(c)<=0){return false;}
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}