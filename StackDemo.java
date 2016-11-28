/* Assignment 5.2 : Create an interface Stack in package myPack with following methods
	Methods:
	• void push(int I)
	• int pop()

	Create two sub classes inheriting the Stack interface.
	class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
	in the constructor. If the number of integers exceed the size, “Stack overflow” message should be
	displayed.

	class VariableStack that can accept numbers more than its size. The size of the Stack will be
	specified in the constructor. If the number of integers exceed the size, the stack should
	automatically grow to accommodate the new element.
*/

import java.util.*;	// Importing java util library for arraylist.

interface Stack {
	void push (int i);
	int pop();
	int peek();
}

class FixedStack implements Stack {	// class FixedStack to implement fixed depth stack.
	int capacity;
	int top = -1;	
	int j;
 	int arr[];	// Declare array arr

	public FixedStack(int i){	// Constructor to set the depth of array.
		capacity = i;
		arr = new int[i];	// setting the depth of array to value received from console.
	}

	@Override
	public void push(int i){	// method to push element into stack
		if (top < capacity - 1){
			top++;
			arr[top] = i;
			System.out.print("[");
			for (int j = top; j >= 0; j--)
			{
				System.out.print(" " + arr[j] + " ");
			}
			System.out.println("]");
		} else {
		System.out.println("Stack Overflow!");
		}
	}	

	@Override
	public int pop(){	// method to pop element out of stack
		if (top >= 0){
			System.out.print("[");
			for (int j = top; j >= 0; j--)
			{
				System.out.print(" " + arr[j] + " ");
			}
			System.out.println("]");
			return top--;
		} else {
			System.out.println("Stack Underflow!");
			return 0;
		}
	}

	@Override
	public int peek(){	// method to locate the current item on top of stack.
		if (top >= 0){
			System.out.println("[");
			for (int j = top; j >= 0; j--)
			{
				System.out.print(" " + arr[j] + " ");
			}
			System.out.println("]");
			return top;
		} else {
			System.out.println("Empty Stack!");
			return 0;
		}
	}

}

class VariableStack implements Stack {	// class VariableStack to implement variable length array. Using ArrayList inbuilt utility in Java.

	ArrayList<Integer> al;
	int vs_pos = 0;

	public VariableStack(int f){	// Though arraylist can take more than declared size however this constructor will set its size.
		al = new ArrayList<Integer>(f);
	}

	@Override
	public void push(int i){
		al.add(vs_pos, i);
		System.out.println("Element added in array: " + al);
		vs_pos++;
	}

	public int pop(){
		al.remove(0);
		System.out.println("Element removed! Now array is: " + al);
		return vs_pos--;
	}

	@Override
	public int peek(){
		System.out.println("Top element in variable stack is " + al.get(0));
		return 0;		
	}

}

class StackDemo {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("     FIXED STACK EXAMPLE     ");
		System.out.println("-----------------------------");
		System.out.print("Enter the fixed stack depth: ");
		int d = Integer.parseInt(System.console().readLine());
  		FixedStack fs = new FixedStack(d);
		fs.peek();
		fs.push(10);
		fs.push(20);
		fs.push(30);
		fs.push(40);	// E.g. if depth is 3 but pushing 4th element then it will cause overflow.
		fs.pop();
		fs.pop();
		fs.pop();
		fs.pop();
//
		System.out.println("-----------------------------");
		System.out.println("    VARIABLE STACK EXAMPLE   ");
		System.out.println("-----------------------------");
		System.out.print("Enter the variable stack depth: ");
		int f = Integer.parseInt(System.console().readLine());
		VariableStack vs = new VariableStack(f);
		vs.push(10);
		vs.push(20);
		vs.push(30);
		vs.push(40);
		vs.peek();
		vs.pop();
		vs.peek();
		vs.pop();
		vs.peek();
		vs.push(50);
 	}
}
// End of program!