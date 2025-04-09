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
    //ArrayList<String> nodeVal = new ArrayList<String>();
    public int sumRootToLeaf(TreeNode root) {
       return nodeSum(root,0);
    }

    private int nodeSum(TreeNode root,int pathSum){
        if(root == null)
            return 0;
        pathSum = 2 * pathSum + root.val;
        if(root.left == null && root.right == null)
            return pathSum;
        
        return nodeSum(root.left,pathSum)+nodeSum(root.right,pathSum);
    }

   /* public void prOrderList(TreeNode root,String value,ArrayList<String> nodeString){
        if(root.left == null && root.right==null){
            value = value+root.val;
            nodeString.add(value);
            return;
        }
        if(root.left!=null)
            prOrderList(root.left,value+root.val,nodeString);
        if(root.right!=null)
            prOrderList(root.right,value+root.val,nodeString);
    }

    public int binaryToDecimal(int binaryNum){
        System.out.println(binaryNum);
        int i=0;
        int sum =0;
        while(binaryNum >= 10){
            sum = sum + ((binaryNum % 10)*(int)Math.pow(2,i));
            binaryNum = binaryNum/10;
            ++i; 
        }
        sum = sum + ((binaryNum % 10) * (int)Math.pow(2,i));
        return sum;
    }*/
   
}