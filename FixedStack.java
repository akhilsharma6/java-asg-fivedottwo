package mypack;

public class FixedStack implements Stack {

	int farr[];
	int tos=-1;
	
	public FixedStack (int size){
		farr = new int[size];	
	}

	public void push(int item){
		if (tos == farr.length - 1){
			System.out.println("Stack Overflow!");
		} else {		
			farr[++tos] = item;
			System.out.println("Added :" + item);
		}
	}

	public int pop(){
		if (tos < 0){
			System.out.println("Stack Underflow!");
			return 0;
		} else {
			return farr[tos--];
		}
	}
}