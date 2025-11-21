import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class YunusEmreTaskesen_23010310067_Sets {
	public static void main(String[] args) {
		Set<String> cities = new HashSet<String>();
		System.out.println(cities.isEmpty());
		cities.add("Gaziantep");
		cities.add("Şanlıurfa");
		cities.add("Adana");
		cities.add("Kahramanmaraş");
		System.out.println(cities.size());
		System.out.println(cities.toString());
		System.out.println(cities.contains("Gaziantep"));
		
		Set<String> cities2 = new TreeSet<String>();
//		cities2.addAll(cities);
		cities2.add("Manisa");
		cities2.add("Hatay");
		cities2.add("Ankara");
		System.out.println(cities2.toString());
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Adıyaman");
		list.add("Kars");
		list.add("Bayburt");
		System.out.println(list.get(0));
		System.out.println(list.toString());
		
		cities2.addAll(list);
		System.out.println(cities2.toString());
		
		cities.addAll(list);
		System.out.println(cities.toString());
		
		cities2.addAll(cities);
		System.out.println(cities2.toString());
		
		for(String cities3 : cities2) {
			System.out.println(cities3);
		}

	}
}
