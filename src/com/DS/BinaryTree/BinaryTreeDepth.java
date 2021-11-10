package com.DS.BinaryTree;
import java.util.*;
public class BinaryTreeDepth {
/*
 * Given the root of a binary tree, return its maximum depth.
	A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 
 */
	private void preOrderTravel(TreeNode node,int hight,ArrayList hights){
        hight += 1;
        if(node.left == null && node.right == null){
            //System.out.println("height ===>"+hight);
            hights.add(hight);
            return ;
        }
        if(node.left != null){
            preOrderTravel(node.left,hight,hights);
        }
        if(node.right != null){
            preOrderTravel(node.right,hight,hights);
        }
    }
    
    public int maxDepth(TreeNode root) {
        ArrayList<Integer> hights = new ArrayList<Integer>();
        if(root == null)
            return 0;
        else{
            preOrderTravel(root,0,hights);
            int max = hights.get(0);
            for(int i : hights){
                if(max < i){
                    max = i;
                }
            }
            return max;
        }
    }
	
}
