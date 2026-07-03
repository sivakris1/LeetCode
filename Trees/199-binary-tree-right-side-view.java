class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();

        if(root == null){
            return answer;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i=0; i<levelSize; i++){
                TreeNode currNode = queue.poll();

                if(i == levelSize-1){
                    answer.add(currNode.val);
                }

                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
        }

        return answer;
    }
}