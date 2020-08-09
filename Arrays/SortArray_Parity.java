class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i=0,j=A.length-1;
        while(i<j){
            if(A[i]%2>A[j]%2){
                swap(A,i,j);
                i++;j--;
            }
            else if(A[i]%2==0){
                i++;
            }
            else if(A[i]%2==1){
                j--;
            }
        }
        return A;
    }
    public void swap(int[] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}