class Solution {
    List<Integer> l=new ArrayList();
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l=inorder(root,new ArrayList());
        return l.get(k-1);
    }
    public List<Integer> inorder(TreeNode root, List<Integer> l){
        if(root==null){return l;}
        if(root.left!=null){inorder(root.left,l);}
        l.add(root.val);
        if(root.right!=null){inorder(root.right,l);}
        return l;
    }
}