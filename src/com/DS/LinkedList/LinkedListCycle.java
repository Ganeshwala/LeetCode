package com.DS.LinkedList;

public class LinkedListCycle {
/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.

	There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
	Internally, pos is used to denote the index of the node that tail's next pointer is connected to. 
	Note that pos is not passed as a parameter.

	Return true if there is a cycle in the linked list. Otherwise, return false.
	
	e.g
	Input: head = [3,2,0,-4], pos = 1
	Output: true
	Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */
	 public boolean hasCycle(ListNode head) {
	        ListNode p1 = head;
	        ListNode p2 = head;
	        while(p2 != null && p2.next != null) {
	            p1 = p1.next;
	            p2 = p2.next.next;
	            if(p1 == p2) return true;
	        }
	        return false;
	       
	    }
	
}
