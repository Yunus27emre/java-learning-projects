
public class YunusEmreTaskesen_23010310067_ListNodeMain {

	public static void main(String[] args) {
		
		ListNode list=new ListNode();
		list.data=3;
		list.next=new ListNode();
		list.next.data=7;
		list.next.next=new ListNode();
		list.next.next.data=2;
		list.next.next.next=null;
		System.out.println(list.data+" "+list.next.data+" "+list.next.next.data);
		ListNode current=list;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}

}
