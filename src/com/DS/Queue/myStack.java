package com.DS.Queue;
import java.util.*;
public class myStack {

	Queue q1,q2;
    public myStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()){
            int num = (int)q1.peek();
            q2.add(num);
            q1.remove();
        }
        while(!q2.isEmpty()){
            int n = (int)q2.peek();
            q1.add(n);
            q2.remove();
        }
    }
    
    public int pop() {
      return (int)q1.remove();  
    }
    
    public int top() {
        return (int)q1.peek();
    }
    
    public boolean empty() {
        if (q1.isEmpty() && q2.isEmpty())
            return true;
        else
            return false;
    }
	
}
