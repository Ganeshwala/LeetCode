package com.DS.BinaryTree;
/*
 * Description :-
 * Given the root of a binary tree, return the sum of all left leaves.
 */
public class Solution {

	public int total = 0;
	   public int inOrderTravel(TreeNode node,int sum){
	       if(node.left != null){
	         inOrderTravel(node.left,sum);
	       }
	       if(node.left == null && node.right == null){
	           total = total+node.val ;
	       }
	       if(node.right != null){
	          if(node.right.left != null){
	           inOrderTravel(node.right,sum);   
	          }else if(node.right.right !=null){
	              inOrderTravel(node.right,sum);
	          }  
	       }
	       return total;
	   }
	    
	    public int sumOfLeftLeaves(TreeNode root) {
	      int sumOfLeft = 0;
	      if(root.left != null || root.right !=null){
	        sumOfLeft = inOrderTravel(root,sumOfLeft);    
	      }
	      return sumOfLeft;
	    }
	
}


 /* Definition for a binary tree node.*/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}



