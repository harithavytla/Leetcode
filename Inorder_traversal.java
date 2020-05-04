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

//Iteration

class Solution {
    List result=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack();
        while(root!=null||!s.isEmpty()){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            root=s.pop();
            result.add(root.val);
            root=root.right;
        }
        return result;
    }
}