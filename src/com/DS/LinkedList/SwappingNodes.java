package com.DS.LinkedList;

import java.util.Stack;

public class SwappingNodes {

	/*
	 * Q) You are given the head of a linked list, and an integer k. Return the head
	 * of the linked list after swapping the values of the kth node from the
	 * beginning and the kth node from the end (the list is 1-indexed).
	 * 
	 * e.g Input: head = [1,2,3,4,5], k = 2 Output: [1,4,3,2,5]
	 *
	 * Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5 Output: [7,9,6,6,8,7,3,0,9,5]
	 */

	Stack<Integer> st = new Stack();

	public ListNode swapNodes(ListNode head, int k) {
		ListNode temp = head;
		int i = 0;
		while (temp != null) {
			st.push(temp.val);
			temp = temp.next;
			i++;
		}
		temp = head;
		int tempList = 0;
		for (int j = 1, z = i; j <= i && z >= 1; j++, z--) {
			if (j == k) {
				tempList = temp.val;
				// System.out.println(tempList);
				temp.val = (int) st.peek();
			}
			st.pop();
			temp = temp.next;
		}
		temp = head;
		for (int z = i; z >= 1; z--) {
			if (z == k) {
				temp.val = tempList;
			}
			temp = temp.next;
		}
		return head;
	}
}
