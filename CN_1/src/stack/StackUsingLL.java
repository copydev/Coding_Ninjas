package stack;

import linkedList.Node;

public class StackUsingLL<T> {

	private Node<T> head;
	private int size;

	public StackUsingLL() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public T top() throws StackEmptyException{
		if(size==0){
//			StackEmptyException e =new StackEmptyException();
//			throw e;
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public boolean isEmpty(){
//		 if(size==0){
//		        return true;
//		      }
//		      else{
//		        return false;
//		      }
		
		return size==0;
	}
	
	public void push(T ele){
		  Node<T> temp = new Node<>(ele);
	      temp.next = head;
	      head = temp;
	      size++;
		
	}
	
	public T pop()throws StackEmptyException{
		 if(size==0){
//		        StackEmptyException e = new StackEmptyException();
//		        throw e;
			 	throw new StackEmptyException();
			 	
		      }
		      else{
		        T num = head.data;
		        head = head.next;
		        size--;
		        return num;
		      }
		
	}
	
	
	
	

}
