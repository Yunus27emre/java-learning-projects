
public class TRYstack {

	public static void main(String[] args) {
		Stack train=new Stack(5);
		
		train.push("f");
		train.push(7);
		train.push(5);
		train.push('*');
		train.push('$');
		System.out.println(train.peek());
		System.out.println(train.pop());
		System.out.println(train.pop());
		train.push(8);
		train.push(0);
		train.push(4);
		
	}

}
