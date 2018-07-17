package Queue;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray(){
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
		
	}

	public QueueUsingArray(int size) {
		data = new int[size];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int front() throws QueueEmptyException{
		if(isEmpty()){
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enqueue(int ele) {
		if(size==data.length){
			doubleCapacity();
		}
		
		if(size==0){
			front = 0;
		}
		rear = (rear + 1)%data.length;
//		rear++;
		size++;
//		if(rear==data.length){
//			rear = 0;
//		}
		data[rear] = ele;
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp [] = data;
		data = new int[2*temp.length];
		int index = 0;
		for(int i = front; i<temp.length;i++){
			data[index] = temp[i];
			index++;
		}
		for(int i = rear ;i<front-1;i++){
			data[index] = temp[i];
			index++;
		}
		
		front = 0;
		rear = temp.length-1;
		
	}

	public int dequeue() throws QueueEmptyException{
		if(size==0){
			throw new QueueEmptyException();
			
		}
		
		int temp = data[front];
		front = (front + 1)% data.length;
		size--;
		if(size==0){
			front = -1;
			rear = -1;
		}
		return temp;
		
	}
	
	
	
	
	
	

}
