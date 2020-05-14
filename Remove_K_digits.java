class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()){return "0";}
        for(int i=0;i<k;i++){
            num=remove(num);
        }
        return num;
    }
    public String remove(String num){
        int index=num.length()-1;
        for(int i=0;i<index;i++){
            if(num.charAt(i)>num.charAt(i+1)){
                index=i;
                break;
            }
        }
        StringBuffer s=new StringBuffer();
        for(int i=0;i<num.length();i++){
            if(i==index||s.length()==0&&num.charAt(i)=='0'){
                continue;
            }
            s.append(num.charAt(i));
        }
        if(s.length()==0){return "0";}
        else{return s.toString();}
    }
}