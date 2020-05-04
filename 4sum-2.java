class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int sum1=0,sum2=0,count=0;
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                sum1=A[i]+B[j];
                if(map.containsKey(sum1)){
                    map.put(sum1,map.get(sum1)+1);
                }
                else{
                    map.put(sum1,1);
                }
            }
        }
        for(int k=0;k<C.length;k++){
            for(int l=0;l<C.length;l++){
                sum2=-(C[k]+D[l]);
                if(map.containsKey(sum2)){
                    count+=map.get(sum2);
                }
            }
        }
        return count;
}
}