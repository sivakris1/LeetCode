//approach : using helper function for finding depth and parents of x and y individually then compare them.

class Solution {
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1;
    int yDepth = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);

        return xDepth == yDepth && xParent.val != yParent.val;
    }

    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent){
        if(root == null){
            return;
        }

        if(root.val == x){
            xDepth = depth;
            xParent = parent;
        }
        else if(root.val == y){
            yDepth = depth;
            yParent = parent;
        }

        getDepthAndParent(root.left, x, y, depth+1, root);
        getDepthAndParent(root.right, x, y, depth+1, root);
    }
}