import java.util.Stack;

public class YunusEmreTaskesen_23010310067_ParantezKontrol {

	public static void main(String[] args) {

		String expr = " ";
		
		if(düzenliMi(expr)) {
			System.out.println("DÜzenli ifade.");
		}else {
			System.out.println("DÜzenli ifade değil.");
		}
		
	}

	public static boolean düzenliMi(String word) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < word.length(); i++) {
			char z = word.charAt(i);
			if (z == '(' || z == '[' || z == '{') {
				stack.push(z);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char check;
			switch (z) {
			case ')':
				check = stack.pop();
				if (check == '[' || check == '{')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			case '}':
				check = stack.pop();
				if (check == '[' || check == '{')
					return false;
				break;
			}

		}
		return stack.isEmpty();
	}

}
