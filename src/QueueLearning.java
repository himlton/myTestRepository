import org.apache.commons.lang3.ArrayUtils;

public class QueueLearning {

	int front;
	int rear;
	int capacity;
	int queue[];
	int arrayCount;

	public QueueLearning(int size) {
		// TODO Auto-generated constructor stub
		front = 0;
		rear = -1;
		arrayCount = 0;
		this.capacity = size;
		queue = new int[this.capacity];
		System.out.println(queue.length);
	}

	public void enqueue(int value) {
		if(arrayCount == queue.length)
			System.out.println("Queue is full and can't accept any more data");
		else
		{
			rear++;
			arrayCount++;
			queue[rear]= value;
			System.out.println(value + " has been added into queue");
		}
		
	}

	public void dequeue() {
		if(arrayCount == 0) {
			System.out.println("Queue is empty so can't take more data out");
		}
		else {
			int frontValue = front;
			front++;
			arrayCount--;
			System.out.println(queue[frontValue] + " has been deleted from the queue");
			ArrayUtils.remove(queue, frontValue);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLearning queueLearning = new QueueLearning(10);
		queueLearning.enqueue(10);
		queueLearning.enqueue(20);
		queueLearning.enqueue(30);
		queueLearning.dequeue();
		queueLearning.enqueue(40);
		queueLearning.enqueue(50);
		queueLearning.enqueue(60);
		queueLearning.enqueue(70);
		queueLearning.dequeue();
		queueLearning.enqueue(80);
		queueLearning.enqueue(90);
		queueLearning.enqueue(100);
		queueLearning.dequeue();
		queueLearning.dequeue();
	}

}
