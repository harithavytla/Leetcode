class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){return false;}
        int[] s1_count=new int[26];
        int[] s2_count=new int[26];
        for(int i=0;i<s1.length();i++){
            s1_count[s1.charAt(i)-'a']++;
            s2_count[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(match(s1_count,s2_count)){return true;}
            s2_count[s2.charAt(i+s1.length())-'a']++;
            s2_count[s2.charAt(i)-'a']--;
        }
        return match(s1_count,s2_count);
    }
    public boolean match(int[] s1_count, int[] s2_count){
        for(int i=0;i<26;i++){
            if(s1_count[i]!=s2_count[i]){return false;}
        }
        return true;
    }
}