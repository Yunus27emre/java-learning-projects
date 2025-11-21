import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;
public class YunusEmreTaskesen_23010310067_Iterator2 {

	public static void main(String[] args) {
		Map<String,Integer> scores =new TreeMap<String,Integer>();
		scores.put("Ayşe", 56);
		scores.put("Ali", 89);
		scores.put("Osman", 35);
		scores.put("Yunus", 99);
		
		Iterator<String> itr=scores.keySet().iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			int score=scores.get(name);
			System.out.println(name+" "+score);
			
			if(score<60) {
				itr.remove();
			}
			
		}
		System.out.println(scores);
		
	}

}
