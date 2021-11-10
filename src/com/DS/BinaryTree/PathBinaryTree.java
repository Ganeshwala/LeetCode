package com.DS.BinaryTree;
import java.util.*;
public class PathBinaryTree {
/*
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 */
	 private void preOrderTravel(TreeNode node,String pathDirection,List<String> path){
	       pathDirection += node.val;
	       if(node.left == null && node.right == null){
	           path.add(pathDirection);
	           return ;
	       }
	       if(node.left != null){
	           preOrderTravel(node.left,pathDirection+"->",path);
	       }
	       if(node.right != null){
	           preOrderTravel(node.right,pathDirection+"->",path);
	       }
	   }
	    
	    public List<String> binaryTreePaths(TreeNode root) {
	        List<String> paths = new ArrayList<String>();
	        if(root == null)
	            return paths;
	        else{
	            preOrderTravel(root,"",paths);
	            return paths;   
	        }
	    }
	
}
