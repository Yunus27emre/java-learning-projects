import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class YunusEmreTaskesen_23010310067_QueuePalindrome {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz.");
		String word=input.nextLine();
		Queue queue=new LinkedList();
		
		for(int i=word.length()-1;i>=0;i--) {
			queue.add(word.charAt(i));
			
		}
		String reverseword="";
		
		while(!queue.isEmpty()) {
			reverseword=reverseword+queue.remove();
		}
	
		if(reverseword.equals(word)) {
			System.out.println("Girilen kelime bir polindromdur.");
		}else {
			System.out.println("Girilen kelime bir polindrom değildir.");
		}
	
	
	}
	
}
