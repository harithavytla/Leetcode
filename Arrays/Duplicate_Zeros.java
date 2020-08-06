class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length-1,dups=0;
        for(int i=0;i<=length-dups;i++){
            if(arr[i]==0){
                if(i==length-dups){
                    arr[length] = 0;
                    length--;
                    break;
                }
                dups++;
            }
        }
        int last = length-dups;
        for(int j=last;j>=0;j--){
            if(arr[j]==0){
                arr[j+dups]=0;
                dups--;
                arr[j+dups]=0;
            }
            else{
                arr[j+dups]=arr[j];
            }
        }
    }
}