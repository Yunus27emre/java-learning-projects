import java.util.Stack;
public class YunusEmreTaskesen_23010310067_StackExample {
	public static void main(String[] args) {
		
		String[] data= {"Zonguldak","Gaziantep","Kahramanmaraş","Şanlıurfa"};
		Stack<String> stack=new Stack<String>();
		stack.push("Ankara");
		stack.push("Malatya");
		System.out.println("Stack : "+stack);
		
		for(String word:data) {
			stack.push(word);
		}
		System.out.println("Stack : "+stack);
		System.out.println("Stack size : "+stack.size());
		System.out.println("Stack peek : "+stack.peek());
		System.out.println("Stack : "+stack);
		System.out.println("Stack pop : "+stack.pop());
		System.out.println("Stack : "+stack);

		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");
		}
		
	}
}
