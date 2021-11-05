package com.DS.Stack;
import java.util.*;

/*
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 */

public class MyQueue {

	Stack s1,s2;
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }
    
    public void push(int x) {
        if(s1.isEmpty() && !s2.isEmpty()){
            while(!s2.isEmpty()){
                int n = (int)s2.peek();
                s1.push(n);
                s2.pop();
            }
            s1.push(x);
        }else if(s1.isEmpty() && s2.isEmpty()){
            s1.push(x);
        }else if(!s1.isEmpty() && !s2.isEmpty()){
            while(!s2.isEmpty()){
                int n = (int)s2.peek();
                s1.push(n);
                s2.pop();
            }
            s1.push(x);
        }else{
            s1.push(x);
        }
            
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            int num = (int)s1.peek();
            s2.push(num);
            s1.pop();
        }
        int n = (int)s2.peek();
        s2.pop();
        return n;
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            int num = (int)s1.peek();
            s2.push(num);
            s1.pop();
        }
        int n = (int)s2.peek();
        return n;
    }
    
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        return false;
    }
	
}
