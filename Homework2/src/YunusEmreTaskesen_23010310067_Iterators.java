import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class YunusEmreTaskesen_23010310067_Iterators {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		
		names.add("Ahmet");
		names.add("Kerim");
		names.add("Osman");
		names.add("Rafık");
		int sayi1=names.size();
		int sayi2=names.size();

		Iterator<String> iterator=names.iterator();
		
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println(name);
			
			if(name.equals("Rafık")) {
				iterator.remove();
				sayi2--;
			}
		}
		if(sayi2<sayi1) {
		System.out.println("Koleksiyondan 'Rafık' elemanı kaldırıldı.");
		}
		System.out.println("*****GÜNCEL KOLEKSİYON*****");
	for(String name:names) {
		System.out.println(name);
	}	
	}

}
