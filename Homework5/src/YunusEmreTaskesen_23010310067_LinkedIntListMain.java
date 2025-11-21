
public class YunusEmreTaskesen_23010310067_LinkedIntListMain {

	public static void main(String[] args) {
		LinkedIntList LinkedList = new LinkedIntList();
		System.out.println(LinkedList.size());
		LinkedList.add(3);
		LinkedList.add(5);
		System.out.println(LinkedList.size());
		System.out.println(LinkedList.get(0));
		LinkedList.add(7);
		LinkedList.add(13);
		LinkedList.add(17);
		LinkedList.add(71);
		LinkedList.add(53);
		System.out.println(LinkedList);
		System.out.println("index : " + LinkedList.indexOf(13));
		LinkedList.add(0, 25);
		System.out.println(LinkedList);
		LinkedList.add(2,0);
		System.out.println(LinkedList);	
		LinkedList.remove(0);
		System.out.println(LinkedList);
		LinkedList.remove(3);
		System.out.println(LinkedList);
		LinkedList.removeRange(3,3);
		System.out.println(LinkedList);
		LinkedList.reverse();
		System.out.println(LinkedList);



//		System.out.println(LinkedList.toString());
//		System.out.println(LinkedList.toString());
//
//		System.out.println(LinkedList.toString());

	}

}
