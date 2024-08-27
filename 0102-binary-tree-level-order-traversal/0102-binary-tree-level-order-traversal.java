/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        
        if(root == null) return res;
        
        while(!level.isEmpty()){
            List<Integer> sublist = new LinkedList<>();
            int size = level.size();
            for(int i=0; i<size; i++){
                if(level.peek().left != null) level.offer(level.peek().left);
                if(level.peek().right != null) level.offer(level.peek().right);
                sublist.add(level.poll().val);
            }
            res.add(sublist);
        }
        return res;
    }
}