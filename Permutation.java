class Solution {
    List<List<Integer>> result=new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        enumerate(nums,0);
        return result;
    }
    public void enumerate(int[] nums,int index){
        if(index==nums.length-1){
            List<Integer> current=new ArrayList();
            for(int number:nums){
                current.add(number);
            }
            result.add(current);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            enumerate(nums,index+1);
            swap(nums,i,index);
        }
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}