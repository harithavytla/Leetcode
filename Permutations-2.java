class Solution {
    List<List<Integer>> result=new ArrayList();
    public List<List<Integer>> permuteUnique(int[] nums) {
        enumerate(nums,0);
        return result;
    }
    public void enumerate(int[] nums, int index){
        if(index==nums.length-1){
            List<Integer> current=new ArrayList();
            for(int num : nums){
                current.add(num);
            }
            result.add(current);
        }
        Set<Integer> s=new HashSet();
            for(int i=index;i<nums.length;i++){
                if(i>index&&nums[i]==nums[i-1]){continue;}
                if(s.add(nums[i])){
                swap(nums,i,index);
                enumerate(nums,index+1);
                swap(nums,i,index);
                }
            }
        }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}