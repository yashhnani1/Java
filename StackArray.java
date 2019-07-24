 package linear;

class StackOverFlowException extends Exception {
	StackOverFlowException(String str) {
		super(str);
	}
}
class StackUnderflowException extends Exception {
	public StackUnderflowException(String s) {
		super(s);
	}
}

class StackExample {
	int stack[] = new int[3];  
	int currentposition = 0;

	public void push(int element) throws StackOverFlowException {
		if (currentposition >= stack.length) {
			StackOverFlowException se = new StackOverFlowException("stack array limit reached");
			throw se;
		}
		stack[currentposition] = element;
		currentposition++;
		System.out.println(element);
	}

	public void pop() throws StackUnderflowException{
		if(currentposition == 0) {
			StackUnderflowException su = new StackUnderflowException("stack under flow");
			throw su;
		}
		currentposition--;
		int element = stack[currentposition];
		System.out.println(element);
	}

}

public class StackArray {

	public static void main(String[] args) {
		StackExample se = new StackExample();
		try {
			se.push(10);
			se.push(100);
			se.push(1000);
			se.push(200);
		} catch (StackOverFlowException se1) {
			se1.printStackTrace();
			System.out.println(se1.getMessage());
		}
		try {
			se.pop();
			se.pop();
			se.pop();
			se.pop();
		} catch (StackUnderflowException su) {
			System.out.println(su.getMessage());
		}
	}
}
