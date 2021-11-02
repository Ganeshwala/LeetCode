package com.DS.Stack;
import java.util.*;
/*
 * Question 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

	Implement the MinStack class:
	
	MinStack() initializes the stack object.
	void push(int val) pushes the element val onto the stack.
	void pop() removes the element on the top of the stack.
	int top() gets the top element of the stack.
	int getMin() retrieves the minimum element in the stack.
	
 */
public class MinStack {
	 Stack<Integer> stack1;
	    Stack<Integer> stack2;
	    public MinStack() {
	        stack1 = new Stack<Integer>();
	        stack2 = new Stack<Integer>();
	    }
	    
	    public void push(int val) {
	        if(stack2.isEmpty()){
	            //System.out.println("stack2"+val);
	            stack2.push(val);
	        }
	        else if((int)stack2.peek()>=val){
	            //System.out.println("else is stack2"+val);
	            stack2.push(val);
	        }
	        stack1.push(val);
	    }
	    
	    public void pop() {
	        if((int)stack2.peek() == (int)stack1.peek()){
	            stack2.pop();   
	        } 
	        stack1.pop();
	    }
	    
	    public int top() {
	        return stack1.peek();
	    }
	    
	    public int getMin() {
	        return stack2.peek();
	    }
}
