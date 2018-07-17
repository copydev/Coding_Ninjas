package Queue;

public class QueueUse {
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray();
		for (int i = 1; i <= 10; i++) {
			queue.enqueue(i);
		}

//		while (!queue.isEmpty()) {
//			try {
//				System.out.println(queue.dequeue());
//			} catch (QueueEmptyException e) {
//
//			}
//		}
		
		queue.enqueue(4);
	}

}
