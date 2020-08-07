class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else if(count>0){
                swap(nums,idx,i);
                idx++;
            }
            else{
                idx++;
            }
        }
    }
    public void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}