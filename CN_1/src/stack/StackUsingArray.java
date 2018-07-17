package stack;

public class StackUsingArray {
	private int data[];
	private int top;// index of topmost element of stack

	public StackUsingArray() {
		// TODO Auto-generated constructor stub
		data = new int[10];
		top = -1; // empty
	}

	public StackUsingArray(int size) {
		// TODO Auto-generated constructor stub
		data = new int[size];
		top = -1; // empty
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return top + 1;
	}

	public int top() throws StackEmptyException {
		if (isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		} else {
			return data[top];
		}
	}

	public void push(int ele) throws StackFullException {
		if (size() >= data.length) {
			// Stack Full
			// StackFullException e = new StackFullException();
			// throw e;
			doubleCapacity();
		}

		top++;
		data[top] = ele;

	}

	public int pop() throws StackEmptyException {
		if (isEmpty()) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		} else {
			int num = data[top];
			top--;
			return num;
		}
	}

	private void doubleCapacity() {
		int temp[] = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = new int[data.length*2];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
}
