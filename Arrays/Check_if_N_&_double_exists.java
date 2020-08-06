class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean result=false;
        for(int i=0;i<arr.length;i++){
            int index=i,number=2*arr[i];
            result=search(arr,number,index);
            if(result){return true;}
        }
        return false;
    }
    public boolean search(int[] arr,int number,int index){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number&&i!=index){return true;}
        }
        return false;
    }
}