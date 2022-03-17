package com.DS.LinkedList;

public class PalindromeLinked {
	/*
	 * Q) Given the head of a singly linked list, return true if it is a palindrome.
	 */

	public ListNode findMiddleNode(ListNode head) {
		ListNode slowPr = head;
		ListNode fastPr = head;
		while (fastPr != null && fastPr.next != null) {
			slowPr = slowPr.next;
			fastPr = fastPr.next.next;
		}
		return slowPr;
	}

	public ListNode reveserList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		return prev;
	}

	public boolean isPalindrome(ListNode head) {
	        if(head==null || head.next==null)
	            return true;
	        else{
	            ListNode middleNode = findMiddleNode(head);
	            //System.out.println(middleNode.val);
	            ListNode LtoRList = head;
	            ListNode RtoLList = reveserList(middleNode);
	           // System.out.println(RtoLList.val);
	            while(RtoLList!=null){
	                //System.out.println(RtoLList.next.val);
	                //System.out.println(LtoRList.val);
	                if(LtoRList.val != RtoLList.val)
	                    return false;
	                LtoRList=LtoRList.next;
	                RtoLList=RtoLList.next;
	            }
	            return true;
	        }
	}
}
