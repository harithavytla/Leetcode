class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){return new ArrayList();}
        List<List<Integer>> result=new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> current=new ArrayList<>();
            for(int i=0;i<size;i++){                
                TreeNode node=q.remove();
                current.add(node.val);
                if(node.left!=null){q.add(node.left);}
                if(node.right!=null){q.add(node.right);}
            }
            result.add(current);
        }
        return result;
    }
}