package com.DS.BinaryTree;

public class InvertBinaryTree {

	/*
	 * Invert Binary Tree
	 * Given the root of a binary tree, invert the tree, and return its root.
	 */
	public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
                

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.left=right;
        root.right=left;
        
        return root;
    }
	
}
