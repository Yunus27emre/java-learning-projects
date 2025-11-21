package queuemain;

public class QueueMain {

	public static void main(String[] args) {

		 Queue q = new Queue(5);
		 q.enqueue(10);
		 q.enqueue(20);
		 q.enqueue(30);
		 q.enqueue(40);    
		 q.enqueue(30);
		 q.enqueue(40);    
		System.out.println(q.peek());   
		System.out.println(q.size());     
		System.out.println(q.dequeue());
		 System.out.println(q.size());
		 q.enqueue(60);
		 q.enqueue(70);    
		 System.out.println(q.peek());   
			System.out.println(q.size());     
			System.out.println(q.dequeue());
			 System.out.println(q.size());
		}
		 
	}


