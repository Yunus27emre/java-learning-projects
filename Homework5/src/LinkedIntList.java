
public class LinkedIntList {
	ListNode front;

	LinkedIntList() {
		front = null;
	}

	public void add(int value) {
		if (front == null)
			front = new ListNode(value);
		else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}

	public int size() {
		ListNode current = front;
		int count = 0;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	public ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;

	}

	public int get(int index) {

		return nodeAt(index).data;
	}

	public int indexOf(int value) {
		ListNode current = front;
		int index = 0;
		while (current != null) {
			if (current.data == value) {
				return index;
			} else {
				current = current.next;
				index++;
			}
		}
		return -1;
	}

	public void reverse() {
		ListNode current = front;
		ListNode previous = null;
		while (current != null) {
			ListNode nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;

		}
		front = previous;
	}

	public void removeRange(int start, int end) {
		if (start < 0 || end < 0) {
			throw new IllegalArgumentException();
		} else if (start == 0) {
			for (int i = 0; i <= end; i++) {
				front = front.next;
			}
		} else {
			ListNode current = front;
			for (int i = 1; i < start; i++) {
				current = current.next;
			}
			ListNode current1 = current.next;
			for (int i = start; i < end; i++) {
				current1 = current1.next;
			}
			current.next = current1.next;
		}
	}

	public void remove(int index) {
		if (index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}

	public void add(int index, int value) {
		if (index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = new ListNode(value, current.next);
		}

	}

	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}

	}
}
