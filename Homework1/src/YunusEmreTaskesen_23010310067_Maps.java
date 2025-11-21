import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class YunusEmreTaskesen_23010310067_Maps {
	public static void main(String[] args) {
		
		Map<String,String> consultants = new HashMap<String,String>();
		consultants.put("Yunus Emre Taşkesen","Beden Eğitimi");
		System.out.println(consultants.size());
		System.out.println(consultants.toString());
		consultants.put("İbrahim Halil Çolak", "Muhasebe");
		consultants.put("Yunus Emre Taşkesen","Yazılıma Giriş");
		System.out.println(consultants.toString());
		
		Map<String,Set<String>> consultant = new TreeMap<String,Set<String>>();
		consultant.put("Yunus Emre Taşkesen",new HashSet<String>());
		System.out.println(consultant.toString());
		consultant.get("Yunus Emre Taşkesen").add("Beden Eğitimi");
		consultant.get("Yunus Emre Taşkesen").add("Yazılıma Giriş");
		consultant.get("Yunus Emre Taşkesen").add("Matematik");
		consultant.get("Yunus Emre Taşkesen").add("Fizik");
		
		Set<String> list = new TreeSet<String>();
		list.add("Muhasebe");
		list.add("İktisat");
		list.add("Beden Eğitimi");
		
		consultant.put("İbrahim Halil Çolak", list);
		System.out.println(consultant);
//		System.out.println(consultant.get("İbrahim Halil Çolak"));
		
		for(String key:consultants.keySet()) {
			System.out.println(key);
		}
		for(String value: consultants.values()) {
			System.out.println(value);
		}
		for(Set value:consultant.values()) {
			System.out.println(value.toString());
//			System.out.println(value);
		}
		
		
	}
}
