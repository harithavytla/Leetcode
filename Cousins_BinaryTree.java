class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode parent_x=level(root,x,0);
        TreeNode parent_y=level(root,y,0);
        if(parent_x.val!=-1&&parent_y.val!=-1&&parent_x!=parent_y&&parent_x.val==parent_y.val){return true;}
        return false;
        
    }
    public TreeNode level(TreeNode root,int x,int depth){
        if(root==null){return new TreeNode(-1);}
        if(root.val==x||(root.left==null&&root.right==null)){return new TreeNode(-1);}
        if(root.left!=null&&root.left.val==x){
            TreeNode node=root;
            node.val=depth;
            return node;
        }
        if(root.right!=null&&root.right.val==x){
            TreeNode node=root;
            node.val=depth;
            return node;
        }
        TreeNode result=level(root.left,x,depth+1);
        if(result.val!=-1){return result;}
        result=level(root.right,x,depth+1);
        return result;
    }
}