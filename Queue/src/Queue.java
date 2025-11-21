package queuemain;

public class Queue {

	int rear, front;
	Object[] array;

	Queue(int capacity) {
		array = new Object[capacity];
		front = 0;
		rear = -1;
	}

	void enqueue(Object data) {

		if (isFull()) {
			System.out.println("Queue is full.");
		} else {
			if(rear==array.length-1) {
				rear=0;
			}else {
				rear++;
			}
			
			array[rear]=data;
		}
	}

	Object dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		} else {
			Object temp = array[front];
			if(front==rear) {
				front=0;
				rear=-1;
			}else if(front==array.length-1) {
				front=0;
			}else {
				front++;
			}
			return temp;
		}
		
	}
	Object peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		} else {
			return array[front];
		}
	}
	int size() {
		if(isEmpty()) {
			return 0;
		}else if(front<=rear) {
			return rear-front+1;
		}else {
			return array.length-front+rear+1;
		}
	}

	boolean isEmpty() {
		return rear == -1;
	}

	boolean isFull() {
		if(rear!=-1&&((front==0&&rear == array.length - 1)||front==rear+1)) {
			return true;
		}else {
			return false;
		}
		
	}
}
