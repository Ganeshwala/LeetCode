package com.DS.BST;

public class DeleteNodeBST {
/*
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST.
 * Return the root node reference (possibly updated) of the BST.
 * Basically, the deletion can be divided into two stages:
		1)Search for a node to remove.
		2)If the node is found, delete the node.
 */
	 private TreeNode minimumNode(TreeNode node){
	        if(node.left == null) {
				return node;
			}
			else {
				return minimumNode(node.left);
			}
	    }
	        
	    public TreeNode deleteNode(TreeNode root, int key) {
	       if(root == null) {
				//System.out.println("Value not found");
				return null;
			}
			if(key < root.val) {
				root.left = deleteNode(root.left, key);
			}
			else if(key > root.val) {
				root.right = deleteNode(root.right, key);
			}
			else {
				if(root.left != null && root.right != null) {
					TreeNode temp = root;
					TreeNode minNodeForRight = minimumNode(temp.right);
					root.val = minNodeForRight.val;
					root.right = deleteNode(root.right, minNodeForRight.val);
				}
				else if(root.left !=null) {
					root = root.left;
				}else if(root.right !=null) {
					root = root.right;
				}else {
					root = null;
				}
			}
			return root;
	    }
	
}
