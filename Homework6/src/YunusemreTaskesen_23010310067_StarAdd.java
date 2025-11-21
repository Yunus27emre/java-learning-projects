import java.util.ArrayList;
public class YunusemreTaskesen_23010310067_StarAdd {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("Pencil");
		words.add("Computer");
		words.add("Book");
		words.set(0, words.get(0).toUpperCase());
		System.out.println(words.toString());
		for(int index=0;index<words.size();index+=2) {
			words.add(index,"*");
			System.out.println(words.toString());
			//p c b > words size>3 index 0
			//*pcb>word size>4 index 1
			//**pcb>word size>5 index 2 if index+=2
			//*pcb words=4 index=2
			//*p*cb words=5 index=4
			//*p*c*b words=6 index=6 loop finish
		}
		System.out.println(words.toString());
		for(int index=0;index<words.size();index++) {
			words.remove(index);
			//*p*c*b words=6 index=0
			//p*c*b words=5 index=1
			//pc*b words=4 index=2
			//pcb words=3 index=3
			//star deleted
			System.out.println(words.toString());
		}
		System.out.println(words.toString());
		System.out.println("Array to words length: "+words.size());
	}

}
