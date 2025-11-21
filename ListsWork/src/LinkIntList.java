
public class LinkIntList {
	ListNode front;

	public void add(int index, int value) {
		if (front == null || index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = front;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = new ListNode(value, current.next);
		}
	}

	public void addShorted(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null && current.next.data < value) {
				current = current.next;
			}
			current.next = new ListNode(value, current.next);
		}
	}

	public void remove(int index) {
		if (front != null && index == 0) {
			front = front.next;
		}
		ListNode current = front;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		current.next = current.next.next;

	}

	public String toString() {
		System.out.print("[");
		ListNode current = front;
		while (current != null) {
			if (current.next != null)
				System.out.print(current.data + ", ");
			else
				System.out.print(current.data + "");
			current = current.next;
		}
		System.out.print("]");
		return null;

	}

	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}

	public int getDecimalValue() {
		int size = -1;
		ListNode current1 = front;
		while (current1 != null) {
			current1 = current1.next;
			size++;
		}
		ListNode current = front;
		int sum = 0;
//		int anlık = 0;
		if(size<0) {
			return size;
		}else {
		for (int i = size; i >= 0; i--) {
			int anlık = (int) (current.data * Math.pow(2, i));
			sum += anlık;
			current = current.next;
		}}

		return sum;
	}

	public void removeRange(int start, int finish) {
		ListNode current = front;
		int size = -1;
		while (current != null) {
			current = current.next;
			size++;
		}
		if (0 <= start && start <= finish && finish <= size) {
			ListNode current1 = front;
			for (int i = 0; i < start - 1; i++) {
				current1 = current1.next;
			}
			for (int i = 0; i <= finish - start; i++) {
				current1.next = current1.next.next;
			}
		} else {
			System.out.println("Hatalı indeksleme");
		}
	}
	public void reverse() {
		int index=-1;
		ListNode current1=front;
		while(current1!=null) {
			current1=current1.next;
			index++;
		}
		ListNode current2=front;
		while(current2.next!=null) {
//			front=new ListNode(current2.data);
			current1=new ListNode(current2.data);
			current2=current2.next;
//			current1=current1.next;

		}
		for(int i=0;i<index;i++) {
			front=front.next;
		}
	}

}
