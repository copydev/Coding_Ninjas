package Queue;

import linkedList.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	
	int size;
	
	public QueueUsingLL(){
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public T front() throws QueueEmptyException{
		if(size==0){
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public void enqueue(T data){
		Node<T> newNode = new Node<>(data);
		if(size==0){
			
			front = newNode;
			rear = newNode;
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException{
		if(size==0){
			throw new QueueEmptyException();
		}
		else{
			Node<T> newNode = front;
			front = front.next;
			size--;
			return newNode.data;
		}
	}
	
	

}
