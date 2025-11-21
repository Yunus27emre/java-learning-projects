import java.util.Collections;
import java.util.ArrayList;

public class YunusemreTaskesen_23010310067_Fruits {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		list.add("Elma");
		list.add("Portakal");
		System.out.println(list.toString());
		list.add(1, "Muz");
		System.out.println(list.toString());

		System.out.println(list.contains("Elma"));
		System.out.println(list.get(1));
		System.out.println(list.get(list.size() - 1));
		list.set(0, "ARMUT");
		System.out.println(list.toString());
		System.out.println(list.isEmpty());
		// list.clear();
		// System.out.println(list.toString());

		for (int index = 0; index < list.size(); index++) {
			String value = list.get(index);
			System.out.println(value);

		}
		for (String fruit : list) {
			System.out.println(fruit);
		}
		Collections.sort(list);
		System.out.println(list.toString());

		list.clear();
		System.out.println(list.toString());
	}
}
