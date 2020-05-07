class Solution {
    List<List<Integer>> result=new ArrayList();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> current=new ArrayList();
        Arrays.sort(candidates);
        check(candidates,target,current,0);
        return result;
    }
    public void check(int[] candidates, int target,List<Integer> current, int index){
        if(target==0){
            result.add(new ArrayList(current));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]<=target){
                current.add(candidates[i]);
                check(candidates,target-candidates[i],current,i+1);
                current.remove(current.size()-1);
            }
        }
    }
}