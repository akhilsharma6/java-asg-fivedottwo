/* Assignment 5.2 : Create an interface Stack in package myPack with following methods
	Methods:
	• void push(int i)
	• int pop()

	Create two sub classes inheriting the Stack interface.
	class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
	in the constructor. If the number of integers exceed the size, “Stack overflow” message should be
	displayed.

	class VariableStack that can accept numbers more than its size. The size of the Stack will be
	specified in the constructor. If the number of integers exceed the size, the stack should
	automatically grow to accommodate the new element.
*/
package mypack;

class StackRun {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("     FIXED STACK EXAMPLE     ");
		System.out.println("-----------------------------");
		System.out.print("Enter the fixed stack depth (below 10): ");
		int f = Integer.parseInt(System.console().readLine());
  		FixedStack fs = new FixedStack(f);
		for (int i=1; i <= 10; i++){
			fs.push(i);
		}
//		Code to display fixed stack items
		System.out.println("\nDisplay the FixedStack elements");
		for (int i=1; i <= 10; i++){
			System.out.println(fs.pop());
		}
//
		System.out.println("-----------------------------");
		System.out.println("   VARIABLE STACK EXAMPLE    ");
		System.out.println("-----------------------------");
		System.out.print("Enter the variable stack depth (below 10): ");
		int v = Integer.parseInt(System.console().readLine());
  		VariableStack vs = new VariableStack(v);
		for (int i=1; i <= 10; i++){
			vs.push(i);
		}
//		Code to display variable stack items.
		System.out.println("\nDisplay the VariableStack elements");
		for (int i=1; i <= 10; i++){
			System.out.println(vs.pop());
		}
	}
}
// End of program!