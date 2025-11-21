import java.util.ArrayList;
public class YunusemreTaskesen_23010310067_KisiMain {
	public static void main(String[] args) {
		
		Kisi k1= new Kisi("Ahmet",27);
		System.out.println(k1.getName());
		ArrayList<Kisi> persons=new ArrayList<Kisi>();
		persons.add(k1);
		
		System.out.println(persons.get(0).getAge());
		persons.add(new Kisi("Yunus",20));
		persons.add(0,new Kisi("Kadir",22));
		System.out.println("****PERSONS****");

		for(int index=0;index<persons.size();index++) {
			String name=persons.get(index).getName();
			int age=persons.get(index).getAge();
			System.out.println("Name: "+name +" Age: "+age );
		}
		System.out.println("****PERSONS****");

		for(Kisi person:persons) {
			System.out.println("Name: "+person.getName()+" Age:"+person.getAge());
		}
	}
}
