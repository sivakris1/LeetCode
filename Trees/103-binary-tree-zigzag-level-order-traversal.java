class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currList = new ArrayList<>(levelSize);

            for(int i=0; i<levelSize; i++){
                if(reverse){
                    TreeNode currNode = queue.pollLast();
                    currList.add(currNode.val);
                    if(currNode.right != null){
                        queue.addFirst(currNode.right);
                    }
                    if(currNode.left != null){
                        queue.addFirst(currNode.left);
                    }
                }
                else{
                    TreeNode currNode = queue.pollFirst();
                    currList.add(currNode.val);
                    if(currNode.left != null){
                        queue.addLast(currNode.left);
                    }
                    if(currNode.right != null){
                        queue.addLast(currNode.right);
                    }
                }
            }
            reverse = !reverse;
            answer.add(currList);
        }

        return answer;
    }
}