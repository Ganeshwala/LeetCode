package com.DS.BinaryTree;

/**
 * Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

Two nodes of a binary tree are cousins if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
 */
public class BinaryTreeCousins {
	public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        if(root.left == null || root.right==null){
            return false;
        }
        int depthX = getHeight(root,x,0);
        int depthY = getHeight(root,y,0);
        System.out.println(depthX+"===="+depthY);
        return depthX==depthY;
    }

    private int getHeight(TreeNode root,int nodeVal,int depth){
       if(root == null){
        return 0;
       }
       if( root.val != nodeVal){
            depth++;
           getHeight(root.left,nodeVal,depth);
           getHeight(root.right,nodeVal,depth);
       }
        return depth;
    }
}
