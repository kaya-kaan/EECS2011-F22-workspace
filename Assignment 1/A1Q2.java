/**
 * Name: Kaan KAYA
 * Student number: 218189415
 */

/**
 * EECS 2011 A, Fall 2022.
 * Assignment 1, Question 2 starter code.
 * Please read carefully the instructions in the assignment handout
 * and the starter code.
 */

import java.util.ArrayList;
// Do NOT add any import

/**
 * A last-in, first-out (LIFO) stack of integers
 * DO NOT MODIFY THIS CLASS.
 * DO NOT ADD ANY OTHER CLASS.
 */
class A1Stack {

    private ArrayList<Integer> data;

    public A1Stack() {
        data = new ArrayList<>();
    }

    public void push(int x) {
        this.data.add((x));
    }

    public int pop() {
        return this.data.remove(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public int peek() {
        return this.data.get(this.data.size() - 1);
    }

    public int size() {
        return this.data.size();
    }
}

public class A1Q2 {

    /**
     * The function that you need to implement.
     * Read the assignment handout for the specification.
     */
    public static int solve(int[] arr) {

        // TODO: implement this function
    	
    	A1Stack stack = new A1Stack();
    	int count = 0;
    	int currentNum = 0;
    	int outputCounter = 0;
    	
    
    	while(count < arr.length && currentNum != 1) {
    		if(arr[count] == 1) {
    			outputCounter++;
    			currentNum = arr[count];
    			count++;
    			
    		}else {
    			stack.push(arr[count]);
    			count++;
    		}
    		
    	}
    	
		while(((count < arr.length && (currentNum + 1) == arr[count]) || (stack.size() > 0 && (currentNum + 1) == stack.peek()))){
			if(count < arr.length && (currentNum + 1) == arr[count]){
				outputCounter++;
				currentNum = arr[count];
				count++;
			}else {
				currentNum = stack.peek();
				outputCounter++;
				stack.pop();
			}
		}
    	return outputCounter;
    	
    }

    /**
     * This main function contains a couple of test cases that can be used to verify
     * that your code compiles and runs. Note that these test cases are NOT complete,
     * and you need to test your code thoroughly with more cases.
     */
    public static void main(String[] args) {

        int[] arr1 = {5, 4, 3, 1, 2};
        System.out.println(solve(arr1));

        int[] arr2 = {4, 5, 2, 1, 3};
        System.out.println(solve(arr2));
        
        int[] arr3 = {1, 4, 2, 3};
        System.out.println(solve(arr3));
        
    }
}
