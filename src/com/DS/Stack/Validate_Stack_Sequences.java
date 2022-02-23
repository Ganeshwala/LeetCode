package com.DS.Stack;
import java.util.*;
public class Validate_Stack_Sequences {

	/*
	 * Q> Given two integer arrays pushed and popped each with distinct values,
	 *  return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
	 *  
	 *  e.g
	 *  
	 *  Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
		Output: true
		Explanation: We might do the following sequence:
		push(1), push(2), push(3), push(4),
		pop() -> 4,
		push(5),
		pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
	 *  
	 */
	
	private Stack s = new Stack<Integer>();
    private int j=0;
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       pushStack(pushed,popped);
       return popStack(j,s,popped);
        
    }
    
    public void pushStack(int[] pushed,int[] popped){
        for(int i=0;i<pushed.length;i++){
            if(pushed[i]==popped[j]){
                j++;
                while(!s.isEmpty()){
                    if((int)s.peek()==popped[j]){
                        s.pop();
                        j++;
                    }else{
                        break;
                    }
                }
            }else{
                s.push(pushed[i]);
            }
        }
    }
    
    public boolean popStack(int startIndex,Stack s,int[] popped){
        for(int i = startIndex;i<popped.length;i++){
            if((int)s.peek()==popped[i]){
                s.pop();
            }    
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
	
}
