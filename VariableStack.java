package mypack;

class VariableStack implements Stack {

	int varr[];
	int tos=-1;
	
	public VariableStack (int size){
		varr = new int[size];	
	}

	public void push(int item) {
		if (tos == varr.length - 1){
			int temp[] = new int[varr.length*2];
			for(int i=0; i<varr.length; i++) {temp[i] = varr[i];}
			varr = temp;
			varr[++tos] = item;
			System.out.println("Added: " + item + " [Stack depth modified]");		
		} else {		
			varr[++tos] = item;
			System.out.println("Added: " + item);		
		}
	}

	public int pop(){
		if (tos < 0){
			System.out.println("Stack Underflow!");
			return 0;
		} else {
			return varr[tos--];
		}
	}
}