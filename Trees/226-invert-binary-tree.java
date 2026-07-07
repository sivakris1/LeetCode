
//Trees solving using dfs
class Solution {
    public TreeNode invertTree(TreeNode root) {
        return swapNodes(root);
    }

    public TreeNode swapNodes(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode left = swapNodes(root.left);
        TreeNode right = swapNodes(root.right);

        TreeNode temp = left;
        root.left = right;
        root.right = temp;

        return root;
    }
}