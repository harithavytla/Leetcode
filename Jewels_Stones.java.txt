class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        if(J==null){return 0;}
        List l=new ArrayList();
        for(char c : J.toCharArray()){
            l.add(c);
        }
        for(char c : S.toCharArray()){
            if(l.contains(c)){
                count++;
            }
        }
        return count;
    }
}