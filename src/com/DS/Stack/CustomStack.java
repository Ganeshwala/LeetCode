package com.DS.Stack;
import java.util.*;

/*
 * Design a stack which supports the following operations.

	Implement the CustomStack class:

	1) CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack or do nothing if the stack reached the maxSize.
	2) void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.
	3) int pop() Pops and returns the top of stack or -1 if the stack is empty.
	4) void inc(int k, int val) Increments the bottom k elements of the stack by val. If there are less than k elements in the stack, just increment all the elements in the stack.
 */

public class CustomStack {

	Stack s1,s2;
    int stackCapacity;
    public CustomStack(int maxSize) {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        stackCapacity=maxSize;
    }
    
    public void push(int x) {
        if(stackCapacity>s1.size()){
            //System.out.println(x);
            if(!s2.isEmpty()){
                for(int i=0;i<s2.size();i++){
                    int num = (int)s2.pop();
                    s1.push(num);
                }
            }
            s1.push(x);
        }
        
    }
    
    public int pop() {
        if(s1.isEmpty())
            return -1;
        else
            return (int)s1.pop();
    }
    
    public void increment(int k, int val) {
      // System.out.println(s1.size()+"<=======>"+s2.size());
        int totalSize = s1.size();
        for(int j=0;j<totalSize;j++){
               s2.push((int)s1.pop());
        }
        int s2Size=s2.size();
        if(stackCapacity<=k){
           // System.out.println("s2 size after"+s2.size());
            for(int n=0;n<s2Size;n++){
                int result=(int)s2.pop();
                int sum = result+val;
                s1.push(sum);
            }
        }
        else{
            int round = stackCapacity - k;
           // System.out.println("round====>"+round);
            for(int i=0;i<k;i++){
                if(!s2.isEmpty()){
                    int result=(int)s2.pop();
                    int sum = result+val;
                    s1.push(sum);   
                }
            }
            for(int c=0;c<round;c++){
                if(!s2.isEmpty()){
                    int number =(int)s2.pop();
                    s1.push(number);   
                }
            } 
        }
    }
	
}
