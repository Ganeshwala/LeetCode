package com.DS.LinkedList;

public class ReverseLinkedList1 {

	/*
	 * Given the head of a singly linked list, reverse the list, and return the reversed list.
	 * e.g
	 * Input: head = [1,2,3,4,5]
	   Output: [5,4,3,2,1]
	 */
	public ListNode reverseList(ListNode head) {
	     
        ListNode pre=null;
        ListNode current=head;
        ListNode next=null;
        
        while(current !=null){
            next = current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        return pre;
    }
	
}
