package com.DS.LinkedList;

public class RemoveNthNodeFromEndList {

	/*
	 * Q) Given the head of a linked list, remove the nth node from the end of the
	 * list and return its head
	 * 
	 * e.g Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5]
	 * 
	 * Input: head = [1], n = 1 Output: []
	 */

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if (head.next == null) {
			return null;
		} else {
			int length = 0;

			ListNode temp = head;
			while (temp != null) {
				length++;
				temp = temp.next;
			}

			int index = 1;
			temp = head;
			n = length - n;
			// System.out.println(size);
			if (n == 0) {
				head = temp.next;
			} else {
				for (int i = 0; i < n - 1; i++)
					temp = temp.next;

				temp.next = temp.next.next;
			}
			return head;
		}
	}
}
