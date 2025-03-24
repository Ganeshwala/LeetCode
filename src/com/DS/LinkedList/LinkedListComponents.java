package com.DS.LinkedList;

/**
 * You are given the head of a linked list containing unique integer values and an integer array nums that is a subset of the linked list values.

	Return the number of connected components in nums where two values are connected if they appear consecutively in the linked list.
	E.g:-
		Input: head = [0,1,2,3], nums = [0,1,3]
		Output: 2
		Explanation: 0 and 1 are connected, so [0, 1] and [3] are the two connected components.
		
		Input: head = [0,1,2,3,4], nums = [0,3,1,4]
		Output: 2
		Explanation: 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
 */

public class LinkedListComponents {

	public int numComponents(ListNode head, int[] nums) {
        ListNode temp1 = head;
        int size = nums.length;

        while (temp1 != null && temp1.next != null) { 
            boolean found1 = false, found2 = false;

            
            for (int num : nums) {
                if (temp1.val == num) {
                    found1 = true;
                    break;
                }
            }

            
            for (int num : nums) {
                if (temp1.next.val == num) {
                    found2 = true;
                    break;
                }
            }

            
            if (found1 && found2) {
                size--;
            }

            temp1 = temp1.next;
        }

        return size;
    }
	
}
