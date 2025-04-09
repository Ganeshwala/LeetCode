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
    ArrayList<Integer> nodeVal = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inOrderTravel(root);
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<nodeVal.size()-1;i++){
            int diff = Math.abs(nodeVal.get(i) - nodeVal.get(i+1));
            if(min > diff){
                min = diff;
            }
        }
        return min;
    }

    public void inOrderTravel(TreeNode root){
        if(root == null)
            return;
        inOrderTravel(root.left);
        nodeVal.add(root.val);
        inOrderTravel(root.right);
    }
}