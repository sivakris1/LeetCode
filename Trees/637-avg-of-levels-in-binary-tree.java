
//approach: use queue for storing nodes of each level
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double value = 0.0;

            for(int i=0; i<levelSize; i++){
                TreeNode currNode = queue.poll();
                value += currNode.val;

                if(currNode.left != null){
                    queue.offer(currNode.left);
                }

                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }

            ans.add(value/levelSize);
        }

        return ans;
    }
}