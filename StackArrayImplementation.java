package linear;

public class StackArrayImplementation {
	int top;        // top
	int capacity;   // size
	int stack[];    // array name
	StackArrayImplementation(){
		top=-1;
		capacity=10;
		stack=new int[capacity];
	}
	public boolean isempty() {
		return top==-1;
	}
	public boolean isfull() {
		return top==capacity-1;
	}
	public int push(int data) {
		return stack[]++top]=data;
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
