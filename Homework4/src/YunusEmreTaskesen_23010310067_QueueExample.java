import java.util.LinkedList;
import java.util.Queue;
public class YunusEmreTaskesen_23010310067_QueueExample {
	public static void main(String[] args) {
		 String[] data= {"Adıyaman","Çankırı","İstanbul","Ankara","Samsun"};
		Queue<String> queue =new LinkedList<String>();
		System.out.println(queue.isEmpty());
		queue.add("Van");
		System.out.println("Queue : "+queue);
		
		for(String bald: data) {
			queue.add(bald);
		}
		System.out.println("Queue : "+queue);
		System.out.println("Queue size : "+queue.size());
		System.out.println("Queue peek : "+queue.peek());
		System.out.println("Queue : "+queue);

		while(!queue.isEmpty()) {
			System.out.print(queue.remove()+" ");
		}
	}
}
