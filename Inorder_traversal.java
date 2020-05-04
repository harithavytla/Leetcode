class Solution {
    List<Integer> result=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {        
        if(root!=null){
            if(root.left!=null){
                inorderTraversal(root.left);
            }
            result.add(root.val);
            if(root.right!=null){
                inorderTraversal(root.right);
            }                        
        }
        return result;
    }
}