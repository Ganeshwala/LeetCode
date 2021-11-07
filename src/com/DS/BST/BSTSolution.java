package com.DS.BST;
import java.util.*;

/*
 * DEscription :-
 * Given the root node of a binary search tree and two integers low and high,
 *  return the sum of values of all nodes with a value in the inclusive range [low, high].
 */

public class BSTSolution {

	public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int sum = 0;
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.remove();
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
            if(low<= currentNode.val && currentNode.val<= high){
                sum += currentNode.val;
            }
        }
        return sum;
    }
	
}

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
