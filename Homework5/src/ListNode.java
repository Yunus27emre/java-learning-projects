
public class ListNode {
	int data;
	ListNode next;

	ListNode() {
		this(0, null);
	}

	ListNode(int data) {
		this(data, null);
	}

	ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}
