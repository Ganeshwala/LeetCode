package com.DS.LinkedList;

import java.util.Stack;

public class ReverseLinkedList2 {

	/*
	 * Problem level:- Medium
	 * 
	 * Q)
	 * Given the head of a singly linked list and two integers left and right where left <= right,
	 * reverse the nodes of the list from position left to position right,
	 * and return the reversed list.
	 * 
	 * e.g
	 * Input: head = [1,2,3,4,5], left = 2, right = 4
	   Output: [1,4,3,2,5]
	 */
	public ListNode reverseBetween(ListNode head, int left, int right) {
        //System.out.println(head.val);
		if(left == right) return head;
     
        ListNode ptr = head;
        int count = 1;
        Stack<Integer> st = new Stack<>();
        while(count <= right){
            if(count >= left && count <= right){
                st.push(ptr.val);
            }
            ptr = ptr.next;
            count++;
        }
        
        count = 1;
        ptr = head;
        while(count <= right){
            if(count >= left && count <= right){
                ptr.val = st.pop();
            }
            ptr = ptr.next;
            count++;
        }
        
        return head;
    }
	
}
