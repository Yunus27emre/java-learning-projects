import java.util.Scanner;
import java.util.Stack;
public class YunusEmreTaskesen_23010310067_StackPalindrome {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir kelime giriniz.");
		String word=input.nextLine();
		Stack stack=new Stack();
		
		for(int i=0;i<word.length();i++) {
			stack.push(word.charAt(i));
			
		}
		System.out.println("Stack : "+stack);
		String reverseword="";
		while(!stack.isEmpty()) {
			reverseword=reverseword+stack.pop();       // word abc  stack cba reverse cba      
		}
		
		if(word.equals(reverseword)) {
			System.out.println("Girilen kelime bir polindromdur.");
		}else {
			System.out.println("Girilen kelime bir polindrom değildir.");
		}
	}
	
}
