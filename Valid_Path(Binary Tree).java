class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(root==null){return arr.length==0;}
        return checksequence(root,arr,0);
    }
    public boolean checksequence(TreeNode root,int[] arr,int index){
        if(root.val!=arr[index]){return false;}
        if(index==arr.length-1){return root.left==null && root.right==null;}
        if(root.left!=null&&checksequence(root.left,arr,index+1)){return true;}
        if(root.right!=null&&checksequence(root.right,arr,index+1)){return true;}
        return false;
    }
}