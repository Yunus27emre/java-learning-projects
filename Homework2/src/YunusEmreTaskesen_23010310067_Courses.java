import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class YunusEmreTaskesen_23010310067_Courses {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input=new Scanner(new File("Courses.txt"));
		Set<String> dersler=new TreeSet<String>();
		dersler=read(input);
		
		for(String ders:dersler) {
			System.out.println(ders);
			
		}
		System.out.println(dersler.size());
		
	}

	public static Set<String> read(Scanner in) {
		Set<String> dersler=new TreeSet<String>();
		
			while(in.hasNext()) {
				dersler.add(in.nextLine());
			}
		
    	return dersler;
	}

}
