class Solution {
    List<List<Integer>> result=new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> current=new ArrayList();
        check(candidates,target,0,current);
        return result;
    }
    public void check(int[] candidates, int target, int index,List<Integer> current){
        if(target==0){
            result.add(new ArrayList(current));
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]<=target){
                current.add(candidates[i]);
                check(candidates,target-candidates[i],i,current);
                current.remove(current.size()-1);
            }
        }
    }
}