class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] chArray=new List[s.length()+1];
        for(char ch:map.keySet()){
            int num=map.get(ch);
            if(chArray[num]==null){chArray[num]=new ArrayList();}
            chArray[num].add(ch);
        }
        for(int i=chArray.length-1;i>=0;i--){
            if(chArray[i]!=null){
                List<Character> l=chArray[i];
                for(char ch:l){
                    int count=map.get(ch);
                    while(count>0){
                        sb.append(ch);
                        count--;
                    }
                }
            }   
        }
        return sb.toString();
    }
}