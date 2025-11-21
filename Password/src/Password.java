import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String pass="Crazyboy";
		System.out.println("Enter your password:");
		
		String person=scan.nextLine();
		if(pass.equals(person))
			System.out.println("Corrent.");
		else 
			System.out.println("False.");
	}

}
