class Solution {
    public int majorityElement(int[] nums) {
        int result=0;
        if(nums.length==1){return nums[0];}
        HashMap<Integer,Integer> map=new HashMap();
        for(int i = 0; i < nums.length; i++) { 
            if (map.containsKey(nums[i])) { 
                    int count = map.get(nums[i]) +1; 
                    if (count > nums.length /2) { 
                        System.out.println("Majority found :- " + nums[i]); 
                        result= nums[i]; 
                        break;
                    }
                map.put(nums[i],count);
            }
            else{map.put(nums[i], 1);} 
        }
        return result;
    }
}