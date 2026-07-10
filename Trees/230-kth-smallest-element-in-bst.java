class Solution {
    int ans = 0;
    int counter = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return ans;
    }

    public void inOrder(TreeNode root, int k){
        if(root == null){
            return;
        }

        inOrder(root.left, k);

        counter++;
        if(counter == k){
            ans = root.val;
            return;
        }

         inOrder(root.right,k);


    }
}