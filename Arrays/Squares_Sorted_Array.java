class Solution {
    public int[] sortedSquares(int[] A) {
        int[] output = new int[A.length];
        for (int i=0;i<A.length;i++){
            output[i]=A[i]*A[i];
        }
        Arrays.sort(output);
        return output;
    }
}