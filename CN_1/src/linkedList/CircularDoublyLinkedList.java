package linkedList;

public class CircularDoublyLinkedList<T> {
	public T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public CircularDoublyLinkedList<T> next;
	public CircularDoublyLinkedList<T> prev;
	
	
}
