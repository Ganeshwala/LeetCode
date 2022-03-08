package com.DS.LinkedList;

public class Solution {

	/*
	 * Q) Add Two Numbers:-
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
	 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 */
	
	int remender=0;
    ListNode result = new ListNode();
    ListNode tempResult = result;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        while(l1!=null || l2!=null || remender !=0){
            int temp1=0,temp2=0,sum=0;        
            if(l1!=null){
               // System.out.println("L1=====>"+l1.val);
                temp1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                //System.out.println("L2=====>"+l2.val);
                temp2=l2.val;
                l2=l2.next;
            }
            //System.out.println(remender);
            
            int total = temp1+temp2;
            sum = (total+remender)%10;
            remender = (total+remender)/10;
            
            //System.out.println(remender);
            
            //System.out.println(temp1+temp2+"===="+sum);
            
               // System.out.println("Sum"+sum);
               ListNode temp = new ListNode();
                temp.val=sum;
               result.next=temp;
               result=result.next;
            
        }
        return tempResult.next;
    }
}
